# vlingo-http

[![Javadocs](http://javadoc.io/badge/io.vlingo/vlingo-http.svg?color=brightgreen)](http://javadoc.io/doc/io.vlingo/vlingo-http) [![Build Status](https://travis-ci.org/vlingo/vlingo-http.svg?branch=master)](https://travis-ci.org/vlingo/vlingo-http) [ ![Download](https://api.bintray.com/packages/vlingo/vlingo-platform-java/vlingo-http/images/download.svg) ](https://bintray.com/vlingo/vlingo-platform-java/vlingo-http/_latestVersion) [![Gitter chat](https://badges.gitter.im/gitterHQ/gitter.png)](https://gitter.im/vlingo-platform-java/http)

The vlingo/PLATFORM reactive, scalable, and resilient HTTP server supporting RESTful services running on vlingo/cluster and vlingo/actors.

### Bintray

```xml
  <repositories>
    <repository>
      <id>jcenter</id>
      <url>https://jcenter.bintray.com/</url>
    </repository>
  </repositories>
  <dependencies>
    <dependency>
      <groupId>io.vlingo</groupId>
      <artifactId>vlingo-http</artifactId>
      <version>1.2.5</version>
      <scope>compile</scope>
    </dependency>
  </dependencies>
```

```gradle
dependencies {
    compile 'io.vlingo:vlingo-http:1.2.5'
}

repositories {
    jcenter()
}
```

### Usage

Reactive, scalable, and resilient HTTP servers and RESTful services running on vlingo/cluster and vlingo/actors.

1. Feature complete
  * Fully actor-based asynchronous requests and responses.
  * Request handling is resource based.
  * Requests that require message body content are auto-mapped to simple Java objects.
  * Supports Media Types, Filters, Server-Sent Events
2. To run the Server:
  * [Use Server#startWith() to start the Server actor](https://github.com/vlingo/vlingo-http/blob/master/src/main/java/io/vlingo/http/resource/Server.java)
  * The light-qualityFactor Server is meant to be run inside vlingo/cluster nodes the require RESTful HTTP support.
3. See the following for usage examples:
  * [vlingo/http properties file](https://github.com/vlingo/vlingo-http/blob/master/src/test/resources/vlingo-http.properties)
  * [The user resource sample](https://github.com/vlingo/vlingo-http/blob/master/src/main/java/io/vlingo/http/sample/user/UserResource.java)
  * [The user profile resource sample](https://github.com/vlingo/vlingo-http/blob/master/src/main/java/io/vlingo/http/sample/user/ProfileResource.java)

License (See LICENSE file for full license)
-------------------------------------------
Copyright © 2012-2020 VLINGO LABS. All rights reserved.

This Source Code Form is subject to the terms of the
Mozilla Public License, v. 2.0. If a copy of the MPL
was not distributed with this file, You can obtain
one at https://mozilla.org/MPL/2.0/.
