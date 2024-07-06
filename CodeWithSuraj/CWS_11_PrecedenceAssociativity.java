package CodeWithSuraj;

public class CWS_11_PrecedenceAssociativity {
    public static void main(String[] args) {
            //not BODMAS here is associativity and precedence

            //1

            int a=6*5-34/2; 	//precedence=12		associativity left->right
            /*
             * 	=6*5-34/2
             * 	=30-34/2
             * 	=30-17
             * 	=13
             */
            int b=34/2-6*5;  //precedence=12	associativity left->right
            /*
             * 	=34/2-6*5
             * 	=17-6*5
             * 	=17-30
             * 	=-13
             */
            System.out.println(a+" "+b);





            //2
            int c;
            a=b=c=20;	//associativity=1	precedence right->left
            /*
             *	=a=b=c=20;
             *	=a=b=(c=20)	c=20 first initialize
             *	=a=(b=c)	b=c will be initialize i.e 20
             *	=(a=b)		a=b will be initialize i.e 20
             *		*right to left*
             */
            System.out.println(a+" "+b+" "+c);



            //3

            /*
             * printing
             * 		x-y
             *     -----
             *       2
             */
            int x=1,y=3;
            int z=x-y/2;
            /*
             * 		****--------wrong way---------***
             *
             * 		z=x-y/2;
             * 		 =1-3/2	  associativity of / =12  associativity of - =11	precedence left->right
             * 		 =1-0.5		first division is performed then subtraction
             * 		 =-0.5    => 0 because of result is of type integer it can not take any decimal value
             *
             * 		****--------wrong way---------***
             */
            int w=(x-y)/2;
            /*
             * ****--------correct way---------***
             *
             * 		w=(x-y)/2;
             * 		 =(1-3)/2	  associativity of () =14  associativity of / =12	precedence left->right
             * 		 =-2/2		first bracket is performed then division
             * 		 =-1
             *
             *  ****--------correct way---------***
             */
            System.out.println(z);
            System.out.println(w);






            //4

            //
            /*
             * 	printing
             * 			b^2 -4ac
             * 		   ----------
             * 			   2a
             */
            //a=b=c=20 till here

            //    ****--------wrong way---------***
            int m=b*b-4*a*c/2*a;
            /*m=b*b-4*a*c/2*a;			associativity of / and * =12  associativity of - =11	precedence left->right
             * =20*20-4*20*20/2*20
             * =400-4*20*20/2*20
             * =400-80*20/2*20
             * =400-1600/2*20
             * =400-800*20
             * =400-16000
             * =-15600
             * 			****--------wrong way---------***
             */
            int n=b*b-(4*a*c)/(2*a);
            //	****--------correct way---------***
            /*m=b*b-(4*a*c)/(2*a);			associativity of ()=14, associativity of / and * =12, associativity of - =11	precedence left->right
             * =20*20-(4*20*20)/(2*20)
             * =20*20-(1600)/(2*20)
             * =20*20-(1600)/(40)
             * =400-1600/40
             * =400-40
             * =360
             * 		****--------correct way---------***
             */
            System.out.println(m);
            System.out.println(n);
        }

    }

