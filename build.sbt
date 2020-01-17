
/* =========================================================================================
 * Copyright © 2013-2017 the kamon project <http://kamon.io/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 * =========================================================================================
 */

name := "kamon-newrelic-reporter"
version := "0.0.2-SNAPSHOT"
description := "New Relic Kamon Reporter"

scalaVersion := "2.13.0"
crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.2")

resolvers += Resolver.mavenLocal
resolvers += Resolver.bintrayRepo("kamon-io", "snapshots")

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "2.0.1",
  "com.newrelic.telemetry" % "telemetry" % "0.3.2",
  "com.newrelic.telemetry" % "telemetry-http-okhttp" % "0.3.2",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "org.mockito" % "mockito-core" % "3.1.0" % "test",
  "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.3"
)
