
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>SERVER</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.2 -->
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="layout-boxed skin-blue">
      <h2>RODANDO</h2>
  </body>
</html>"""))}
  }

  def render(usuario:Usuario,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(usuario)(content)

  def f:((Usuario) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => (content) => apply(usuario)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 06 16:40:58 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/salaorocha/app/views/main.scala.html
                  HASH: f9bd66f99e40eb9ce889cb9a18be87128ea64fae
                  MATRIX: 728->1|849->34|877->36
                  LINES: 26->1|29->1|30->2
                  -- GENERATED --
              */
          