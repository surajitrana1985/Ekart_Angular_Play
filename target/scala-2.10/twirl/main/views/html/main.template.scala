
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(content: Html)(javascript: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>E-KART</title>
        <!-- Bootstrap -->
        <link href=""""),_display_(/*12.22*/routes/*12.28*/.Assets.at("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*12.95*/("""" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" 
                            data-target="#bs-example-navbar- collapse-9" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">E-Kart</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
                    <ul class="nav navbar-nav">
                        <li><a href="/">Customers</a></li>
                        <li><a href="#">Orders</a></li>
                        <li><a href=""""),_display_(/*33.39*/routes/*33.45*/.CustomerController.index()),format.raw/*33.72*/("""">Add Customer</a></li>
                        <li><a href="#">Add Order</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="container">
            """),_display_(/*40.14*/content),format.raw/*40.21*/("""
        """),format.raw/*41.9*/("""</div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src=""""),_display_(/*43.23*/routes/*43.29*/.Assets.at("bower_components/jquery/dist/jquery.min.js")),format.raw/*43.85*/(""""></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.at("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*45.94*/(""""></script>
        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.at("bower_components/bootstrap/dist/js/app.js")),format.raw/*46.84*/(""""></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.at("bower_components/angular/angular.min.js")),format.raw/*47.82*/(""""></script>
        """),_display_(/*48.10*/javascript),format.raw/*48.20*/("""

    """),format.raw/*50.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(content:Html,javascript:Html): play.twirl.api.HtmlFormat.Appendable = apply()(content)(javascript)

  def f:(() => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => (javascript) => apply()(content)(javascript)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Jul 05 18:39:54 IST 2015
                  SOURCE: D:/MyLearnings/Play/PlayTutorial/EKart/app/views/main.scala.html
                  HASH: 7115195c88e67d3e30a1cc4c2234ab7ac6596ed5
                  MATRIX: 746->1|876->36|904->38|1345->452|1360->458|1448->525|2647->1697|2662->1703|2710->1730|3000->1993|3028->2000|3064->2009|3191->2109|3206->2115|3283->2171|3437->2298|3452->2304|3538->2369|3599->2403|3614->2409|3690->2464|3751->2498|3766->2504|3840->2557|3888->2578|3919->2588|3952->2594
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|64->33|64->33|64->33|71->40|71->40|72->41|74->43|74->43|74->43|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|81->50
                  -- GENERATED --
              */
          