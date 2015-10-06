// @SOURCE:C:/Users/Caio/Downloads/salaorocha/conf/routes
// @HASH:ef403456ec94f50dd98d3d4f12c0985361cee97b
// @DATE:Tue Oct 06 16:38:49 BRT 2015


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
private[this] lazy val controllers_Application_loginNoGame1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("game/login/"),DynamicPart("code", """[^/]+""",true))))
private[this] lazy val controllers_Application_loginNoGame1_invoker = createInvoker(
controllers.Application.loginNoGame(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginNoGame", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """game/login/$code<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_registerNoGame2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("game/register"))))
private[this] lazy val controllers_Application_registerNoGame2_invoker = createInvoker(
controllers.Application.registerNoGame(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registerNoGame", Nil,"POST", """""", Routes.prefix + """game/register"""))
        

// @LINE:9
private[this] lazy val controllers_Application_updatePlayer3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("game/update"))))
private[this] lazy val controllers_Application_updatePlayer3_invoker = createInvoker(
controllers.Application.updatePlayer(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updatePlayer", Nil,"POST", """""", Routes.prefix + """game/update"""))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """remove/assets/$file<.+>"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rem/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """rem/assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """game/login/$code<[^/]+>""","""controllers.Application.loginNoGame(code:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """game/register""","""controllers.Application.registerNoGame()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """game/update""","""controllers.Application.updatePlayer()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rem/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_loginNoGame1_route(params) => {
   call(params.fromPath[Integer]("code", None)) { (code) =>
        controllers_Application_loginNoGame1_invoker.call(controllers.Application.loginNoGame(code))
   }
}
        

// @LINE:8
case controllers_Application_registerNoGame2_route(params) => {
   call { 
        controllers_Application_registerNoGame2_invoker.call(controllers.Application.registerNoGame())
   }
}
        

// @LINE:9
case controllers_Application_updatePlayer3_route(params) => {
   call { 
        controllers_Application_updatePlayer3_invoker.call(controllers.Application.updatePlayer())
   }
}
        

// @LINE:12
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:13
case controllers_Assets_at5_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:14
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     