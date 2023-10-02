package com.example.finalproject;

public class DataBase {


    static String[] name1 = {"Sushi Rolls (Maki) + Miso Soup + Teriyaki Chicken + Tempura + Ramen Noodles + Gyoza (Japanese Dumplings) + " +
    "Okonomiyaki (Japanese Pancake) + Sashimi + Yakitori (Grilled Chicken Skewers) + Sukiyaki (Hot Pot) + " +
    "Udon Noodle Soup + Yakisoba (Stir-Fried Noodles) + Tonkatsu (Breaded Pork Cutlet) + " +
    "Chawanmushi (Steamed Egg Custard) + Yaki Udon (Stir-Fried Udon Noodles) + Nigiri Sushi + " +
    "Nabe (Japanese Hot Pot) + Chirashi Sushi (Scattered Sushi) + Oyakodon (Chicken and Egg Rice Bowl) + " +
    "Unagi Don (Grilled Eel Rice Bowl)"};

    static String[] recipeIngredients1 = {"Sushi Rolls (Maki):\n" +
    "Ingredients:\n" +
    "- Sushi rice\n" +
    "- Nori (seaweed sheets)\n" +
    "- Fresh fish or vegetables\n" +
    "- Soy sauce and wasabi for dipping" +

    "Miso Soup:\n" +
    "Ingredients:\n" +
    "- Miso paste\n" +
    "- Dashi (fish or seaweed stock)\n" +
    "- Tofu cubes\n" +
    "- Sliced green onions\n" +
    "- Wakame seaweed" +

    "Teriyaki Chicken:\n" +
    "Ingredients:\n" +
    "- Chicken thighs or breasts\n" +
    "- Soy sauce\n" +
    "- Mirin (sweet rice wine)\n" +
    "- Sugar\n" +
    "- Garlic and ginger (minced)" +

    "Tempura:\n" +
    "Ingredients:\n" +
    "- Shrimp, vegetables (e.g., sweet potato, zucchini)\n" +
    "- Tempura batter (flour, ice water, and egg)" +

    "Ramen Noodles:\n" +
    "Ingredients:\n" +
    "- Ramen noodles\n" +
    "- Broth (chicken, pork, or miso)\n" +
    "- Toppings (sliced pork, soft-boiled egg, green onions, nori)" +

    "Gyoza (Japanese Dumplings):\n" +
    "Ingredients:\n" +
    "- Gyoza wrappers\n" +
    "- Ground pork\n" +
    "- Cabbage (finely chopped)\n" +
    "- Garlic, ginger (minced)\n" +
    "- Soy sauce" +

    "Okonomiyaki (Japanese Pancake):\n" +
    "Ingredients:\n" +
    "- Okonomiyaki flour mix\n" +
    "- Cabbage (shredded)\n" +
    "- Eggs\n" +
    "- Sliced pork belly\n" +
    "- Okonomiyaki sauce and mayonnaise" +

    "Sashimi:\n" +
    "Ingredients:\n" +
    "- Fresh sashimi-grade fish (e.g., tuna, salmon)\n" +
    "- Wasabi and soy sauce for dipping" +

    "Yakitori (Grilled Chicken Skewers):\n" +
    "Ingredients:\n" +
    "- Chicken pieces\n" +
    "- Soy sauce\n" +
    "- Mirin (sweet rice wine)\n" +
    "- Sake\n" +
    "- Sugar" +

    "Sukiyaki (Hot Pot):\n" +
    "Ingredients:\n" +
    "- Thinly sliced beef\n" +
    "- Tofu\n" +
    "- Vegetables\n" +
    "- Soy sauce\n" +
    "- Sugar\n" +
    "- Sake\n" +
    "- Sukiyaki sauce" +

    "Udon Noodle Soup:\n" +
    "Ingredients:\n" +
    "- Udon noodles\n" +
    "- Dashi broth\n" +
    "- Soy sauce\n" +
    "- Mirin\n" +
    "- Green onions" +

    "Yakisoba (Stir-Fried Noodles):\n" +
    "Ingredients:\n" +
    "- Yakisoba noodles\n" +
    "- Pork or vegetables\n" +
    "- Yakisoba sauce" +

    "Tonkatsu (Breaded Pork Cutlet):\n" +
    "Ingredients:\n" +
    "- Pork cutlets\n" +
    "- Flour\n" +
    "- Egg\n" +
    "- Breadcrumbs\n" +
    "- Cabbage\n" +
    "- Tonkatsu sauce" +

    "Chawanmushi (Steamed Egg Custard):\n" +
    "Ingredients:\n" +
    "- Eggs\n" +
    "- Dashi\n" +
    "- Soy sauce\n" +
    "- Mirin\n" +
    "- Mushrooms\n" +
    "- Shrimp" +

    "Yaki Udon (Stir-Fried Udon Noodles):\n" +
    "Ingredients:\n" +
    "- Udon noodles\n" +
    "- Vegetables\n" +
    "- Pork or chicken\n" +
    "- Soy sauce\n" +
    "- Mirin" +

    "Nigiri Sushi:\n" +
    "Ingredients:\n" +
    "- Sushi rice\n" +
    "- Fresh seafood (e.g., tuna, salmon)\n" +
    "- Soy sauce\n" +
    "- Wasabi\n" +
    "- Pickled ginger" +

    "Nabe (Japanese Hot Pot):\n" +
    "Ingredients:\n" +
    "- Broth (e.g., sukiyaki, shabu-shabu)\n" +
    "- Thinly sliced meat\n" +
    "- Vegetables\n" +
    "- Tofu\n" +
    "- Dipping sauces" +

    "Chirashi Sushi (Scattered Sushi):\n" +
    "Ingredients:\n" +
    "- Sushi rice\n" +
    "- Assorted sashimi\n" +
    "- Vegetables\n" +
    "- Pickled ginger\n" +
    "- Soy sauce" +

    "Oyakodon (Chicken and Egg Rice Bowl):\n" +
    "Ingredients:\n" +
    "- Chicken pieces\n" +
    "- Eggs\n" +
    "- Soy sauce\n" +
    "- Mirin\n" +
    "- Dashi\n" +
    "- Green onions" +

    "Unagi Don (Grilled Eel Rice Bowl):\n" +
    "Ingredients:\n" +
    "- Grilled eel (unagi)\n" +
    "- Eel sauce\n" +
    "- Served over rice"};

    static String[] RecipeMethodTitle1 = {"instruction" + "instruction" + "instruction" + "instruction" +
    "instruction" + "instruction" + "instruction" + "instruction" +
    "instruction" + "instruction" + "instruction" + "instruction" +
    "instruction" + "instruction" + "instruction" + "instruction" +
    "instruction"};

    static String[] recipe1 = {"Sushi Rolls (Maki):\n" +
    "1. Place a bamboo sushi rolling mat on a clean surface.\n" +
    "2. Lay a sheet of plastic wrap on the mat.\n" +
    "3. Lay a sheet of nori on the plastic wrap.\n" +
    "4. Wet your hands and spread a thin layer of sushi rice on the nori.\n" +
    "5. Add your choice of fish or vegetables.\n" +
    "6. Roll the sushi using the bamboo mat, then slice and serve with soy sauce and wasabi.\n\n" +

    "Miso Soup:\n" +
    "1. Bring dashi to a boil.\n" +
    "2. Dissolve miso paste in a small amount of hot dashi, then add it to the pot.\n" +
    "3. Add tofu and wakame seaweed, simmer for a few minutes.\n" +
    "4. Garnish with green onions and serve hot.\n\n" +

    "Teriyaki Chicken:\n" +
    "1. Mix soy sauce, mirin, sugar, garlic, and ginger to make the teriyaki sauce.\n" +
    "2. Marinate chicken in the sauce for at least 30 minutes.\n" +
    "3. Grill or pan-fry chicken until fully cooked, basting with the sauce.\n\n" +

    "Tempura:\n" +
    "1. Heat oil to 350°F (175°C).\n" +
    "2. Dip shrimp and vegetables in tempura batter.\n" +
    "3. Fry until golden brown and crispy, then drain on paper towels.\n\n" +

    "Ramen Noodles:\n" +
    "1. Cook ramen noodles according to package instructions.\n" +
    "2. Heat broth and season as desired.\n" +
    "3. Add cooked noodles to a bowl, pour hot broth over them, and top with your choice of toppings.\n\n" +

    "Gyoza (Japanese Dumplings):\n" +
    "1. Mix ground pork, cabbage, garlic, ginger, and soy sauce.\n" +
    "2. Place a spoonful of filling in a gyoza wrapper, wet the edges, and fold in half.\n" +
    "3. Pan-fry dumplings until golden brown, then steam until fully cooked.\n\n" +

    "Okonomiyaki (Japanese Pancake):\n" +
    "1. Mix okonomiyaki flour mix, shredded cabbage, eggs, and water to make a batter.\n" +
    "2. Cook on a griddle, add sliced pork on top, and flip when the bottom is browned.\n" +
    "3. Serve with okonomiyaki sauce and mayonnaise.\n\n" +

    "Sashimi:\n" +
    "1. Slice fresh fish into thin pieces.\n" +
    "2. Serve with wasabi and soy sauce for dipping.\n\n" +

    "Yakitori (Grilled Chicken Skewers):\n" +
    "1. Mix chicken with soy sauce, mirin, sake, and sugar for the marinade.\n" +
    "2. Thread chicken onto skewers and grill until cooked.\n" +
    "3. Baste with the marinade during grilling.\n\n" +

    "Sukiyaki (Hot Pot):\n" +
    "1. Cook thin slices of beef in a hot pot.\n" +
    "2. Add tofu, vegetables, and sukiyaki sauce.\n" +
    "3. Simmer until everything is cooked.\n\n" +

    "Udon Noodle Soup:\n" +
    "1. Cook udon noodles according to package instructions.\n" +
    "2. Heat dashi broth, add soy sauce, mirin, and green onions.\n" +
    "3. Pour the broth over the cooked udon noodles.\n\n" +

    "Yakisoba (Stir-Fried Noodles):\n" +
    "1. Stir-fry yakisoba noodles with pork or vegetables.\n" +
    "2. Add yakisoba sauce for flavor.\n" +
    "3. Cook until everything is heated through.\n\n" +

    "Tonkatsu (Breaded Pork Cutlet):\n" +
    "1. Coat pork cutlets in flour, dip in beaten egg, and coat with breadcrumbs.\n" +
    "2. Deep-fry until golden brown.\n" +
    "3. Serve with shredded cabbage and tonkatsu sauce.\n\n" +

    "Chawanmushi (Steamed Egg Custard):\n" +
    "1. Beat eggs and mix with dashi, soy sauce, and mirin.\n" +
    "2. Add ingredients like mushrooms and shrimp.\n" +
    "3. Steam until the custard is set.\n\n" +

    "Yaki Udon (Stir-Fried Udon Noodles):\n" +
    "1. Stir-fry udon noodles with vegetables and your choice of protein.\n" +
    "2. Add soy sauce and mirin for flavor.\n" +
    "3. Cook until everything is heated through.\n\n" +

    "Nigiri Sushi:\n" +
    "1. Shape small mounds of sushi rice.\n" +
    "2. Top with fresh seafood and serve with soy sauce, wasabi, and pickled ginger.\n\n" +

    "Nabe (Japanese Hot Pot):\n" +
    "1. Prepare a broth (e.g., sukiyaki, shabu-shabu).\n" +
    "2. Thinly slice meat, prepare vegetables, and tofu.\n" +
    "3. Cook everything in the hot pot and dip in sauces.\n\n" +

    "Chirashi Sushi (Scattered Sushi):\n" +
    "1. Spread sushi rice in a bowl or on a plate.\n" +
    "2. Arrange assorted sashimi and vegetables on top.\n" +
    "3. Serve with pickled ginger and soy sauce.\n\n" +

    "Oyakodon (Chicken and Egg Rice Bowl):\n" +
    "1. Cook chicken in a savory broth of soy sauce, mirin, and dashi.\n" +
    "2. Beat eggs and pour over the chicken, cooking until set.\n" +
    "3. Serve over rice with green onions.\n\n" +

    "Unagi Don (Grilled Eel Rice Bowl):\n" +
    "1. Grill eel and baste with eel sauce.\n" +
    "2. Serve over a bowl of rice.\n" +
    "3. Drizzle with extra eel sauce if desired."};

    static String[] category1 = {"Sushi, Soup, Chicken Dish, Fried Dish, Noodle Dish, Dumplings, Pancake, Sashimi, Grilled Dish, Hot Pot, Rice Bowl, Other, " +
    "Stir-Fried Noodles, Breaded Dish, Steamed Dish, Seafood, Scattered Sushi, Chicken and Egg Dish, Grilled Eel Dish"};


    static Integer[] image1 = {R.drawable.koba ,R.drawable.pizzabia, R.drawable.antricot, R.drawable.chocolatecake,
            R.drawable.burger, R.drawable.pastatomato, R.drawable.krovit, R.drawable.borekas, R.drawable.halomisalad, R.drawable.pancakes
            , R.drawable.tahilandwok , R.drawable.sushi , R.drawable.nioki , R.drawable.specialbread , R.drawable.chicken , R.drawable.janon , R.drawable.greecesalad , R.drawable.mafrom , R.drawable.gamba , R.drawable.shnizelandchips};


}
