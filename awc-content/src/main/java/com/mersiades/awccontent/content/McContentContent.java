package com.mersiades.awccontent.content;

import com.mersiades.awccontent.models.ContentItem;
import com.mersiades.awccontent.models.FirstSessionContent;
import com.mersiades.awccontent.models.McContent;
import com.mersiades.awccontent.models.TickerList;
import org.bson.types.ObjectId;

import java.util.List;

public class McContentContent {

    public static final TickerList agenda = TickerList.builder()
            .id(new ObjectId().toString())
            .title("Agenda")
            .items(List.of("Make Apocalypse World seem real.",
                    "Make the player's characters' lives not boring.",
                    "Play to find out what happens."))
            .build();
    public static final TickerList alwaysSay = TickerList.builder()
            .id(new ObjectId().toString())
            .title("Always say")
            .items(List.of("Always say what the principles demand.",
                    "Always say what the rules demand.",
                    "Always say what your prep demands.",
                    "Always say what honesty demands.")
            ).build();

    public static final TickerList principles = TickerList.builder()
            .id(new ObjectId().toString())
            .title("The principles")
            .items(List.of(
                    "Barf forth apocalyptica.",
                    "Address yourself to the characters, not the players.",
                    "Make your move, but misdirect.",
                    "Make your move, but never speak its name.",
                    "Look through crosshairs.",
                    "Name everyone, make everyone human.",
                    "Ask provocative questions and build on the answers.",
                    "Respond with fuckery and intermittent rewards.",
                    "Be a fan of the characters.",
                    "Think offscreen, too.",
                    "Sometimes, disclaim decision-making."
            ))
            .build();
    public static final TickerList moves = TickerList.builder()
            .id(new ObjectId().toString())
            .title("Your moves")
            .items(List.of("Separate them.",
                    "Capture someone.",
                    "Put someone in a spot.",
                    "Trade harm for harm (_as established_).",
                    "Announce off-screen badness.",
                    "Announce future badness.",
                    "Inflict harm (_as established_).",
                    "Take away their stuff.",
                    "Make them buy.",
                    "Activate their stuff's downside.",
                    "Tell them the possible consequences and ask.",
                    "Offer an opportunity, with or without a cost.",
                    "Turn their move back on them.",
                    "Make a threat move (_from one of your threats_).",
                    "After every move: \"what do you do?\""))
            .build();
    public static final TickerList essentialThreats = TickerList.builder()
            .id(new ObjectId().toString())
            .title("Essential threats")
            .items(List.of("Where the PCs are, create as a landscape.",
                    "For any PC's gang, create as brutes.",
                    "For any PC's other NPCs, create as brutes, plus a grotesque and/or a wannabe warlord.",
                    "For any PC's vehicles, create as vehicles.",
                    "In any local populations, create an affliction"
            ))
            .build();
    public static final TickerList moreThings = TickerList.builder()
            .id(new ObjectId().toString())
            .title("A few more things to do")
            .items(List.of(
                    "Make maps.",
                    "Turn questions back on the asker or over to the group at large.",
                    "Digress occasionally.",
                    "Elide the action sometimes, and zoom in on its details other times.",
                    "Go around the table.",
                    "Take breaks and take your time"
            ))
            .build();
    public static final ContentItem decisionMaking = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Decision-making")
            .content("In order to play to find out what happens, you'll need to pass decision-making off sometimes.\n" +
                    "\n" +
                    "Whenever something comes up that you'd prefer not to decide by personal whim and will, _don't_.\n" +
                    "\n" +
                    "The game gives your four key tools you can use to disclaim responsibility. You can:\n" +
                    "\n" +
                    "- Put it in your NPCs' hands.\n" +
                    "- Put it in the players' hands.\n" +
                    "- Create a countdown.\n" +
                    "- Make it a stakes question.")
            .build();
    public static final ContentItem duringCharacterCreation = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("During character creation")
            .content("While the players are making their characters, there are some things to get out up-front:\n" +
                    "\n" +
                    "- Your characters don't have to be friends, but they should definitely be allies.\n" +
                    "- Your characters are unique in Apocalypse World.\n" +
                    "- 1-armor can be armor or clothing. 2-armor is armor.\n" +
                    "- Is _barter_ a medium of exchange? What do you use?\n" +
                    "- I'm not out to get you. I'm here to find out what's going to happen. Same as you!")
            .build();
    public static final TickerList duringFirstSession = TickerList.builder()
            .id(new ObjectId().toString())
            .title("During the first session")
            .items(List.of(
                    "MC the game. Bring it.",
                    "Describe. Barf forth apocalyptica.",
                    "Springboard off character creation.",
                    "Ask questions all the time.",
                    "Leave yourself things to wonder about. Note them on the threat map.",
                    "Look for where they're not in control.",
                    "Push there.",
                    "Nudge the players to have their characters make their moves.",
                    "Give every character good screen time with other characters.",
                    "Leap forward with named, human NPCs.",
                    "Hell, have a fight.",
                    "Work on your threat map and essential threats."
                    )
            )
            .build();
    public static final ContentItem threatMapInstructions = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("The threat map")
            .content("During play, keep notes on the threats in the world by noting them on your threat map.\n" +
                    "\n" +
                    "The innermost circle is for the PCs and their resources. There, list the PCs' gangs, followers, crews, vehicles, and everything else they won that you'll be responsible to play. Most of your essential threats go here.\n" +
                    "\n" +
                    "In the next circle out, \"closer\", is for the NPCs that surround them and their immediate landscape.\n" +
                    "\n" +
                    "The third circle, \"farther\", is for things that they would have to travel in order to encounter.\n" +
                    "\n" +
                    "Things that they have only heard rumors of, or ideas you have that have not yet introduced, you can write in the outside circle, as \"notional\"." +
                    "\n" +
                    "North, south, east and west are for geography. Up and down are for above and below.\n" +
                    "\n" +
                    "In is for threats within the local or surrounding landscape or population, out is for threats originating in the world's psychic maelstrom or even elsewhere."
            )
            .build();
    public static final TickerList afterFirstSession = TickerList.builder()
            .id(new ObjectId().toString())
            .title("After the first session")
            .items(List.of("Go back over the threat map. Pull it apart into individual threats.",
                    "Consider the resources that are available to each of them, and the resources that aren't.",
                    "Create them as threats, using the threat creation rules.",
                    "Before the second session, be sure you've created your essential threats.")
            )
            .build();
    public static final ContentItem harm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Harm")
            .content("_**Harm as established**_ equals the inflicter's weapon's harm minus the sufferer's armor.\n" +
                    "\n" +
                    "When you suffer harm, make the harm move.")
            .build();
    public static final ContentItem exchangingHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Exchanging harm")
            .content("When you _**exchange harm**_, both side simultaneously inflict and suffer harm as established:\n" +
                    "\n" +
                    "- _You inflict harm equal to the harm rating of your weapon, minus the armor rating of your enemy's armor._\n" +
                    "- _You suffer harm equal to the harm rating of your enemy's weapon, minus the armor rating of your own armor._")
            .build();
    public static final ContentItem degrees = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Degrees of harm")
            .content("For each 1-harm you suffer, mark a segment of your harm countdown clock. Start in the 12:00-3:00 segment and continue around clockwise.\n" +
                    "\n" +
                    "The three segments before 9:00 are less serious, the three segments after 9:00 are more serious. Mark the 11:00-12:00 segment and your character's life has become untenable.\n" +
                    "\n" +
                    "Before 6:00 harm will go away by itself with time.\n" +
                    "\n" +
                    "6:00-9:00, the harm won't get worse or better by itself.\n" +
                    "\n" +
                    "After 9:00, unstabilized harm will get worse by itself, stabilized harm will not, and it'll get better only with medical treatment.\n" +
                    "\n" +
                    "When life becomes untenable, choose 1:\n" +
                    "\n" +
                    "- _Come back with -1hard_\n" +
                    "- _Come back with +1weird_\n" +
                    "- _Change to a new playbook_\n" +
                    "- _Die_"
            )
            .build();
    public static final ContentItem npcHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("When an NPC takes harm")
            .content("_**1-harm**: cosmetic damage, pain, concussion, fear if the NPC's likely to be afraid of pain._\n" +
                    "\n" +
                    "_**2-harm**: wounds, unconsciousness, bad pain,broken bones, shock. Likely fatal, occasionally immediately fatal._\n" +
                    "\n" +
                    "_**3-harm**: give it 50-50 it's immediately fatal. Otherwise, terrible wounds, shock, death soon._\n" +
                    "\n" +
                    "_**4-harm**: usually immediately fatal, but sometimes the poor fuck has to wait to die, mangled and ruined._\n" +
                    "\n" +
                    "_**5-harm and more**: fatal and increasingly bodily destructive._"
            )
            .build();
    public static final ContentItem gangAsWeapon = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Using a gang as a weapon")
            .content("When you have a gang, you can _**sucker someone**_, _**go aggro on them**_, or make a _**battle move**_, using your gang as a weapon.\n" +
                    "\n" +
                    "When you do, you roll the dice and make your choices, but it’s your gang that inflicts and suffers harm, not you yourself.\n" +
                    "\n" +
                    "Gangs _**inflict and suffer harm as established**_, as usual: they inflict harm equal to their own harm rating, minus their enemy’s armor rating, and the suffer harm equal to their enemy’s harm rating minus their own armor. Harm = weapon - armor.\n" +
                    "\n" +
                    "However, if there’s a _**size mismatch**_, the bigger gang inflicts +1harm and gets +1armor for each step of size difference:\n" +
                    "\n" +
                    "- *Against a single person, a small gang inflicts +1harm and gets +1armor. A medium gang inflicts +2harm and gets +2armor, and a large gang inflicts +3harm and gets +3armor.*\n" +
                    "- *Against a small gang, a medium gang inflicts +1harm and gets +1armor, and a large gang inflicts +2harm and gets +2armor.*\n" +
                    "- *Give you something they think you want, or tell you what you want to hear.*\n" +
                    "- *Against a medium gang, a large gang inflicts +1harm and gets +1armor.*")
            .build();
    public static final ContentItem gangHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("When a gang takes harm")
            .content("_**1-harm**: a few injuries, one or two serious, no fatalities._\n" +
                    "\n" +
                    "_**2-harm**: many injuries, several serious, a couple of fatalities._\n" +
                    "\n" +
                    "_**3-harm**: widespread injuries, many serious, several fatalities._\n" +
                    "\n" +
                    "_**4-harm**: widespread serious injuries, many fatalities._\n" +
                    "\n" +
                    "_**5-harm and more**: widespread fatalities, few survivors._\n" +
                    "\n" +
                    "_**Does the gang hold together?**_\n" +
                    "With a strong, present leader, a gang will hold together if it suffers up to 4-harm.\n" +
                    "\n" +
                    "If the leader is weak or absent, it'll hold together if it suffers up to 3-harm.\n" +
                    "\n" +
                    "If the leader is both weak and absent, it'll hold together if it suffers 1- or 2-harm.\n" +
                    "\n" +
                    "If it has no leader, it'll hold together if it suffers 1-harm, but no more.\n" +
                    "\n" +
                    "A PC gang leader can hold a gang together by imposing her will on it, if she has pack alpha, by ordering it to hold discipline, or if she has leadership, but otherwise it follows these rules, same as for NPCs.\n" +
                    "\n" +
                    "_**What about PC gang members?**_\n" +
                    "If a PC is a member of a gang taking harm, how much harm teh PC takes depends on her role in the gang.\n" +
                    "\n" +
                    "If she's a leader or prominent, visible member, she suffers the same harm the gang does.\n" +
                    "\n" +
                    "If she's just someone in the gang, or if she's intentionally protecting herself from harm instead of fighting with the gang, she suffers 1-harm less."
            )
            .build();
    public static final ContentItem vehicleAsWeapon = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Using a vehicle as a weapon")
            .content("When you you're behind the wheel, you can _**sucker someone**_, _**go aggro on them**_, or make a _**battle move**_, using your vehicle as a weapon.\n" +
                    "\n" +
                    "When you do, you roll the dice and make your choices, but it’s your vehicle that inflicts and suffers harm, not you yourself.\n" + "\n" +
                    "\n" +
                    "_**Against a person**_\n" +
                    "\n" +
                    "- _A glancing hit from a moving vehicle inflicts 2-harm (ap)._\n" +
                    "- _A direct hit from a moving vehicle inflicts 3-harm (ap) plus its massive._\n" +
                    "\n" +
                    "_**Against another vehicle:**_\n" +
                    "\n" +
                    "- _A glancing hit inflicts v-harm._\n" +
                    "- _A direct hit inflicts 3-harm plus its massive, minus the target vehicle's massive and armor. Treat 0-harm and less as v-harm._\n" +
                    "- _When you're able to ram or T-bone another vehicle, you inflict the harm of a direct hit (3-harm + massive, minus your target's armor + massive) and suffer the harm of a glancing hit (v-harm)._\n" +
                    "\n" +
                    "_**Against a building or structure:**_\n" +
                    "\n" +
                    "- _A glancing hit from a moving vehicle inflicts 2-harm._\n" +
                    "- _A direct hit from a moving vehicle inflicts 3-harm plus its massive, minus the structure's armor._"
            )
            .build();
    public static final ContentItem vehicleHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("When a vehicle suffers harm")
            .content("Vehicles can suffer regular harm, from bullets, explosions and direct hits from other vehicles, or v-harm, from glancing hits.\n" +
                    "\n" +
                    "When a vehicle suffers regular harm, there are two considerations: how much damage the vehicle itself suffers, and how much blows through to the people inside.\n" +
                    "\n" +
                    "_**1-harm**: cosmetic damage. Bullet holes, broken glass, smoke. **0-harm can blow through** to passengers._\n" +
                    "\n" +
                    "_**2-harm**: functional damage. Fuel leak, shot-out tires, engine stall, problems with steering, braking or acceleration. Can be field-patched. **1-harm can blow through** to passengers._\n" +
                    "\n" +
                    "_**3-harm**: serious damage. Functional damage affecting multiple functions, but can be field patched. **2-harm can blow through** to passengers._\n" +
                    "\n" +
                    "_**4-harm**: breakdown. Catastrophic functional damage, can be repaired in the garage but not in the field, or can be used for parts. **3-harm can blow through** to passengers._\n" +
                    "\n" +
                    "_**5-harm and more**: total destruction. **Full harm can blow through** to passengers, plus they can suffer additional harm if the vehicle explodes or crashes._\n" +
                    "\n" +
                    "Whether harm blows through to a vehicle's driver and passengers, doesn't blow through, or just hits them too without having to blow through, depends on the MC's judgement of the circumstances and the vehicle.")
            .build();
    public static final ContentItem vharm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("V-harm")
            .content("_**V-harm as established**_ is the attacking car's massive minus the defending car's massive or handling, defender's choice.\n" +
                    "\n" +
                    "When you _**suffer vh-harm**_, roll+v-harm suffered.\n" +
                    "\n" +
                    "On a 10+, you lose control, and your attacker chooses 1:\n" +
                    "\n" +
                    "- _You crash._\n" +
                    "- _You spin out._\n" +
                    "- _Choose 2 from the 7-9 list below._\n" +
                    "\n" +
                    "On a 7-9, you're forced to swerve. Your attacker chooses 1:\n" +
                    "\n" +
                    "- _You give ground._\n" +
                    "- _You're driven off course, or forced into a new course._\n" +
                    "- _Your car takes 1-harm ap, right in the transmission._\n" +
                    "\n" +
                    "On a miss, you swerve but recover without disadvantage."
            )
            .build();
    public static final ContentItem buildingHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("When a building takes harm")
            .content("As with vehicles, when a building suffers harm, there are two considerations: structural damage to the building itself, and how much of the harm blows through to the people inside.\n" +
                    "\n" +
                    "Harm to buildings and other structures is non-cumulative. Don't bother tracking a building's harm on a countdown. Shooting a building 3 times with your 3-harm shotgun doesn't add up to 9-harm and make the building collapse.\n" +
                    "\n" +
                    "_**When a building or structure suffers...**_\n" +
                    "\n" +
                    "_**1-harm - 3-harm**: cosmetic damage. Bullet holes, broken glass, scorch marks, chipped surfaces. **0-harm can blow through** to inhabitants._\n" +
                    "\n" +
                    "_**4-harm - 6-harm**: severe cosmetic damage. Many holes or large holes, no intact glass, burning or smoldering. **2-harm can blow through** to inhabitants._\n" +
                    "\n" +
                    "_**7-harm - 8-harm**: structural damage. Strained load-bearing walls or pillars, partial collapse, raging fire. **4-harm can blow through** to inhabitants.  Further structural damage can lead to full collapse._\n" +
                    "\n" +
                    "_**9-harm and more**: destruction. **Full harm can blow through** to inhabitants, plus they can suffer additional harm as the building or structure collapses._\n" +
                    "\n" +
                    "Whether harm actually blows through to a building's inhabitants depends on the MC's judgement of the circumstances and the building. Don't stand near the windows!")
            .build();
    public static final ContentItem dHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("D-harm")
            .content("A person suffers d-harm from deprivation. d-harm is strictly for acute cases of deprivation. For scarcity and chronic deprivation, create affliction threats instead.\n" +
                    "\n" +
                    "Individual NPCs simply suffer the effects of d-harm as follows.\n" +
                    "\n" +
                    "For PCs, suffering d-harm, tell them the effects they're suffering, and if they can't or don't alleviate their deprivation, inflict regular harm alongside it, in increments of 1-harm ap.\n" +
                    "\n" +
                    "For a population suffering d-harm, the two questions are how it behaves, and how long it can last before breaking up, tearing itself apart, or dying.\n" +
                    "\n" +
                    "_**d-harm (air)**_, asphyxiation: Difficulty breathing, panic, convulsions, paralysis, unconsciousness, brain damage, death within minutes.\n" +
                    "\n" +
                    "Inflicted on a population: Immediate panic. Social cohesion breaks down basically at once into a survival-driven desperation to find air.\n" +
                    "\n" +
                    "_**d-harm (warmth)**_, hypothermia: shivering, hunger, dizziness, confusion, drowsiness, frostbite, delirium, unconsciousness, irregular heartbeat, death in an hour or more, depending on the cold.\n" +
                    "\n" +
                    "Inflicted on a population: Huddling together, despair, lethargy, resignation. Isolated individuals suffer worsening individual symptoms, so social cohesion can last basically as long as the individuals can.\n" +
                    "\n" +
                    "_**d-harm (cool)**_, heat stroke: headache, dehydration, weakness or cramps, confusion, fever, vomiting, seizures, unconsciousness, death in an hour or more, depending on the heat.\n" +
                    "\n" +
                    "Inflicted on a population: Desperation, panic, lethargy, resignation. Social cohesion can last as long as the individuals can, as the less vulnerable individuals try to help the more vulnerable.\n" +
                    "\n" +
                    "_**d-harm (water)**_, dehydration: desperation, headache, confusion, delirium, collapse, death in 3 days.\n" +
                    "\n" +
                    "Inflicted on a population: Rationing and hoarding, desperation, infighting. Social cohesion can last up to a week before breaking down into violence or dispersal.\n" +
                    "\n" +
                    "_**d-harm (food)**_, starvation: irritability, hunger, weakness, diarrhea, lethargy, dehydration, muscular atrophy, heart failure and death within 2-3 months.\n" +
                    "\n" +
                    "Inflicted on a population: Rationing and hoarding, desperation, infighting. Social cohesion can last up to 2 weeks before breaking down into violence, cannibalism, or dispersal.\n" +
                    "\n" +
                    "_**d-harm (sleep)**_, sleep deprivation: irritability, disorientation, nodding off, depression, headache, hallucinations, mania, personality changes, bizarre behavior.\n" +
                    "\n" +
                    "Inflicted on a population: Malaise, infighting, tantrums, desperation. For long-term acute sleep deprivation, create affliction threats instead."
            )
            .build();
    public static final ContentItem psiHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("&Psi;-harm")
            .content("A person suffers &Psi;-harm from exposure to the world's psychic maelstrom.\n" +
                    "\n" +
                    "When an NPC suffers &Psi;-harm, create her as a threat if necessary, and then choose any or all:\n" +
                    "\n" +
                    "- _She aggressively pursues her threat impulse. Make moves on her behalf as hard and as direct as you can._\n" +
                    "- _Her sanity shatters. She is incoherent, raving, raging or unresponsive, alive but gone._\n" +
                    "- _She abruptly changes threat type._\n" +
                    "\n" +
                    "_**For players' characters:**_\n" +
                    "When you suffer &Psi;-harm, roll+&Psi;-harm suffered (typically, roll+1).\n" +
                    "\n" +
                    "On a 10+, the MC can choose 1:\n" +
                    "\n" +
                    "- _You're out of action: unconscious, trapped, incoherent or panicked._\n" +
                    "- _You're out of your own control. You come to yourself again a few seconds later, having done I-don't-know-what._\n" +
                    "- _Choose 2 from the list below._\n" +
                    "\n" +
                    "On a 7-9, the MC can choose 1:\n" +
                    "\n" +
                    "- _You lose your footing._\n" +
                    "- _You lose your grip on whatever you're holding._\n" +
                    "- _You lose track of someone or something you're attending to._\n" +
                    "- _You miss noticing something important._\n" +
                    "- _You take a single concrete action of the MC's choosing._\n" +
                    "\n" +
                    "On a miss, you keep it together and overcome the -harm with no effect.")
            .build();
    public static final ContentItem sHarm = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("S-harm")
            .content("s-harm means stun. It disables its target without causing any regular harm. Use it on a PC, and doing anything at all means doing it under fire; the fire is \"you're stunned\".")
            .build();
    public static final ContentItem lifestyle = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Lifestyle")
            .content("If the player pays _**1-barter**_ at the beginning of the session, the character has the same quality of life as most people around her.\n" +
                    "\n" +
                    "If she pays _**2-barter**_ at the beginning of the session, she has a quality of life that is substantially, notably better. Whatever other people eat, drink, and wear, she's eating, drinking, and wearing better. She sleeps more comfortably and safer, and has more control over her personal environment.\n" +
                    "\n" +
                    "If she pays _**0-barter**_, it could mean that at the beginning of the session she's desperately hungry and dying of thirst, but first ask some questions.\n" +
                    "\n" +
                    "First, to the other players: \"okay, so who's going to pay 1-barter to keep her alive?\"\n" +
                    "\n" +
                    "If none of them can or will, choose:\n" +
                    "\n" +
                    "- _Go straight to, yes, she's desperately hungry and dying of thirst. Inflict harm as established. Take away her stuff._\n" +
                    "- _Choose a suitable NPC -- Rolfball, for instance -- and say \"oh, that's okay, Rolfball's got you covered. That's good with you, yeah?\" Now there's a debt between her and your NPC, and you can bring it into play whenever you like._\n" +
                    "- _Say, \"well, okay, who do you think should pay to keep you alive? Rolfball? Fish? Who?\" You can either negotiate an appropriate arrangement in summary, or else jump into play: have her read a person, seduce and manipulate, go aggro, or whatever she needs to do to get her way._\n" +
                    "\n" +
                    "And remember that if she doesn't pay, and the other PCs don't pay, and no NPC pays, then tough luck. She's desperately hungry, dying of thirst, and you should inflict harm and take away her stuff."
            )
            .build();
    public static final ContentItem gigs = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Gigs")
            .content("When a player tells you that her character would like to _**work a gig**_, ask her what she has in mind. She might pick one from her list, or she might suggest a new one.\n" +
                    "\n" +
                    "It's up to you to decide whether to say yes, no, or not yet, like \"that's a good idea, but first you'll have to...\"\n" +
                    "\n" +
                    "Once you've settles that question and the character works the gig, you have to decide or find out how it goes. Successful? Unsuccessful? Dangerous? Easy?\n" +
                    "\n" +
                    "- _You can just decide._\n" +
                    "- _You can play it out in full._\n" +
                    "- _You can call for a move, or a quick snowball or moves, to summarize what happens._\n" +
                    "\n" +
                    "No matter which way you do it, the baseline for the pay is, when they work a gig, they get _**3-barter**_. You're allowed to pay 2- or 4-barter when you feel like it should, but save them for exceptional outcomes.")
            .build();
    public static final ContentItem creatingVehicle = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Creating a vehicle")
            .content("_These are rules for a wider range of vehicles than is usually available to the PCs._\n" +
                    "\n" +
                    "By default, any vehicle has speed=0, handling=0, 0-armor, and the massive rating of its frame.\n" +
                    "\n" +
                    "Name its frame and assign it a massive from 0 up. Use these examples to guide you:\n" +
                    "\n" +
                    "- _Massive=0: bike, jetski, canoe, ultralight, 1 battle option._\n" +
                    "- _Massive=1: trike or big 4-wheeler, tiny car, rowboat. 2 battle options._\n" +
                    "- _Massive=2: car, small speedboat, autogyro. 2 battle options._\n" +
                    "- _Massive=3: huge road vehicle, speedboat, yacht, small helicopter, small prop plane. 2 battle options._\n" +
                    "- _Massive=4: huge construction vehicle, and actual tank, tour boat, helicopter, small jet, single train car. 3 battle options._\n" +
                    "- _Massive=5: large tour boat, large helicopter, small passenger plane or jet. 4 battle options._\n" +
                    "- _Massive over 5: for each 1massive over, add +1battle option._\n" +
                    "\n" +
                    "_**Strengths**_ (choose 1 or 2): Fast, rugged, aggressive, tight, huge, off-road, responsive, uncomplaining, capacious, workhorse, easily-repaired, or make one up.\n" +
                    "\n" +
                    "_**Looks**_ (choose 1 or 2): Sleek, vintage, pristine, powerful, luxe, flashy, muscular, quirky, pretty handcrafted, spikes & plates, garish, cobbled-together, hardworked, or make one up.\n" +
                    "\n" +
                    "_**Weakness**_ (choose 1 or 2): Slow, loud, lazy, sloppy, cramped, picky, guzzler, unreliable, rabbity, temperamental, or make one up.\n" +
                    "\n" +
                    "_**Battle options**_ (choose according to frame): +1speed, +1handling, +1massive, +1armor. You can double up if you choose."
            )
            .build();
    public static final ContentItem creatingBattleVehicle = ContentItem.builder()
            .id(new ObjectId().toString())
            .title("Creating a specialized battle vehicle")
            .content("Create the vehicle as normal, and then choose 2:\n" +
                    "\n" +
                    "- _+1 battle option (+1speed, +1handling, +1massive, or +1 armor)_\n" +
                    "- _Mounted machine guns (3-harm close/far area messy)_\n" +
                    "- _Mounted grenade launcher (4-harm close area messy)_\n" +
                    "- _Ram or ramming spikes (as a weapon, vehicle inflicts +1harm)_\n" +
                    "- _Mounted 50cal mg (5-harm far area messy)_\n" +
                    "- _Mounted boarding platform or harness (+1 to attempts to board another vehicle from this one)_")
            .build();
    public static final FirstSessionContent firstSessionContent = FirstSessionContent.builder()
            .id(new ObjectId().toString())
            .intro("The players have it easy. They have these fun little procedures to go through and then they're ready to play.\n" +
                    "\n" +
                    "Your job is harder, you have a lot more to set up then they do.\n" +
                    "\n" +
                    "They each have one character to create, you have the whole bedamned world, so you get the whole first session to create it in."
            )
            .duringCharacterCreation(duringCharacterCreation)
            .duringFirstSession(duringFirstSession)
            .threatMapInstructions(threatMapInstructions)
            .afterFirstSession(afterFirstSession)
            .build();

    public static final McContent mcContent = McContent.builder()
            .id(new ObjectId().toString())
            .firstSessionContent(firstSessionContent)
            .decisionMaking(decisionMaking)
            .core(List.of(agenda, alwaysSay, principles, moves, essentialThreats, moreThings))
            .harm(List.of(harm, exchangingHarm, degrees, npcHarm, gangAsWeapon, gangHarm, vehicleAsWeapon, vehicleHarm, vharm, buildingHarm, dHarm, psiHarm, sHarm))
            .selected(List.of(lifestyle, gigs, creatingVehicle, creatingBattleVehicle))
            .build();
}
