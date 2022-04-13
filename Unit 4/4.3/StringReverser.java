public class StringReverser {
    public static void main(String[] args){
        String word = "The Shawn Carter Foundation (SCF) was founded on the belief that any motivated individual in need should have the opportunity to further his or her education. By removing some of the financial burdens associated with going to, surviving in, and graduating from college, the SCF plays a vital role in increasing college access and success for many motivated yet underserved youth and young adults.\n\nThe SCF provides individual grants, paid directly to the educational institution, to every student who qualifies, is accepted as a recipient, and reapplies yearly, from admission to graduation up to six years and the age of 25. The grant can be used to cover tuition expenses and related supplemental educational expenses such as books, lab fees, travel, and select costs of living. All Shawn Carter Foundation Scholars are required to “give back” by conducting community service and/or serving as mentors to younger, aspiring SCF Scholars.\n\n \n\nWhile we’d like to serve all students who fit the above criteria for our scholarship, we have a finite number of spots for new and returning scholars in a given academic year. Our typical scholarship recipients demonstrate resiliency in the face of hardship and give back to their communities.\n\n-First-time Shawn Carter Foundation scholarship recipients generally have GPAs between 2.0 and 3.0 (students with GPAs above this range are still encouraged to apply) and are first-generation. ";
        String reversed = "";

        for (int i = 0; i < word.length(); i++){
            String single = word.substring(i, i + 1);
            reversed = single + reversed;
        }

        System.out.println(reversed);
    }
}
