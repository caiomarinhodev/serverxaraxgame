
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
                <th>Pontos</th>
                <th>Nivel</th>
                <th>Moedas</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*35.14*/for(po <- Sistema.getTodosUsuarios) yield /*35.49*/{_display_(Seq[Any](format.raw/*35.50*/("""
                """),format.raw/*36.17*/("""<tr>
                    <td>"""),_display_(/*37.26*/po/*37.28*/.getId),format.raw/*37.34*/("""</td>
                    <td>"""),_display_(/*38.26*/po/*38.28*/.getNome),format.raw/*38.36*/("""</td>
                    <td>"""),_display_(/*39.26*/po/*39.28*/.getEmail),format.raw/*39.37*/("""</td>
                    <td>"""),_display_(/*40.26*/po/*40.28*/.getSenha),format.raw/*40.37*/("""</td>
                    <td>"""),_display_(/*41.26*/po/*41.28*/.getPontos),format.raw/*41.38*/("""</td>
                    <td>"""),_display_(/*42.26*/po/*42.28*/.getNivel),format.raw/*42.37*/("""</td>
                    <td>"""),_display_(/*43.26*/po/*43.28*/.getMoedas),format.raw/*43.38*/("""</td>
                </tr>
            """)))}),format.raw/*45.14*/("""
        """),format.raw/*46.9*/("""</tbody>
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
    $(document).ready(function() """),format.raw/*64.34*/("""{"""),format.raw/*64.35*/("""
        """),format.raw/*65.9*/("""$('#table').DataTable();
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""" """),format.raw/*66.7*/(""");
    </script>
</body>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 07 12:05:31 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/salaorocha/app/views/index.scala.html
                  HASH: 7390ea039066ebd3a011fed8d2c604b74cad677f
                  MATRIX: 716->1|805->3|833->5|1790->935|1841->970|1880->971|1926->989|1984->1020|1995->1022|2022->1028|2081->1060|2092->1062|2121->1070|2180->1102|2191->1104|2221->1113|2280->1145|2291->1147|2321->1156|2380->1188|2391->1190|2422->1200|2481->1232|2492->1234|2522->1243|2581->1275|2592->1277|2623->1287|2697->1330|2734->1340|3390->1968|3419->1969|3456->1979|3513->2009|3541->2010|3569->2011
                  LINES: 26->1|29->1|30->2|63->35|63->35|63->35|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|73->45|74->46|92->64|92->64|93->65|94->66|94->66|94->66
                  -- GENERATED --
              */
          