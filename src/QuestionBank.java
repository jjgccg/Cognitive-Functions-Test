import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class QuestionBank {
    private ArrayList<FunctionData> questions;
    private HashMap<String, Integer> functionCount;

    /* Default constructor stores all 48 questions into class variable*/
    public QuestionBank()
    {
        this.questions = new ArrayList<FunctionData>();
        this.functionCount = new HashMap<String, Integer>();
    }

    // Initialize all 48 questions with their associated function
    public void setQuestions()
    {
        //Ti
        String q1 = "You highly relate to the phrase \"Think for yourself.\"  Above all else, you trust your own logical\n " +
                "conclusions and go to great lengths to cultivate your own rationality while remaining skeptical of the\n " +
                "so called \"authorities\" on a given topic.";
        String f1 = "Ti";
        FunctionData fd1 = new FunctionData(q1, f1,0);
        questions.add(fd1);

        String q2 = "You enjoy acquiring new knowledge for the sake of the knowledge itself.  It does not have to be applied\n" +
                " to anything specific or practical - possessing new understanding is reward enough for you.  You are someone\n" +
                " who greatly enjoys pure learning.";
        String f2 = "Ti";
        FunctionData fd2 = new FunctionData(q2, f2,0);
        questions.add(fd2);

        String q3 = "When trying to learn something new or add to your knowledge, you find yourself building an internal\n" +
                " framework inside of your head, complete with classifications, categories, and concepts that make sense to\n" +
                " you, but may not be readily apparent to others.";
        String f3 = "Ti";
        FunctionData fd3 = new FunctionData(q3, f3,0);
        questions.add(fd3);

        String q4 = "You are someone who constantly asks questions to developer a more complete understanding.  Overall, \n" +
                "this may be traced to the fact that you always feel like you're missing some vital piece of knowledge that\n" +
                " will complete your own puzzle.";
        String f4 = "Ti";
        FunctionData fd4 = new FunctionData(q4, f4,0);
        questions.add(fd4);

        String q5 = "You tend to keep your logical conclusions to yourself, indirectly leading others to these conclusions\n" +
                " through questioning and sharing your perceptions.";
        String f5 = "Ti";
        FunctionData fd5 = new FunctionData(q5, f5,0);
        questions.add(fd5);

        String q6 = "Although you appear friendly or easygoing on the outside, internally you are cold and calculated, \n" +
                "evaluating everything from a rational and deductive framework that you have created.";
        String f6 = "Ti";
        FunctionData fd6 = new FunctionData(q6, f6,0);
        questions.add(fd6);

        //Te
        String q7 = "When making arguments, you often back up your statements with references to scientific studies or\n" +
                " authority figures.";
        String f7 = "Te";
        FunctionData fd7 = new FunctionData(q7, f7,0);
        questions.add(fd7);

        String q8 = "When confronted with a problem or task, you find it natural and essential to create a series of objective,\n" +
                " logical steps that you need to take in order to reach your goal.";
        String f8 = "Te";
        FunctionData fd8 = new FunctionData(q8, f8,0);
        questions.add(fd8);

        String q9 = "Knowledge is great, but it is even more powerful and interesting when you are able to apply the knowledge\n" +
                " to something to reach some goal.";
        String f9 = "Te";
        FunctionData fd9 = new FunctionData(q9, f9,0);
        questions.add(fd9);

        String q10 = "Although you may be relaxed and easygoing internally, you often find your method of communication to\n" +
                " be blunt, direct, and to-the-point.  You can't help it - your natural mode of communication is objective\n" +
                " and logical.";
        String f10 = "Te";
        FunctionData fd10 = new FunctionData(q10, f10,0);
        questions.add(fd10);

        String q11 = "You tend to keep your logical conclusions to yourself, indirectly leading others to these conclusions\n" +
                " through questioning and sharing your perceptions.";
        String f11 = "Te";
        FunctionData fd11 = new FunctionData(q11, f11,0);
        questions.add(fd11);

        String q12 = "You recognize, understand, and appreciate external systems such as the scientific method, but you have\n" +
                " no problem restructuring these systems if you see them as inefficient.  Tasks such as this are even\n" +
                " enjoyable to you.";
        String f12 = "Te";
        FunctionData fd12 = new FunctionData(q12, f12,0);
        questions.add(fd12);

        //Fi
        String q13 = "You sometimes do things simply because it feels like the right thing to do.  If you did not take a\n" +
                " particular action, for example, you would feel like you would be sacrificing your integrity and your\n" +
                " core values.";
        String f13 = "Fi";
        FunctionData fd13 = new FunctionData(q13, f13,0);
        questions.add(fd13);

        String q14 = "You ignore what other people around you see as morally correct or meaningful in favor of your own\n" +
                " convictions that you hold strongly to.";
        String f14 = "Fi";
        FunctionData fd14 = new FunctionData(q14, f14,0);
        questions.add(fd14);

        String q15 = "A part of you is always seeking a greater meaning in the experiences and thoughts that you have.";
        String f15 = "Fi";
        FunctionData fd15 = new FunctionData(q15, f15,0);
        questions.add(fd15);

        String q16 = "Your thoughts, actions, and appearance must always align with the core self that you have worked so\n" +
                " hard to define and develop.";
        String f16 = "Fi";
        FunctionData fd16 = new FunctionData(q16, f16,0);
        questions.add(fd16);

        String q17 = "You find it hard to show emotion.  People should not share their feelings.  Feelings are something\n" +
                " personal and meaningful, and they should be quietly contemplated by the individual experiencing them.";
        String f17 = "Fi";
        FunctionData fd17 = new FunctionData(q17, f17,0);
        questions.add(fd17);

        String q18 = "When looking at a large group of people, you do not see the group of people as a single entity.  You\n" +
                " recognize that the group is comprised of unique individuals with their own set of feelings and values.";
        String f18 = "Fi";
        FunctionData fd18 = new FunctionData(q18, f18,0);
        questions.add(fd18);

        //Fe
        String q19 = "For better or worse, you find yourself easily affected by the emotional energy of the people around you,\n" +
                " and you seek to sometimes resonate with it and change it.";
        String f19 = "Fe";
        FunctionData fd19 = new FunctionData(q19, f19,0);
        questions.add(fd19);

        String q20 = "You do not really feel like you have a core self that is unaffected by your environment.  Your self\n" +
                " and your values often seem to be directly influenced by the outside world that you find yourself in, and\n" +
                " for this reason, you may feel like you are always changing.";
        String f20 = "Fe";
        FunctionData fd20 = new FunctionData(q20, f20,0);
        questions.add(fd20);

        String q21 = "Feelings can and should be shared amongst individuals.  You've often found it helpful to share your\n" +
                " feelings with someone else, and you have been receptive to others sharing their feelings and thoughts with\n" +
                " you as well.";
        String f21 = "Fe";
        FunctionData fd21 = new FunctionData(q21, f21,0);
        questions.add(fd21);

        String q22 = "When speaking, you often find that you take extra care to not offend or violate the values of the people\n" +
                " you are speaking to, and you often use polite and respectful forms of address if the situation calls for it.";
        String f22 = "Fe";
        FunctionData fd22 = new FunctionData(q22, f22,0);
        questions.add(fd22);

        String q23 = "You find that you are essentially a social chameleon because you are so skilled at picking up on the\n" +
                " values and emotional energy of other people, which makes you able to temporarily take them on as your own\n" +
                " to more smoothly communicate with them.";
        String f23 = "Fe";
        FunctionData fd23 = new FunctionData(q23, f23,0);
        questions.add(fd23);

        String q24 = "You wear your emotions on your sleeve.  In this sense, you are very easy to read because of your expressive\n" +
                " mode of communication, both verbal and non-verbal.  However, recognizing this, you can hide your emotions\n" +
                " just as well.";
        String f24 = "Fe";
        FunctionData fd24 = new FunctionData(q24, f24,0);
        questions.add(fd24);

        //Si
        String q25 = "Without necessarily realizing it, you have striven to create a detailed roadmap of your life's experiences\n" +
                " and knowledge that you can reference and recall at any time to best come up with a decision in the present.";
        String f25 = "Si";
        FunctionData fd25 = new FunctionData(q25, f25,0);
        questions.add(fd25);

        String q26 = "You find that you have a pretty good factual and visual memory, especially for things that you are\n" +
                " interested in, or things that have greatly impacted you.";
        String f26 = "Si";
        FunctionData fd26 = new FunctionData(q26, f26,0);
        questions.add(fd26);

        String q27 = "You see the past and your personal experience as an extremely helpful learning tool that forms a foundation for you.\n" +
                "  While the future is unknown, and perhaps frightening because of this, the past is something that remains\n" +
                " solid and knowable.";
        String f27 = "Si";
        FunctionData fd27 = new FunctionData(q27, f27,0);
        questions.add(fd27);

        String q28 = "Often times, you find yourself in the same routine, wearing the same things, eating the same things,\n" +
                " taking the same route at the same time to work or school.  There is nothing bad about this - you prefer\n" +
                " the stability over change to your life.";
        String f28 = "Si";
        FunctionData fd28 = new FunctionData(q28, f28,0);
        questions.add(fd28);

        String q29 = "When seeing a well known person in your life again for the first time in a long time, you are\n" +
                " acutely aware of the ways that they have changed, both in their appearance and their personality.\n" +
                "  Something about this strikes you as strange, because they no longer have a correspondence to your\n" +
                " prior conception of them.";
        String f29 = "Si";
        FunctionData fd29 = new FunctionData(q29, f29,0);
        questions.add(fd29);

        String q30 = "You are acutely aware of the physical sensations taking place in your body.  For this reason, you\n" +
                " may avoid certain noises and textures that bother you, and for this same reason, you may also seek \n" +
                " certain physical sensations or even music pieces that affect your body in a pleasant or stimulating way.";
        String f30 = "Si";
        FunctionData fd30 = new FunctionData(q30, f30,0);
        questions.add(fd30);

        //Se
        String q31 = "The present moment is really the most important thing.  While the past is gone and the future cannot\n" +
                " be known, all we have is what is currently going on around us in our lives.";
        String f31 = "Se";
        FunctionData fd31 = new FunctionData(q31, f31,0);
        questions.add(fd31);

        String q32 = "You are very good at taking in a lot of raw sensory information in a short amount of time, making\n" +
                " you particularly skilled in sports, music, cooking, or anything requiring the use of your physical\n" +
                " senses in the present moment.";
        String f32 = "Se";
        FunctionData fd32 = new FunctionData(q32, f32,0);
        questions.add(fd32);

        String q33 = "You have a fine eye for aesthetics in both humans and objects, and because of this, you often find\n" +
                " yourself drawn to fields such as graphic design, art, or architecture.";
        String f33 = "Se";
        FunctionData fd33 = new FunctionData(q33, f33,0);
        questions.add(fd33);

        String q34 = "One way or another, it is important to you that you enact change on your external environment,\n" +
                " whether it's materializing your ideas in the form of a book or blog post, or simply redesigning your\n" +
                " room in a way that satisfies your constantly changing aesthetic preferences.";
        String f34 = "Se";
        FunctionData fd34 = new FunctionData(q34, f34,0);
        questions.add(fd34);

        String q35 = "Life is about taking action, and you often enjoy intense things in the physical world that bring \n" +
                "you adrenaline rushes and really make you feel alive.";
        String f35 = "Se";
        FunctionData fd35 = new FunctionData(q35, f35,0);
        questions.add(fd35);

        String q36 = "When making arguments or engaging in discussions, you would prefer to point out and back your\n" +
                " arguments up with current events happening in the here and now, rather than taking information from\n" +
                " the past or speculating about the future.  In this way, you are very grounded and current.";
        String f36 = "Se";
        FunctionData fd36 = new FunctionData(q36, f36,0);
        questions.add(fd36);

        //Ni
        String q37 = "What goes on inside of your head isn't really thinking in the traditional sense.  Rather, it seem\n" +
                "s like your brain feeds you a series of interconnected and abstracted thoughts, visuals, feelings that \n" +
                "you can often derive meaning and patterns from.";
        String f37 = "Ni";
        FunctionData fd37 = new FunctionData(q37, f37,0);
        questions.add(fd37);

        String q38 = "When given enough information and time, you often have lightning-fast realizations and hunches that\n" +
                " seemingly come out of nowhere.  You've come to rely on these hunches, as they've often proven to be correct.";
        String f38 = "Ni";
        FunctionData fd38 = new FunctionData(q38, f38,0);
        questions.add(fd38);

        String q39 = "You definitely prefer depth over breadth, and often find yourself intensely concentrating on one\n" +
                " domain of a subject or event until you fully understand it from all possible perspectives.  \n" +
                "Other people seem too scattered and never quite go deep enough to see the bedrock of truth.";
        String f39 = "Ni";
        FunctionData fd39 = new FunctionData(q39, f39,0);
        questions.add(fd39);

        String q40 = "When looking at situations and people, you don't see the situations and people themselves in their\n" +
                " raw form, you see what is beyond that - the core causes for events, and the reason that people act\n" +
                " and behave in certain ways.";
        String f40 = "Ni";
        FunctionData fd40 = new FunctionData(q40, f40,0);
        questions.add(fd40);

        String q41 = "It's difficult for you to be engaged with the present moment - oftentimes, your mind is mulling\n" +
                " over a particular abstract idea that you have been contemplating and examining for days or weeks on\n" +
                " end.  In this way, you often find yourself disconnected from the external world and your own body,\n" +
                " as if they're not as real as your thoughts.";
        String f41 = "Ni";
        FunctionData fd41 = new FunctionData(q41, f41,0);
        questions.add(fd41);

        String q42 = "Your life has been characterized by important visions and ideals that you have worked hard to make\n" +
                " a reality in your external environment.  First and foremost, however, you are a contemplative of\n" +
                " these visions.";
        String f42 = "Ni";
        FunctionData fd42 = new FunctionData(q42, f42,0);
        questions.add(fd42);

        //Ne
        String q43 = "The fact that ideas constantly appear and then reappear in your consciousness has led you to be\n" +
                " called scatter-brained or distracted.";
        String f43 = "Ne";
        FunctionData fd43 = new FunctionData(q43, f43,0);
        questions.add(fd43);

        String q44 = "You enjoy playing around with different combinations of ideas or external structures such as language.\n" +
                "  This often translates to being seen by others as quirky or quick-witted.";
        String f44 = "Ne";
        FunctionData fd44 = new FunctionData(q44, f44,0);
        questions.add(fd44);

        String q45 = "You may have a perfect understanding of your thoughts inside of your head, but when you try to explain\n" +
                " them, they can't help but come out as jumbled and unorganized as you simultaneously make new connections\n" +
                " you've never thought of while speaking.";
        String f45 = "Ne";
        FunctionData fd45 = new FunctionData(q45, f45,0);
        questions.add(fd45);

        String q46 = "You're very good at starting new projects and learning new topics, but you have a problem with completing\n" +
                " them or following through because you've already moved on to something else that has caught your interest.";
        String f46 = "Ne";
        FunctionData fd46 = new FunctionData(q46, f46,0);
        questions.add(fd46);

        String q47 = "You have a strange sense of humor, most likely due to the fact that you're quick to catch on to patterns\n" +
                " in the outside world that others aren't really seeing.";
        String f47 = "Ne";
        FunctionData fd47 = new FunctionData(q47, f47,0);
        questions.add(fd47);

        String q48 = "You greatly enjoy experimentation and exploration in your life because you are constantly open to\n" +
                " new ideas and information.";
        String f48 = "Fe";
        FunctionData fd48 = new FunctionData(q48, f48,0);
        questions.add(fd48);

        Collections.shuffle(questions); //randomize question bank
    }

    // Setter method goes through the question bank, incrementing count of cognitive functions
    public void setFunctionCount()
    {
        for(int i = 0; i < questions.size(); i++)
        {
            String cogFunc = questions.get(i).function;
            if(functionCount.get(cogFunc) == null)
            {
                functionCount.put(cogFunc, questions.get(i).score);
            }
            else
            {
                functionCount.put(cogFunc, functionCount.get(cogFunc) + questions.get(i).score);
            }
        }
    }

    public ArrayList<FunctionData> getQuestions()
    {
        return questions;
    }

    public HashMap<String, Integer> getFunctionCount()
    {
        return functionCount;
    }

    public void printFunctionCount()
    {
        for(String func : functionCount.keySet())
        {
            System.out.println(func + ": " + 240.0/functionCount.get(func) + "%");
        }
    }
}