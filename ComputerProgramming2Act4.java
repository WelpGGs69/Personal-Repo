// Computer Programming 2 Activity 4 Interactive Story
import java.util.Scanner;
public class ComputerProgramming2Act4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String protagonist = "Speed";
        String neighbor = "Neighbor";
        String girl = "Little Girl";
        String barGuy = "Bar Guy";
        String cashier = "Cashier Girl";
        String graveyardGuy = "Gravedigger";
        String woman = "Random Woman";
        String theorist = "Mustache Guy with glasses";
        String agent = "FEMA Agent";
        String visitor = "Pale Visitor";
        int year = 2019;

        // Track key decisions for endings
        boolean cashierInside = false;
        boolean gravediggerInside = false;
        boolean helpedNeighbor = false;

        System.out.println("======== Are you a human? ==============\n\n");

        System.out.println("In the late " + year + " in a bright neighborhood in the middle of the town, the story begins as normal, except we got an intro of a conversation between [REDACTED] and his neighbor");
        System.out.println("Actually, we just got back from our trip.");
        System.out.println("Aren't you tired of staying home?");
        System.out.println("Yeah, yeah, I remember.");
        System.out.println("We went to the beach.");
        System.out.println("The neighbor describes how he is coming back from a trip that he just had with his family and how his daughter is getting ready to start school.");
        System.out.println("Later that night, he came to visit " + protagonist + " to check on him. A knock on the door is heard. Looking at a peephole as he talks.\n");

        System.out.println(neighbor + ": Hey neighbor. Long time no see. How's life?");
        System.out.println("\nChoose a response: (1 or 2)");
        System.out.println("1. Same as it ever was");
        System.out.println("2. Fine");
        int response1 = scanner.nextInt();
        if (response1 == 1) {
            System.out.println(neighbor + ": Hey, I came here over for a reason. I'm a little worried about you.");
            System.out.println(neighbor + ": I just got off the phone with my cousin. She told me the news is saying something weird is going on with the sun.");
            System.out.println(neighbor + ": And that there are people coming up from underground. They are calling them Visitors for whatever reason.");
        } else {
            System.out.println(neighbor + ": Something real bad seems to be headed our way. I just got off the phone with my cousin. She told me the news is saying something weird is going on with the sun. It also said there're people coming up from underground. They are calling them Visitors for whatever reason.");
        }
        System.out.println(neighbor + ": Creepy stuff, huh? I sure hope it's not true.");
        System.out.println("\nChoose a response: (1 or 2)");
        System.out.println("1. What is happening with the sun?");
        System.out.println("2. Visitors?");
        int response2 = scanner.nextInt();
        if (response2 == 1) {
            System.out.println(neighbor + ": Either it is gonna explode or something is gonna explode on it... Not totally sure. All I know is something is wrong with it. You noticed this summer has been the hottest one ever right? I think we need to prepare ourselves for the worst.");
        } else {
            System.out.println(neighbor + ": Yeah, That is what they are calling the people from underground. I guess its because they are visitors from Earth? Or the surface, at least. Or maybe its because they are going around trying to get into people's houses.");
        }
        System.out.println("......");
        System.out.println(neighbor + ": My cousin said that staying home alone is dangerous. So I came over so you don't end up hurt or worse.");
        System.out.println("\nChoose a response: (1, 2, 3)");
        System.out.println("1. Okay");
        System.out.println("2. I can look after myself");
        System.out.println("3. How are your wife and daughter holding up?");
        int response3 = scanner.nextInt();
        if (response3 == 1) {
            System.out.println(neighbor + ": Great. Let's continue this conversation in the morning then.");
        } else if (response3 == 2) {
            System.out.println(neighbor + ": I'm sure you can. But I'm not sure you understand just how dangerous it is to be alone right now.");
        } else {
            helpedNeighbor = true;
            System.out.println(neighbor + ": Don't worry about my family. A good friend of mine is staying with us right now. He's looking after them while I'm here.");
        }
        System.out.println(neighbor + ": Let's continue this conversation in the morning, then. I'll see you in the kitchen when you wake up. See you in the morning.\n\n");
        System.out.println("The conversation ends as the neighbor leaves. You return to bed and fall asleep.\n");

        // Day 2
        System.out.println("The next day you checked the tv for the news. At 6:28am today, there was a powerful emission of energy from the sun. This burst was larger than the scientists had predicted. The temperature outside has reached critical levels. The government has declared a state of emergency. Refrain from going outside during the day.\n");
        System.out.println("You go to the kitchen and talk to your neighbor.\n");

        System.out.println(neighbor + ": Damn.. So it's all true, after all. Well then, everything I said makes sense. Don't go outside during the day. And you have to let other people in.");
        System.out.println("\nChoose a response: (1, 2, or 3)");
        System.out.println("1. Why would I let strangers into my house?");
        System.out.println("2. Let people in?");
        System.out.println("3. What do we need to do?");
        int response4 = scanner.nextInt();
        if (response4 == 1) {
            System.out.println(neighbor + ": I know you prefer to keep your distance from people, but you have to. My cousin doesn't know for sure why we can't just bunker down by ourselves. But she mentioned that if anyone comes and asks if you're alone, say no and tell them someone's in the house with you.");
        } else if (response4 == 2) {
            System.out.println(neighbor + ": I get that.. I know you might not be crazy about having company over. But you have to let them in. My cousin doesn't know for sure why we can't just bunker down by ourselves... But she mentioned that if anyone comes and asks if you're alone, say no and tell them someone's in the house with you.");
        } else {
            System.out.println(neighbor + ": I'm afraid all we can do now is try to survive. And hope this nightmare ends soon. I'm sure the government will help us somehow. Maybe they'll lead everyone to shelter or something like that. If they do, stick together with me and my family. Alright, that's it from me.");
        }
        System.out.println("\n\nOh, right, almost forgot. I'm heading back home tomorrow night. Write down my number, they just set up the line over there.(XXXXXX). We'll keep in touch on the phone. Okay, now that's really it. Crack a beer and get some sleep.\n");
        System.out.println("Right after ending your conversation. You took a can of beer from the fridge and proceeded to go to your bedroom and get some sleep.");
        System.out.println("\nAt night you woke up to a knock on the door. You look through the peephole and see a face.\n");
        System.out.println(girl + ": Hi! Is my daddy here? Can you get him for me? I was okay before, but I'm really scared now. There are lots of strange people out here tonight...");
        System.out.println("\nChoose a response: (1, 2, 3, 4)");
        System.out.println("1. What's your dad's name?");
        System.out.println("2. Tell me something about your dad.");
        System.out.println("3. How did you get here in one piece?");
        System.out.println("4. Are you afraid of visitors?");
        int response5 = scanner.nextInt();
        if (response5 == 1) {
            System.out.println(girl + ": You forgot his name? Oh, wait - you're just testing to see if I'm a visitor or not. You're smart! I'll start asking questions to test people, too.");
        } else if (response5 == 2) {
            System.out.println(girl + ": He makes fun games for me to play when I'm scared. He always tell me that if I'm brave, I'll make it through the night.");
        } else if (response5 == 3) {
            System.out.println(girl + ": I don't know, everything feels like it's opposite day now. I'm still scared of the dark, but maybe there's nothing to be afraid of.. Or is there?");
        } else {
            System.out.println(girl + ": A little, but Daddy says if I ask enough questions, I'll always know who's real and who's not. So I'll be okay.");
        }
        System.out.println(protagonist + ": I'll get your dad for you. Just wait here for a second.");
        System.out.println("The neighbor leaves as he takes the little girl back to his house. Right after that, you hear a knock on the door. You answered.");
        System.out.println(cashier + ": H-Hello! Sorry to bother you so late.. It was just so hot out today, and the TV said we shouldn't go out in the sun, so.. Could you maybe.. Um, find some space for me?");
        System.out.println("\nChoose a response: (1 or 2)");
        System.out.println("1. Who are you?");
        System.out.println("2. How did you get here?");
        int response6 = scanner.nextInt();
        if (response6 == 1) {
            System.out.println(cashier + ": Umm, I lived out near the city. The asphalt over there is heating up pretty bad, as you can imagine, heh heh. I actually worked the register at a local store. At one point, I mean. I don't anymore. They, um.. fired me. I've always had bad luck with work..\n");
        } else {
            System.out.println(cashier + ": It's not like I wanted to come out here. The asphalt may be melting into goo under our feet, but it could be worse. Visitors came to my house. Heh.. Can you believe it!? They chased me out of my own home! So, now I'm just trying to find a place to hide from the sun.");
        }
        System.out.println("\nChoose a response: (1 or 2)");
        System.out.println("1. What will you do now?");
        System.out.println("2. What do you think will happen?");
        int response6follow = scanner.nextInt();
        if (response6follow == 1) {
            System.out.println(cashier + ": I don't know. I'm just trying to find a place to stay for the night. I can't go back to my apartment, it's too hot out there. I don't have any friends or family that I can stay with, so.. I guess I'll just have to find a place to sleep on the streets or something. It's not like I have any other options, really.");
        } else {
            System.out.println(cashier + ": I don't know. I just hope this whole thing blows over soon. It's really scary out there right now. I just want everything to go back to normal.");
        }
        System.out.println("\nWhat will you do?");
        System.out.println("Choose a response: (1 or 2)");
        System.out.println("1. Come in");
        System.out.println("2. You should leave");
        int response6c = scanner.nextInt();
        if (response6c == 1) {
            cashierInside = true;
            System.out.println(cashier + ": Thank you. Haha! Thanks so much - seriously! Now I get to live a little longer, thank god.");
            System.out.println("The cashier enters your house and closes the door behind her. She looks around and takes a deep breath, relieved to be out of the heat.");
        } else {
            System.out.println(cashier + ": Oh.. Okay. I understand. I'll just go find somewhere else to stay then. Thanks anyway.");
        }

        System.out.println("\nRight after that, another knock is heard on the door. A very loud one. You answered.");
        System.out.println(graveyardGuy + ": Hellooo? Anyone alive in there? Mind letting me in?");
        System.out.println("\nChoose a response: (1 or 2)");
        System.out.println("1. Don't bang on my door.");
        System.out.println("2. Did you see something out there?");
        int response7 = scanner.nextInt();
        if (response7 == 1) {
            System.out.println(graveyardGuy + ": Hey now, no hard feelings. Didn't mean to wake ya. Ain't been sleepin' a wink myself. Used to be a gravedigger y'know? Not that there's much point in it now..");
        } else {
            System.out.println(graveyardGuy + ": Oh, I've seen a lot of things out there. I've been out there every day since this whole thing started. I've seen people running around in the streets, trying to find shelter. I've seen people getting attacked by visitors. It's really scary out there right now. I just want to find a safe place to stay for the night.");
        }
        System.out.println("\nWhat will you do?");
        System.out.println("Choose a response: (1 or 2)");
        System.out.println("1. Come in");
        System.out.println("2. You should leave");
        int response7a = scanner.nextInt();
        if (response7a == 1) {
            gravediggerInside = true;
            System.out.println(graveyardGuy + ": Th- Thanks! Just be quick with that door, alright? Visitors might be right behind me.");
            System.out.println("The gravedigger enters your house and closes the door behind him. He looks around and takes a deep breath, relieved to be out of the heat.");
        } else {
            System.out.println(graveyardGuy + ": Oh.. Okay. I understand. I'll just go find somewhere else to stay then. Thanks anyway. Those visitors come knocking or worse.. they are already inside, just waiting for you.");
        }

        System.out.println("\nYou go to bed that night, exhausted from the night's events.");

        // ============================
        // DAY 3 - NEW CONTENT BEGINS
        // ============================
        System.out.println("\n\n======== DAY 3 ========\n");
        System.out.println("You wake up in the early morning hours to the sound of the emergency broadcast blaring from the TV you left on.\n");
        System.out.println("\"This is a public service announcement from the Federal Emergency Management Agency. All civilians are to remain indoors. Do NOT open your doors to strangers. Visitors have been confirmed in residential zones. A government convoy is moving through your district. Wave a white cloth from your window if you need assistance.\"");
        System.out.println("\nYou look out the window. The street is eerily quiet. Then you notice it — a figure in a dark coat standing completely still at the end of the road, staring directly at your house.");
        System.out.println("\nBehind you, you hear footsteps.");

        if (cashierInside || gravediggerInside) {
            if (cashierInside && gravediggerInside) {
                System.out.println("\nBoth the " + cashier + " and the " + graveyardGuy + " are awake, huddled together in the hallway, pale as ghosts.");
                System.out.println(cashier + ": Did.. did you hear that broadcast? We can't let anyone in. What if it's already too late?");
                System.out.println(graveyardGuy + ": I dug graves for a living. I can tell you — the thing outside ain't alive. Not in any normal sense.");
            } else if (cashierInside) {
                System.out.println("\nThe " + cashier + " is standing in the doorway of the hallway, clutching her arms.");
                System.out.println(cashier + ": I heard it too. That thing outside.. it hasn't moved since I noticed it. What do we do?");
            } else {
                System.out.println("\nThe " + graveyardGuy + " peers through the gap in the curtains.");
                System.out.println(graveyardGuy + ": That ain't the first time I've seen something like that. Out at the graveyard, right before all this started... things were coming up from the ground.");
            }
        } else {
            System.out.println("\nYou're alone. The silence in the house feels louder than any noise. The figure at the end of the road begins to walk toward your house.");
        }

        System.out.println("\nSuddenly — a loud knock on the back door. Not the front. The BACK door.");
        System.out.println(agent + " (muffled, urgent): Federal agent! Do NOT open the front door. I repeat — do not open the front door. Open the back. NOW.");
        System.out.println("\nChoose a response: (1, 2, or 3)");
        System.out.println("1. Open the back door immediately.");
        System.out.println("2. Demand identification first.");
        System.out.println("3. Ignore it and barricade both doors.");
        int response8 = scanner.nextInt();

        if (response8 == 1) {
            System.out.println("\nYou unlock and open the back door. A figure in a tactical vest rushes inside, slamming it shut behind him. He's breathless.");
            System.out.println(agent + ": Good. Smart. I'm with FEMA. We've been tracking a cluster of Visitors in this block. The one out front — don't look at it directly. It responds to eye contact.");
            System.out.println("\nHe pulls out a map and spreads it on your kitchen table.");
            System.out.println(agent + ": There's an underground shelter two streets over. We can move you and anyone else in this house in the next twenty minutes. But we have to go now, before sunrise.");

            if (cashierInside || gravediggerInside) {
                System.out.println("\nYour housemates gather around the map.");
                System.out.println(agent + ": Good. More people means more noise, but also more eyes. Stick together. Do NOT get separated.");
            }
            System.out.println("\nChoose a response: (1 or 2)");
            System.out.println("1. Agree to go with the agent.");
            System.out.println("2. Ask about the neighbor and his family first.");
            int response9 = scanner.nextInt();

            if (response9 == 2) {
                helpedNeighbor = true;
                System.out.println(protagonist + ": My neighbor — he has a wife and a daughter. Are they accounted for?");
                System.out.println(agent + ": ...(checks radio)... There's a family unit two houses down. They've been flagged. We'll loop them in.");
                System.out.println(neighbor + " (over radio): Speed? Is that you? We're all okay. Meet us by the old mailbox — the blue one.");
            } else {
                System.out.println(protagonist + ": Okay. Let's move.");
            }

            // ---- ENDING A: Escape with the agent ----
            System.out.println("\n\n======== THE EVACUATION ========\n");
            System.out.println("The group moves swiftly through the back alleys, avoiding the main streets. The air is thick with heat even in the dark of night. Street lights flicker.");
            System.out.println("You pass by the " + theorist + ", who is scrawling equations on a wall with chalk, muttering to himself.");
            System.out.println(theorist + ": They're not from underground, you know. They're from US. Echoes. Reflections in mass. The sun didn't break — it REVEALED.");
            System.out.println(agent + ": Don't engage. Keep moving.");

            if (cashierInside && gravediggerInside && helpedNeighbor) {
                System.out.println("\nAs you reach the shelter entrance — a reinforced steel door set into the hillside — you look back. Everyone you helped is right behind you.");
                System.out.println("The " + cashier + " clutches your sleeve and exhales.");
                System.out.println(cashier + ": Thank you. I mean it.");
                System.out.println("The " + graveyardGuy + " gives a slow nod. He's seen too much to say anything more.");
                System.out.println(neighbor + " catches up at the last second, daughter in arms.");
                System.out.println(neighbor + ": I knew you'd come through. I always knew.");
                System.out.println("\n>> ENDING A: THE SURVIVOR'S CIRCLE <<");
                System.out.println("You make it underground. The shelter is crowded but alive. Against all odds, every person you helped survived. In the days that follow, the world above grows quiet. But below ground, something is being rebuilt — starting with trust.");
            } else if ((cashierInside || gravediggerInside) && helpedNeighbor) {
                System.out.println("\nThe shelter door closes behind you. You made it — and so did a handful of others because of you.");
                System.out.println("\n>> ENDING B: ENOUGH TO MATTER <<");
                System.out.println("Not everyone made it. But some did. And that was enough. In the shelter, you learn that the Visitors are receding — something about the sun's pattern shifting. Slowly, cautiously, people begin to talk about going back up.");
            } else if (!cashierInside && !gravediggerInside && !helpedNeighbor) {
                System.out.println("\nYou make it to the shelter alone. The door shuts. You're safe.");
                System.out.println("But the shelter is quieter than you'd like. You don't know the people here.");
                System.out.println("Somewhere in the back of your mind, you think about the " + cashier + " and the " + graveyardGuy + " — and whether they found somewhere else.");
                System.out.println("\n>> ENDING C: ALONE IN THE CROWD <<");
                System.out.println("You survived. But survival without others feels hollow. The sun eventually cools. The Visitors disappear as quickly as they came. When you walk back into the sunlight for the first time, there's no one waiting for you.");
            } else {
                System.out.println("\nYou reach the shelter with some of the others. It's not perfect. But it's something.");
                System.out.println("\n>> ENDING D: FRAGILE HOPE <<");
                System.out.println("A few made it. Others didn't. The world above is different now — quieter, stranger. But people are still here, and that counts for something.");
            }

        } else if (response8 == 2) {
            System.out.println("\nYou press against the door.");
            System.out.println(protagonist + ": Slide your badge under the door. Now.");
            System.out.println("A pause. Then — a laminated card slides under the gap. FEMA. With a photo. It looks real.");
            System.out.println(agent + ": Satisfied? We have about fifteen minutes before the Visitor at your front makes its move. I've seen what happens when they do. Open. The. Door.");
            System.out.println("\nChoose a response: (1 or 2)");
            System.out.println("1. Open the door and let him in.");
            System.out.println("2. Refuse. Something feels wrong.");
            int response8b = scanner.nextInt();

            if (response8b == 1) {
                System.out.println("\nYou open the door. The agent steps in — real, breathless, urgent. Everything he says checks out.");
                System.out.println(agent + ": Smart move asking for the badge. A lot of people didn't. Visitors have been mimicking voices. Yours was the right call.");
                System.out.println("\nHe leads you and your housemates to the shelter. You arrive just as the sky begins to lighten.");
                System.out.println("\n>> ENDING E: TRUST BUT VERIFY <<");
                System.out.println("Your caution saved you. The shelter holds. Inside, the " + agent + " tells you that your block was one of the last to be cleared. Several neighbors didn't make it — but you did, and so did anyone you brought with you. It's a small miracle.");
            } else {
                System.out.println("\nYou back away from the door. A long silence.");
                System.out.println("Then the knocking stops.");
                System.out.println("\nFor a moment, everything is still. Then you hear it — a soft, rhythmic sound. Not knocking. Something else. A low humming from outside the front window.");
                System.out.println("\nThe figure is at the window now. It doesn't knock. It just... waits.");
                System.out.println("\nA voice — not the agent's, something older, flatter — speaks through the glass.");
                System.out.println(visitor + ": Are you alone?");
                System.out.println("\nChoose a response: (1 or 2)");
                System.out.println("1. Say nothing.");
                System.out.println("2. \"No. There are people here.\"");
                int response8c = scanner.nextInt();
                if (response8c == 2) {
                    System.out.println("\nThe humming stops. A long beat. And then the figure retreats, fading into the pre-dawn dark.");
                    System.out.println("\nYou realize the neighbor had been right all along — say someone is with you. They can't enter if they believe you're not alone.");
                    System.out.println("\n>> ENDING F: THE RIGHT ANSWER <<");
                    System.out.println("By morning, the Visitor is gone. The " + agent + " returns in the daylight with a convoy. You and whoever is with you are escorted to safety. The crisis is far from over — but you learned the one rule that mattered most.");
                } else {
                    System.out.println("\nYou say nothing. The humming grows louder.");
                    System.out.println("The window cracks. The cold seeps in despite the heat outside.");
                    System.out.println("\n>> ENDING G: THE COST OF SILENCE <<");
                    System.out.println("By morning, the house is found empty. A white cloth hangs from the window — but no one is left to wave it. The " + theorist + " later notes the address in his journal as one more proof of his theory. The echoes have a pattern. Silence is an invitation.");
                }
            }

        } else {
            // response8 == 3: barricade
            System.out.println("\nYou push the couch, the bookshelf — everything you can — against both doors.");
            if (cashierInside || gravediggerInside) {
                System.out.println("\nYour housemates help without question. The " + (cashierInside ? cashier : graveyardGuy) + " stacks chairs while you reinforce the windows with tape and towels.");
            }
            System.out.println("\nFor hours, nothing happens. You sit in the dark. The knocking from the back stops. The figure out front doesn't move.");
            System.out.println("\nThen — a voice through the wall. Faint, but familiar.");
            System.out.println(woman + " (from next door, through the wall): Is anyone there? Please.. I don't know what to do. My husband left last night to find supplies. He never came back. My baby is sick from the heat. Please, I can hear you in there.");
            System.out.println("\nChoose a response: (1 or 2)");
            System.out.println("1. Carefully move the barricade and let her in.");
            System.out.println("2. Speak to her through the wall but don't open anything.");
            int response8d = scanner.nextInt();

            if (response8d == 1) {
                System.out.println("\nYou shift the barricade just enough. The " + woman + " slips through with a bundled infant. She is trembling but unhurt.");
                System.out.println(woman + ": Thank you. Thank you. I thought I was going to lose her.");
                System.out.println("\nBy mid-morning, a convoy passes the street. You flag it down from the second-floor window with a white bedsheet.");
                System.out.println("\n>> ENDING H: THE OPEN WALL <<");
                System.out.println("The government convoy takes your group to a regional shelter. The baby recovers. The " + woman + " never stops thanking you. Isolation protected you through the night — but compassion is what got you all out alive. A fitting balance.");
            } else {
                System.out.println("\nYou press your mouth to the wall.");
                System.out.println(protagonist + ": I hear you. Stay low. Keep your baby cool with wet cloths if you can. A convoy is coming. Wave something white from your window the second you hear vehicles.");
                System.out.println(woman + " (quietly): Okay. Okay. I will. Thank you.");
                System.out.println("\nYou wait through the long night. When dawn comes, you hear the rumble of vehicles in the street below.");
                System.out.println("You look out — and see the " + woman + " leaning from her window with a white pillowcase.");
                System.out.println("\n>> ENDING I: WALLS BETWEEN US <<");
                System.out.println("You both survive, but separately. In the shelter, days later, you recognize her across a crowded room. She crosses to you and squeezes your hand without a word. Sometimes staying behind a wall is the only way to stay alive — and sometimes a voice through a wall is enough to save someone.");
            }
        }

        System.out.println("\n\n======== THE END ========");
        System.out.println("Thank you for reading. Are you a human?\n");
        scanner.close();
    }
}