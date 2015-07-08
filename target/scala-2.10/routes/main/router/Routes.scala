
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/MyLearnings/Play/PlayTutorial/EKart/conf/routes
// @DATE:Wed Jul 08 11:15:55 IST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:8
  CustomerController_2: controllers.CustomerController,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:8
    CustomerController_2: controllers.CustomerController,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, CustomerController_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, CustomerController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newcustomer""", """controllers.CustomerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/customers/all""", """controllers.Application.getAllCustomers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/customers/save""", """controllers.CustomerController.saveCustomer()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/customers/delete""", """controllers.CustomerController.deleteCustomer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CustomerController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newcustomer")))
  )
  private[this] lazy val controllers_CustomerController_index1_invoker = createInvoker(
    CustomerController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """newcustomer"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_getAllCustomers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/customers/all")))
  )
  private[this] lazy val controllers_Application_getAllCustomers2_invoker = createInvoker(
    Application_1.getAllCustomers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllCustomers",
      Nil,
      "GET",
      """""",
      this.prefix + """api/customers/all"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CustomerController_saveCustomer3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/customers/save")))
  )
  private[this] lazy val controllers_CustomerController_saveCustomer3_invoker = createInvoker(
    CustomerController_2.saveCustomer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "saveCustomer",
      Nil,
      "POST",
      """""",
      this.prefix + """api/customers/save"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CustomerController_deleteCustomer4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/customers/delete")))
  )
  private[this] lazy val controllers_CustomerController_deleteCustomer4_invoker = createInvoker(
    CustomerController_2.deleteCustomer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "deleteCustomer",
      Nil,
      "POST",
      """""",
      this.prefix + """api/customers/delete"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:8
    case controllers_CustomerController_index1_route(params) =>
      call { 
        controllers_CustomerController_index1_invoker.call(CustomerController_2.index())
      }
  
    // @LINE:9
    case controllers_Application_getAllCustomers2_route(params) =>
      call { 
        controllers_Application_getAllCustomers2_invoker.call(Application_1.getAllCustomers())
      }
  
    // @LINE:10
    case controllers_CustomerController_saveCustomer3_route(params) =>
      call { 
        controllers_CustomerController_saveCustomer3_invoker.call(CustomerController_2.saveCustomer())
      }
  
    // @LINE:11
    case controllers_CustomerController_deleteCustomer4_route(params) =>
      call { 
        controllers_CustomerController_deleteCustomer4_invoker.call(CustomerController_2.deleteCustomer())
      }
  
    // @LINE:14
    case controllers_Assets_at5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_0.at(path, file))
      }
  }
}