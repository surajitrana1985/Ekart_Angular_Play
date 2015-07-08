
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/MyLearnings/Play/PlayTutorial/EKart/conf/routes
// @DATE:Wed Jul 08 11:15:55 IST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
