/*************************************************************************
 * CONFIDENTIAL
 * __________________
 *
 * [2016] All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of {The Company} and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to {The Company}
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from {The Company}.
 */
package com.nannyband.nannyband.data.location;

import com.firebase.client.Firebase;
import com.nannyband.nannyband.data.common.gps.GPS;
import com.nannyband.nannyband.data.location.service.LocationService;
import dagger.Module;
import dagger.Provides;

@Module public class BandLocationModule {
  @Provides public BandLocation bandLocation(GPS gps, LocationService service) {
    return new DefaultBandLocation(gps, service);
  }

  @Provides public LocationService locationService(Firebase firebase) {
    return new FirebaseLocationService(firebase);
  }
}
