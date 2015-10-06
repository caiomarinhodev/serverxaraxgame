// @SOURCE:C:/Users/Caio/Downloads/salaorocha/conf/routes
// @HASH:ef403456ec94f50dd98d3d4f12c0985361cee97b
// @DATE:Tue Oct 06 16:38:49 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseAssets {


// @LINE:14
// @LINE:13
// @LINE:12
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:12
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/assets/")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def loginNoGame(code:Integer): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "game/login/" + implicitly[PathBindable[Integer]].unbind("code", code))
}
                        

// @LINE:9
def updatePlayer(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "game/update")
}
                        

// @LINE:8
def registerNoGame(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "game/register")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseAssets {


// @LINE:14
// @LINE:13
// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rem/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def loginNoGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginNoGame",
   """
      function(code) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "game/login/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:9
def updatePlayer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updatePlayer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "game/update"})
      }
   """
)
                        

// @LINE:8
def registerNoGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerNoGame",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "game/register"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:14
// @LINE:13
// @LINE:12
class ReverseAssets {


// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def loginNoGame(code:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginNoGame(code), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginNoGame", Seq(classOf[Integer]), "POST", """""", _prefix + """game/login/$code<[^/]+>""")
)
                      

// @LINE:9
def updatePlayer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updatePlayer(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updatePlayer", Seq(), "POST", """""", _prefix + """game/update""")
)
                      

// @LINE:8
def registerNoGame(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerNoGame(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registerNoGame", Seq(), "POST", """""", _prefix + """game/register""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    