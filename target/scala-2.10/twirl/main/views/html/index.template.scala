
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*2.2*/main()/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
	"""),format.raw/*3.2*/("""<div ng-app="CustomerApp" ng-controller="CustomerController">
		<div class="row">
			<h2>Customers</h2>
			<table class="table table-striped" ng-table="tableParam">
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>City</th>
						<th>Action</th>
					</tr>
				</thead>
				<body>
					<tr ng-repeat="customer in customers">
						<td>"""),format.raw/*17.11*/("""{"""),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""customer.firstname"""),format.raw/*17.31*/("""}"""),format.raw/*17.32*/("""}"""),format.raw/*17.33*/("""</td>
						<td>"""),format.raw/*18.11*/("""{"""),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""customer.lastname"""),format.raw/*18.30*/("""}"""),format.raw/*18.31*/("""}"""),format.raw/*18.32*/("""</td>
						<td>"""),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""{"""),format.raw/*19.13*/("""customer.city"""),format.raw/*19.26*/("""}"""),format.raw/*19.27*/("""}"""),format.raw/*19.28*/("""</td>
						<td>
							<button type="button" class="btn btn-info" ng-click="edit(customer)">EDIT</button>
							<button type="button" class="btn btn-danger" ng-click="delete(customer)">DELETE</button>
						</td>
					</tr>
				</body>
			</table>
		</div>
		<div class="row" ng-show="showFlag">
			<h2>Edit City</h2>
			<form ng-submit="editSaveCustomer()">
				<table>
					<tr>
						<td>Name</td>
						<td>"""),format.raw/*34.11*/("""{"""),format.raw/*34.12*/("""{"""),format.raw/*34.13*/("""editCustomer.firstname"""),format.raw/*34.35*/("""}"""),format.raw/*34.36*/("""}"""),format.raw/*34.37*/(""" """),format.raw/*34.38*/("""{"""),format.raw/*34.39*/("""{"""),format.raw/*34.40*/("""editCustomer.lastname"""),format.raw/*34.61*/("""}"""),format.raw/*34.62*/("""}"""),format.raw/*34.63*/("""</td>
					</tr>
					<tr>
						<td>City</td>
						<td><input type="text" ng-model="editCustomer.city"/></td>
					</tr>
					<tr>
						<td><button type="submit" class="btn btn-primary">UPDATE</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
""")))}/*47.2*/ {_display_(Seq[Any](format.raw/*47.4*/("""
	"""),format.raw/*48.2*/("""<script type="text/javascript" src=""""),_display_(/*48.39*/routes/*48.45*/.Assets.at("javascripts/application.js")),format.raw/*48.85*/(""""></script>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Jul 08 21:16:31 IST 2015
                  SOURCE: D:/MyLearnings/Play/PlayTutorial/EKart/app/views/index.scala.html
                  HASH: 4075c1f061628c3657a7d42a1c11fd1d2af059e1
                  MATRIX: 753->1|875->28|902->30|915->36|954->38|982->40|1379->409|1408->410|1437->411|1483->429|1512->430|1541->431|1585->447|1614->448|1643->449|1688->466|1717->467|1746->468|1790->484|1819->485|1848->486|1889->499|1918->500|1947->501|2388->914|2417->915|2446->916|2496->938|2525->939|2554->940|2583->941|2612->942|2641->943|2690->964|2719->965|2748->966|3029->1229|3068->1231|3097->1233|3161->1270|3176->1276|3237->1316
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|78->47|78->47|79->48|79->48|79->48|79->48
                  -- GENERATED --
              */
          