pipeline {
  agent { node { label 'slave01' } }

   stages {
      stage('Clone Sources') {
        steps {
          checkout scm
        } 
      }
     stage('Selected language') {
         steps {
            echo "You choose to code in ${Language}"
         }
      }
      
	  stage('Python') {
       when { expression {return (params.Language == 'Python' || params.Language == 'All') }
	   }
	   steps {
            ''' sh python3
	    
	    
	    
	    import random
			print("this is the winning LOTTORY numbers ")
			for x in range(6):
			    print(random.randint(1,36))
	    '''
		   
        }
		 
         }
      
      stage('C') {
	      when { expression {return (params.Language == 'C' || params.Language == 'All') }
	   }
         steps {
            echo 'C code'
         }
      }
      stage('Bash') {
	      when { expression {return (params.Language == 'Bash' || params.Language == 'All') }
	   }
         steps {
            echo 'Bash code'
         }
      }
      stage('Java') {
	      when { expression {return (params.Language == 'Java' || params.Language == 'All') }
	   }
         steps {
            echo 'Java code'
         }
      }
      stage('C#') {
	      when { expression {return (params.Language == 'C#' || params.Language == 'All') }
	   }
         steps {
            echo 'C# code'
         }
      }
      
   }

}
