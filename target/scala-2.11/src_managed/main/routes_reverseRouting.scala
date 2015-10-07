// @SOURCE:C:/Users/Caio/Downloads/salaorocha/conf/routes
// @HASH:3189a4dd7baf8b68ae13fdded7997d2f34f3f1a8
// @DATE:Wed Oct 07 12:05:30 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseAssets {


// @LINE:17
// @LINE:16
// @LINE:15
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:15
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


// @LINE:9
def update(email:String, moedas:String, nivel:String, pontos:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "game/update/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[String]].unbind("moedas", dynamicString(moedas)) + "/" + implicitly[PathBindable[String]].unbind("nivel", dynamicString(nivel)) + "/" + implicitly[PathBindable[String]].unbind("pontos", dynamicString(pontos)))
}
                        

// @LINE:8
def register(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "game/register/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:7
def login(code:Integer, email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "game/login/" + implicitly[PathBindable[Integer]].unbind("code", code) + "/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseAssets {


// @LINE:17
// @LINE:16
// @LINE:15
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


// @LINE:9
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(email,moedas,nivel,pontos) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "game/update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("moedas", encodeURIComponent(moedas)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nivel", encodeURIComponent(nivel)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pontos", encodeURIComponent(pontos))})
      }
   """
)
                        

// @LINE:8
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "game/register/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function(code,email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "game/login/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
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
        


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
// @LINE:16
// @LINE:15
class ReverseAssets {


// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def update(email:String, moedas:String, nivel:String, pontos:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(email, moedas, nivel, pontos), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "update", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """game/update/$email<[^/]+>/$moedas<[^/]+>/$nivel<[^/]+>/$pontos<[^/]+>""")
)
                      

// @LINE:8
def register(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(classOf[String]), "GET", """""", _prefix + """game/register/$email<[^/]+>""")
)
                      

// @LINE:7
def login(code:Integer, email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(code, email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(classOf[Integer], classOf[String]), "GET", """""", _prefix + """game/login/$code<[^/]+>/$email<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    