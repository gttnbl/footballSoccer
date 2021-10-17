pipeline{
   agent any
  
    stages {
	stage ('Initialize') {
            steps {
                def mvnHome = tool 'M3'
				 sh "${mvnHome}/bin/mvn -B -Dmaven.test.failure.ignore verify"
            }
        }
      stage("build"){
         steps{
            echo 'This is a minimal pipeline.'
			
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
