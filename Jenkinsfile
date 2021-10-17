pipeline{
   agent any
  
    stages {

      stage("build"){
         steps{
            echo 'This is a minimal pipeline.'
			mvn 'clean install -DskipTests'
         }
      }

      stage("test"){
         steps{
              echo 'testing the app..'
         }
      }

      stage("deploy"){
         steps{
              echo 'deploying the app..'
         }
      }
   }
}
