package homework;


public class BraceChecker {

//սա հենց տեքստն է

    private String text;


    //կլասսի կոնստրուկտորն է,որը պետք է ընդունի String տիպի տեքստ և վերագրի վերևի տեքստին
//Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text  տալու կոնստրուկտորի մեջ։
    public BraceChecker(String text) {
        this.text = text;

    }


//սա հիմնական մեթոդն է,որի մեջ գրելու ենք ամբողջ լոգիկան,աշխատելու ենք թե stack-ի հետ,թե վերևի text-ի
// sdfdsfdf( [ { ads d )  }]

    public void check() {
        Stack stack = new Stack();
        char[] chars = text.toCharArray();
        char last;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
// test{34)
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                    last = stack.pop();
                    if (last == ' ') {
                        System.out.println("ERROR: Closed } but not opened");
                    } else if (last != '{') {
                        System.out.println("ERROR: Opened " + last + " but closed } index " + i);
                    }

                    break;
                case ')':
                    last = stack.pop();
                    if (last == ' ') {
                        System.out.println("ERROR: Closed ) but not opened");
                    } else if (last != '(') {
                        System.out.println("ERROR: Opened " + last + " but  closed ) index " + i);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == ' ') {
                        System.out.println("ERROR: Closed ] but not opened");
                    } else if (last != '[') {
                        System.out.println("ERROR: Opened " + last + " but closed ] index " + i);
                    }
                    break;
            }
        }

        last = stack.pop();
        if (last != ' ') {
            System.out.println("ERROR: Opened " + last + " but not closed");
        }
    }

}



