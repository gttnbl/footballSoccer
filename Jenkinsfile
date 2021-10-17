pipeline{
   agent any
  
    stages {

      stage("build"){
         steps{
            echo 'This is a minimal pipeline.'
			withMaven(maven : 'apache-maven-3.6.1') {
            bat'mvn clean compile'
			}
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
