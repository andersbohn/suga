package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def whyScala = Action {
    Ok(views.html.why_scala())
  }

  def getStarted = Action {
    Ok(views.html.get_started())
  }

  def howTos = Action {
    Ok(views.html.howtos())
  }

  def howToMaven = Action {
    Ok(views.html.howto_maven())
  }

  def links = Action {
    Ok(views.html.links())
  }

  def scalaSceptics = Action {
    Ok(views.html.sceptics())
  }

  def studyScala = Action {
    Ok(views.html.study())
  }
  def funWithScala = Action {
    Ok(views.html.fun_with())
  }

}