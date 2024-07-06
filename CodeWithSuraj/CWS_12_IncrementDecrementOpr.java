package CodeWithSuraj;

public class CWS_12_IncrementDecrementOpr {
    public static void main(String[] args)
        {
            /*
             * increment=>increase value by one of any variable
             * 1)post increment => x++ 	first print then increase value by 1 or first use then increase
             * 2)pre increment  => ++x	just increase a value by one or use with increased value
             */

            //post increment=>
            int x=10;
            int b=x++;	//b=10 only because first use then increase the value by one
            System.out.println(b); //10
            System.out.println(x); //11
            int y=5;
            System.out.println(y++);	//5
            System.out.println(y);		//6

            //pre increment
            int a=90;
            int i=++a;	//increase the value by one then use
            System.out.println(i);	//91
            System.out.println(a);	//91
            int j=2;
            System.out.println(++j);	//3
            System.out.println(j);		//3



            /*
             * decrement=>decrease the value by 1
             * 1)post decrement =>x-- 	first print then decrease value by 1 or first use then decrease
             * 2)pre decrement  =>--x	just decrease a value by one or use with decreased value
             */


            //post decrement
            int m=45;
            int v=m--;
            System.out.println(v);	//45
            System.out.println(m);	//44
            int e=67;
            System.out.println(e--);	//67
            System.out.println(e);		//66

            //pre decrement
            int h=24;
            int o=--h;	//it will first drecrease then initalize
            System.out.println(o);	//23
            System.out.println(h);	//23
            int l=7;
            System.out.println(--l);	//6
            System.out.println(l);		//6



            /*
             * ________________also used for character____________________________
             */
            char ch='a';
            System.out.println(ch++);	//a
            System.out.println(ch);		//b
            System.out.println(ch--);	//b
            System.out.println(ch);		//a

            char c='x';
            System.out.println(++c);	//y
            System.out.println(c);		//y
            System.out.println(--c);	//x
            System.out.println(c);		//x
        }

    }

