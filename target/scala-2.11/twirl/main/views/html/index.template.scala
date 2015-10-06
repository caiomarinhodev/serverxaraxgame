
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
<title>SERVER</title>
    <link href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css" type="text/css" rel="stylesheet">
</head>
<body>

    <h2>SERVER RODANDO</h2>
    <br/>
        <form method="post" action="/game/login/666">
            Email:<br>
            <input type="email" name="email" >
            <br>
            Senha:<br>
            <input type="password" name="senha" >
            <button type="submit">SUBMIT</button>
        </form>
    <br/><br/><br/>

    <table id="table" class="table table-hover table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Email</th>
                <th>Senha</th>
                <th>Player</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*33.14*/for(po <- Sistema.getTodosUsuarios) yield /*33.49*/{_display_(Seq[Any](format.raw/*33.50*/("""
                """),format.raw/*34.17*/("""<tr>
                    <td>"""),_display_(/*35.26*/po/*35.28*/.getId),format.raw/*35.34*/("""</td>
                    <td>"""),_display_(/*36.26*/po/*36.28*/.getNome),format.raw/*36.36*/("""</td>
                    <td>"""),_display_(/*37.26*/po/*37.28*/.getEmail),format.raw/*37.37*/("""</td>
                    <td>"""),_display_(/*38.26*/po/*38.28*/.getSenha),format.raw/*38.37*/("""</td>
                    <td>"""),_display_(/*39.26*/po/*39.28*/.getPlayer),format.raw/*39.38*/("""</td>
                </tr>
            """)))}),format.raw/*41.14*/("""
        """),format.raw/*42.9*/("""</tbody>
    </table>
    <br/><br/>
    <form method="post" action="/game/register">
        Email:<br>
        <input type="nome" name="nome" >
        <br>
        Email:<br>
        <input type="email" name="email" >
        <br>
        Senha:<br>
        <input type="password" name="senha">
        <button type="submit">SUBMIT</button>
    </form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js" type="text/javascript"></script>

    <script>
    $(document).ready(function() """),format.raw/*60.34*/("""{"""),format.raw/*60.35*/("""
        """),format.raw/*61.9*/("""$('#table').DataTable();
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""" """),format.raw/*62.7*/(""");
    </script>
</body>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 06 17:31:47 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/salaorocha/app/views/index.scala.html
                  HASH: c69b3feeb0ccd98de6beb164e4c4ecad9b3e704c
                  MATRIX: 716->1|805->3|833->5|1725->870|1776->905|1815->906|1861->924|1919->955|1930->957|1957->963|2016->995|2027->997|2056->1005|2115->1037|2126->1039|2156->1048|2215->1080|2226->1082|2256->1091|2315->1123|2326->1125|2357->1135|2431->1178|2468->1188|3124->1816|3153->1817|3190->1827|3247->1857|3275->1858|3303->1859
                  LINES: 26->1|29->1|30->2|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|69->41|70->42|88->60|88->60|89->61|90->62|90->62|90->62
                  -- GENERATED --
              */
          