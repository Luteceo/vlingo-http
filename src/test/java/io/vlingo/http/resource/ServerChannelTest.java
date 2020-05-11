// Copyright © 2012-2020 VLINGO LABS. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.http.resource;

import io.vlingo.http.resource.Configuration.Sizing;
import io.vlingo.http.resource.Configuration.Timing;

public class ServerChannelTest extends ServerTest {

  @Override
  protected Server startServer() {
    System.out.println(">>>>>>>>>>>>>>>>>>>>> ServerChannelTest");

    // tests using ServerRequestResponseChannel have
    // intermittent failures on Travis-CI
    if (System.getProperty("GITHUB_TOKEN", null) != null) {
      skipTests = true;
    }

    return Server.startWith(world.stage(), resources, serverPort, new Sizing(1, 1, 100, 10240), new Timing(1, 1, 1000));
  }
}
