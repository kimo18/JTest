pipeline{
        agent any

        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('Hello') {
                steps {
                    int var = 20
                     if(var<0){

                     echo 'number is less than Zero'
                     }
                    else{
                         echo ' number is greater than Zero'
                     }
                }

            }
        }
    }
