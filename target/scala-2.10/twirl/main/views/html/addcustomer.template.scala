
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addcustomer_Scope0 {
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

class addcustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*2.2*/main()/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
	"""),format.raw/*3.2*/("""<div ng-app="CustomerApp" ng-controller="CustomerController">
		<div class="row">
			<form ng-submit="save()">
				<table cellpadding="10">
					<tr>
						<td><label>First Name</label></td>
						<td><input type="text" ng-model="customer.firstname" width="300"></td>
					</tr>
					<tr>
						<td><label>Last Name</label></td>
						<td><input type="text" ng-model="customer.lastname" width="300"></td>
					</tr>
					<tr>
						<td><label>City</label></td>
						<td><input type="text" ng-model="customer.city" width="300"></td>
					</tr>
					<tr>
						<td><button type="submit" class="btn btn-primary">Submit</button></td>
						<td><button type="reset" class="btn btn-primary">Reset</button></td>
					</tr>
				</table>
			</form>
		</div>
		<div class="row">
			<ul>
				
			</ul>
		</div>
	</div>
""")))}/*32.2*/ {_display_(Seq[Any](format.raw/*32.4*/("""
	"""),format.raw/*33.2*/("""<script type="text/javascript" src=""""),_display_(/*33.39*/routes/*33.45*/.Assets.at("javascripts/application.js")),format.raw/*33.85*/(""""></script>
""")))}))
      }
    }
  }

  def render(customers:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


}

/**/
object addcustomer extends addcustomer_Scope0.addcustomer
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 16:01:15 IST 2015
                  SOURCE: D:/MyLearnings/Play/PlayTutorial/EKart/app/views/addcustomer.scala.html
                  HASH: b0751a89f5dccd48151f9a482e48e6cdb9f56ce9
                  MATRIX: 765->1|887->28|915->31|928->37|967->39|996->42|1853->881|1892->883|1922->886|1986->923|2001->929|2062->969
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|63->32|63->32|64->33|64->33|64->33|64->33
                  -- GENERATED --
              */
          