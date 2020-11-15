package com.ren.worldwariibattleships;

import java.util.ArrayList;

public class BattleshipData {
    private static String[] battleshipNames = {
            "USS Washington (BB-56)",
            "USS North Carolina (BB-55)",
            "HMS Prince of Wales (53)",
            "HMS King George V (41)",
            "HMS Warspite (03)",
            "IJN Nagato",
            "IJN Yamato",
            "KMS Bismarck",
            "KMS Tirpitz",
            "RM Littorio",
            "MNF Jean Bart",
            "FFNF Richelieu"
    };

    private static String[] battleshipDetails = {
            "USS Washington (BB-56) was the second and final member of the North Carolina class of fast battleships, the first vessel of the type built for the United States Navy. Built under the Washington Treaty system. The ship was laid down in 1938 and completed in May 1941, while the United States was still neutral during World War II. Her initial career was spent training along the East Coast of the United States until after Japan attacked Pearl Harbor on 7 December 1941, bringing the United States into the war.",
            "USS North Carolina (BB-55) is the lead ship of the North Carolina class of fast battleships, the first vessel of the type built for the United States Navy. Built under the Washington Treaty system. The ship was laid down in 1937 and completed in April 1941, while the United States was still neutral during World War II. During this period, she operated off the eastern coast of the United States. ",
            "HMS Prince of Wales (53) was a King George V-class battleship of the Royal Navy, built at the Cammell Laird shipyard in Birkenhead, England. She had an extensive battle history, first seeing action in August 1940 while still being outfitted in her drydock when she was attacked and damaged by German aircraft.  she was involved in several key actions of the Second World War, including the May 1941 Battle of the Denmark Strait against the German battleship Bismarck, escorting one of the Malta convoys in the Mediterranean, and then attempting to intercept Japanese troop convoys off the coast of Malaya when she was lost on 10 December 1941.",
            "HMS King George V (41) was the lead ship of the five British King George V-class battleships of the Royal Navy. Laid down in 1937 and commissioned in 1940.  King George V operated during the Second World War in all three major theatres of war, the Atlantic, Mediterranean and Pacific, as well as part of the British Home Fleet and Pacific Fleets. In May 1941, along with HMS Rodney, King George V was involved in the hunt for and pursuit of the German battleship Bismarck, eventually inflicting severe damage which led to the German vessel's sinking. ",
            "HMS Warspite (03) was a Queen Elizabeth-class battleship built for the Royal Navy during the early 1910s. Completed during the First World War in 1915, she was assigned to the Grand Fleet and participated in the Battle of Jutland. her service during the war generally consisted of routine patrols and training in the North Sea. During the Second World War, Warspite was involved in the Norwegian Campaign in early 1940 and was transferred to the Mediterranean later that year where the ship participated in fleet actions against the Royal Italian Navy (Regia Marina) while also escorting convoys and bombarding Italian troops ashore.",
            "IJN Nagato (長門), named for Nagato Province, was a super-dreadnought battleship built for the Imperial Japanese Navy (IJN). Completed in 1920 as the lead ship of her class, she carried supplies for the survivors of the Great Kantō earthquake in 1923. The ship was modernized in 1934–1936 with improvements to her armor and machinery and a rebuilt superstructure in the pagoda mast style. Nagato briefly participated in the Second Sino-Japanese War in 1937 and was the flagship of Admiral Isoroku Yamamoto during the attack on Pearl Harbor. She covered the withdrawal of the attacking ships and did not participate in the attack itself.",
            "IJN Yamato (大和, \"Great Harmony\") was the lead ship of her class of battleships built for the Imperial Japanese Navy (IJN) shortly before World War II. She and her sister ship, Musashi, were the heaviest and most powerfully armed battleships ever constructed, displacing 72,800 tonnes at full load and armed with nine 46 cm (18.1 in) Type 94 main guns, which were the largest guns ever mounted on a warship. Named after the ancient Japanese Yamato Province, Yamato was designed to counter the numerically superior battleship fleet of the United States, Japan's main rival in the Pacific. She was laid down in 1937 and formally commissioned a week after the Pearl Harbor attack in late 1941.",
            "KMS Bismarck was the first of two Bismarck-class battleships built for Nazi Germany's Kriegsmarine. Named after Chancellor Otto von Bismarck, the ship was laid down at the Blohm & Voss shipyard in Hamburg in July 1936 and launched in February 1939. Work was completed in August 1940, when she was commissioned into the German fleet. Bismarck and her sister ship Tirpitz were the largest battleships ever built by Germany, and two of the largest built by any European power. In the course of the warship's eight-month career under its sole commanding officer, Captain Ernst Lindemann, Bismarck conducted only one offensive operation, lasting 8 days in May 1941, codenamed Rheinübung.",
            "KMS Tirpitz was the second of two Bismarck-class battleships built for Nazi Germany's Kriegsmarine (navy) prior to and during the Second World War. Named after Grand Admiral Alfred von Tirpitz, the architect of the Kaiserliche Marine (Imperial Navy), the ship was laid down at the Kriegsmarinewerft Wilhelmshaven in November 1936 and her hull was launched two and a half years later. Work was completed in February 1941, when she was commissioned into the German fleet. Like her sister ship Bismarck, Tirpitz was armed with a main battery of eight 38-centimetre (15 in) guns in four twin turrets.",
            "RM Littorio was the lead ship of her class of battleship; she served in the Italian Regia Marina (Royal Navy) during World War II. She was named after the Lictor (\"Littorio\" in Italian), in ancient times the bearer of the Roman fasces, which was adopted as the symbol of Italian Fascism. Littorio and her sister Vittorio Veneto were built in response to the French battleships Dunkerque and Strasbourg. They were Italy's first modern battleships, and the first 35,000-ton capital ships of any nation to be laid down under the terms of the Washington Naval Treaty. Littorio was laid down in October 1934, launched in August 1937, and completed in May 1940.",
            "MNF Jean Bart was a French fast battleship, the second and final member of the Richelieu class. Built as a response to the Italian Littorio class, the Richelieus were based on their immediate predecessors of the Dunkerque class with the same unconventional arrangement that grouped their main battery forward in two quadruple gun turrets. Jean Bart was laid down in 1936 and was launched in 1940, following the outbreak of World War II in Europe. The ship was not complete by the time Germany won the Battle of France, and Jean Bart was rushed to Casablanca to escape advancing German troops. She had only one of her main turrets installed, along with a handful of anti-aircraft guns.",
            "FFNF Richelieu was a French fast battleship, the lead ship of the Richelieu class. Built as a response to the Italian Littorio class, the Richelieus were based on their immediate predecessors of the Dunkerque class with the same unconventional arrangement that grouped their main battery forward in two quadruple gun turrets. Richelieu was laid down in 1935 and was launched in 1939, just before the outbreak of World War II in Europe. As war with Germany became increasingly likely, work on the ship was rushed to prepare her for commissioning in April 1940."
    };

    private static int[] battleshipImages = {
            R.drawable.uss_washington,
            R.drawable.uss_north_carolina,
            R.drawable.hms_prince_of_wales,
            R.drawable.hms_king_george_v,
            R.drawable.hms_warspite,
            R.drawable.ijn_nagato,
            R.drawable.ijn_yamato,
            R.drawable.kms_bismarck,
            R.drawable.kms_tirpitz,
            R.drawable.rm_littorio,
            R.drawable.mnf_jean_bart,
            R.drawable.ffnf_richelieu

    };

    static ArrayList<Battleship> getListData() {
        ArrayList<Battleship> list = new ArrayList<>();
        for (int position = 0; position < battleshipNames.length; position++) {
            Battleship battleship = new Battleship();
            battleship.setNama_battleship(battleshipNames[position]);
            battleship.setDetail_battleship(battleshipDetails[position]);
            battleship.setPicture_battleship(battleshipImages[position]);
            list.add(battleship);
        }
        return list;
    }
}


