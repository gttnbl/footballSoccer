pipeline{
   agent any
  tools {
        maven 'M3'
    }
    stages {

      stage("build"){
         steps{
            echo 'This is a minimal pipeline.'
			sh 'mvn -B package'
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
