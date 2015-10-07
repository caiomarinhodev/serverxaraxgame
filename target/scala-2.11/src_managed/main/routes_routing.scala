// @SOURCE:C:/Users/Caio/Downloads/salaorocha/conf/routes
// @HASH:3189a4dd7baf8b68ae13fdded7997d2f34f3f1a8
// @DATE:Wed Oct 07 12:05:30 BRT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_login1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("game/login/"),DynamicPart("code", """[^/]+""",true),StaticPart("/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_Application_login1_invoker = createInvoker(
controllers.Application.login(fakeValue[Integer], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(classOf[Integer], classOf[String]),"GET", """""", Routes.prefix + """game/login/$code<[^/]+>/$email<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_register2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("game/register/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_Application_register2_invoker = createInvoker(
controllers.Application.register(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(classOf[String]),"GET", """""", Routes.prefix + """game/register/$email<[^/]+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_update3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("game/update/"),DynamicPart("email", """[^/]+""",true),StaticPart("/"),DynamicPart("moedas", """[^/]+""",true),StaticPart("/"),DynamicPart("nivel", """[^/]+""",true),StaticPart("/"),DynamicPart("pontos", """[^/]+""",true))))
private[this] lazy val controllers_Application_update3_invoker = createInvoker(
controllers.Application.update(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "update", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """game/update/$email<[^/]+>/$moedas<[^/]+>/$nivel<[^/]+>/$pontos<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:16
private[this] lazy val controllers_Assets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """remove/assets/$file<.+>"""))
        

// @LINE:17
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rem/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """rem/assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """game/login/$code<[^/]+>/$email<[^/]+>""","""controllers.Application.login(code:Integer, email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """game/register/$email<[^/]+>""","""controllers.Application.register(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """game/update/$email<[^/]+>/$moedas<[^/]+>/$nivel<[^/]+>/$pontos<[^/]+>""","""controllers.Application.update(email:String, moedas:String, nivel:String, pontos:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rem/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_login1_route(params) => {
   call(params.fromPath[Integer]("code", None), params.fromPath[String]("email", None)) { (code, email) =>
        controllers_Application_login1_invoker.call(controllers.Application.login(code, email))
   }
}
        

// @LINE:8
case controllers_Application_register2_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_register2_invoker.call(controllers.Application.register(email))
   }
}
        

// @LINE:9
case controllers_Application_update3_route(params) => {
   call(params.fromPath[String]("email", None), params.fromPath[String]("moedas", None), params.fromPath[String]("nivel", None), params.fromPath[String]("pontos", None)) { (email, moedas, nivel, pontos) =>
        controllers_Application_update3_invoker.call(controllers.Application.update(email, moedas, nivel, pontos))
   }
}
        

// @LINE:15
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:16
case controllers_Assets_at5_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:17
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     