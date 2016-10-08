package CPipeAsk

import akka.actor.{ActorRef, ActorSystem}

object PipeAskMain extends App{
    val system = ActorSystem("pingpong")


  var wordList = List("Let", "It", "Crash")


    val Some(firstActor) = wordList.reverse.foldLeft(None:Option[ActorRef])((nextActor,word) =>
      Some(system.actorOf(ActorAppendString.props(word,nextActor)))
    )


    val actorStarter = system.actorOf(ActorStart.props(firstActor))

    actorStarter ! ActorStart.Start



}