pipeline{
   agent any
    stages {
      stage("build"){
         steps{
            echo 'building the app..'
			bat 'make' 
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
			
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
