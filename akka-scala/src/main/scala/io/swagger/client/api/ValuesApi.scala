/**
 * Hello World
 * This is the simplest possible API to enable AFA to do Hello World tests through the firewall. [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: Api.management@afaforsakring.se
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ValuesApi {

  /**
   * call this
   * 
   * Expected answers:
   *   code 200 :  (Hello World)
   *   code 0 :  (Hello World)
   */
  def getHelloWorld(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "http://pswaggerhub.domain.se/virts/Afa_forsakring_Org/HelloWorld/1.0.0", "/values/5", "application/json")
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[Unit]
        /**
   * call this
   * 
   * Expected answers:
   *   code 200 :  (Hello World)
   *   code 0 :  (Hello World)
   */
  def getHelloWorldInArray(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "http://pswaggerhub.domain.se/virts/Afa_forsakring_Org/HelloWorld/1.0.0", "/values", "application/json")
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[Unit]
      

}

