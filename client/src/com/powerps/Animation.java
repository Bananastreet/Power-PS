package com.powerps;

public final class Animation {

    public static Animation anims[];
    public static int anInt367;
    public int anInt352;
    public int anIntArray353[];
    public int anIntArray354[];
    public int anInt356;
    public int anIntArray357[];
    public boolean aBoolean358;
    public int anInt359;
    public int anInt360;
    public int anInt361;
    public int anInt362;
    public int anInt363;
    public int anInt364;
    public int anInt365;
    private int anIntArray355[];
    private Animation() {
        anInt356 = -1;
        aBoolean358 = false;
        anInt359 = 5;
        anInt360 = -1;
        anInt361 = -1;
        anInt362 = 99;
        anInt363 = -1;
        anInt364 = -1;
        anInt365 = 2;
    }

    public static void unpackConfig(StreamLoader streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("seq.dat"));
        int length = stream.readUnsignedWord();
        if (anims == null)
            anims = new Animation[length + 5000];
        for (int j = 0; j < length; j++) {
            if (anims[j] == null)
                anims[j] = new Animation();
            anims[j].readValues(stream);
            try {
                // file 13.dat
                anims[15448] = new Animation();
                anims[15448].anInt352 = 60;
                anims[15448].anInt359 = 6;
                anims[15448].anInt363 = 2;
                anims[15448].anInt364 = 1;
                anims[15448].anIntArray355 = new int[]{1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2,
                        4, 4, 4, 4, 4, 4, 3};
                anims[15448].anIntArray353 = new int[]{852053, 852207, 852152, 852151, 852072, 852107, 852142, 852176,
                        852058, 852116, 852104, 852070, 852007, 852165, 852140, 852164, 852051, 852195, 851983, 852242,
                        852189, 852047, 852113, 852200, 851976, 852035, 852114, 852112, 852126, 852046, 852040, 852004,
                        852218, 852054, 852132, 852083, 852236, 852228, 852182, 852052, 852156, 851989, 852111, 852124,
                        852031, 852108, 852171, 852010, 852133, 852023, 852069, 852224, 852139, 852062, 852059, 852038,
                        852138, 852000, 852146, 852053};

                // file 3828.dat
                anims[15449] = new Animation();
                anims[15449].anInt352 = 19;
                anims[15449].anInt359 = 6;
                anims[15449].anInt363 = 2;
                anims[15449].anInt364 = 1;
                anims[15449].anIntArray355 = new int[]{15, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 13, 5, 3};
                anims[15449].anIntArray353 = new int[]{250872027, 250871886, 250871895, 250872017, 250871909,
                        250871892, 250871963, 250871953, 250871905, 250871823, 250871882, 250872046, 250872050,
                        250871913, 250871939, 250871844, 250871877, 250871858, 250871964};

                // file 3828.dat
                anims[15450] = new Animation();
                anims[15450].anInt352 = 10;
                anims[15450].anIntArray355 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
                anims[15450].anIntArray353 = new int[]{250871880, 250871926, 250871936, 250871945, 250871941,
                        250871994, 250871873, 250871809, 250871821, 250871850};

                // file 3828.dat
                anims[15451] = new Animation();
                anims[15451].anInt352 = 18;
                anims[15451].anIntArray355 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6, 12, 4, 1, 1};
                anims[15451].anIntArray355 = new int[]{250871894, 250871885, 250871954, 250871891, 250871878,
                        250872021, 250872053, 250872016, 250871957, 250871974, 250872032, 250871985, 250871903,
                        250871908, 250872024, 250871890, 250871983, 250871912};

                anims[15069] = new Animation();
                anims[15069].anInt352 = 24;
                anims[15069].anIntArray355 = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                        5, 5, 5};
                anims[15069].anIntArray353 = new int[]{227803309, 227803140, 227803217, 227803251, 227803297,
                        227803222, 227803158, 227803280, 227803266, 227803224, 227803268, 227803288, 227803218,
                        227803157, 227803187, 227803152, 227803286, 227803179, 227803168, 227803229, 227803248,
                        227803213, 227803180, 227803284};
                anims[15069].anInt363 = 0;
                anims[15069].anInt364 = 0;

                anims[15070] = new Animation();
                anims[15070].anInt352 = 24;
                anims[15070].anIntArray355 = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
                        2, 1, 2};
                anims[15070].anIntArray353 = new int[]{227803277, 227803235, 227803154, 227803141, 227803238,
                        227803321, 227803151, 227803203, 227803205, 227803299, 227803137, 227803262, 227803245,
                        227803174, 227803242, 227803139, 227803305, 227803317, 227803254, 227803167, 227803185,
                        227803267, 227803257, 227803265};
                anims[15070].anInt363 = 0;
                anims[15070].anInt364 = 0;

                anims[15071] = new Animation();
                anims[15071].anInt352 = 16;
                anims[15071].anIntArray355 = new int[]{4, 3, 3, 4, 4, 3, 2, 2, 1, 1, 2, 2, 3, 3, 3, 1};
                anims[15071].anIntArray353 = new int[]{227803302, 227803143, 227803240, 227803163, 227803159,
                        227803155, 227803323, 227803183, 227803276, 227803287, 227803285, 227803219, 227803210,
                        227803147, 227803204, 227803302};
                anims[15071].anInt359 = 6;
                anims[15071].anInt362 = 1;
                anims[15071].anInt363 = 2;
                anims[15071].anInt364 = 2;

                anims[15072] = new Animation();
                anims[15072].anInt352 = 23;
                anims[15072].anIntArray355 = new int[]{3, 4, 4, 3, 4, 2, 2, 1, 1, 1, 1, 1, 3, 3, 3, 2, 2, 2, 3, 3, 3,
                        4, 1};
                anims[15072].anIntArray353 = new int[]{227803212, 227803308, 227803199, 227803292, 227803227,
                        227803241, 227803271, 227803327, 227803296, 227803173, 227803314, 227803247, 227803263,
                        227803237, 227803243, 227803156, 227803138, 227803190, 227803198, 227803231, 227803304,
                        227803233, 227803212};
                anims[15072].anInt359 = 6;
                anims[15072].anInt362 = 1;
                anims[15072].anInt363 = 2;
                anims[15072].anInt364 = 2;

                anims[15073] = new Animation();
                anims[15073].anInt352 = 16;
                anims[15073].anIntArray355 = new int[]{3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2};
                anims[15073].anIntArray353 = new int[]{227803319, 227803320, 227803223, 227803197, 227803177,
                        227803259, 227803211, 227803145, 227803312, 227803252, 227803279, 227803209, 227803166,
                        227803176, 227803207, 227803261};
                anims[15073].anInt363 = 2;
                anims[15073].anInt364 = 2;

                anims[15074] = new Animation();
                anims[15074].anInt352 = 17;
                anims[15074].anIntArray355 = new int[]{1, 2, 2, 2, 3, 3, 3, 4, 2, 1, 3, 1, 2, 2, 1, 1, 1};
                anims[15074].anIntArray353 = new int[]{227803221, 227803322, 227803275, 227803256, 227803283,
                        227803272, 227803293, 227803318, 227803303, 227803206, 227803164, 227803146, 227803289,
                        227803255, 227803225, 227803169, 227803221};
                anims[15074].anInt362 = 1;
                anims[15074].anInt363 = 2;
                anims[15074].anInt364 = 2;

                anims[15075] = new Animation();
                anims[15075].anInt352 = 16;
                anims[15075].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
                anims[15075].anIntArray353 = new int[]{227803194, 227803226, 227803171, 227803228, 227803232,
                        227803136, 227803253, 227803175, 227803316, 227803162, 227803186, 227803192, 227803294,
                        227803144, 227803189, 227803282};
                anims[15075].anInt363 = 0;
                anims[15075].anInt364 = 0;

                anims[15076] = new Animation();
                anims[15076].anInt352 = 16;
                anims[15076].anIntArray355 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
                anims[15076].anIntArray353 = new int[]{227803193, 227803298, 227803201, 227803234, 227803216,
                        227803160, 227803315, 227803306, 227803325, 227803220, 227803182, 227803149, 227803150,
                        227803313, 227803208, 227803258};
                anims[15076].anInt363 = 0;
                anims[15076].anInt364 = 0;

                anims[15077] = new Animation();
                anims[15077].anInt352 = 16;
                anims[15077].anIntArray355 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
                anims[15077].anIntArray353 = new int[]{227803148, 227803326, 227803290, 227803270, 227803202,
                        227803269, 227803244, 227803307, 227803260, 227803153, 227803250, 227803196, 227803278,
                        227803246, 227803236, 227803195};
                anims[15077].anInt363 = 0;
                anims[15077].anInt364 = 0;
            } catch (Exception e) {
            }
            if (j == 9157) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 24;
                anims[j].anIntArray355 = new int[]{2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2,
                        2, 2};
                anims[j].anIntArray353 = new int[]{229507415, 229507219, 229507411, 229507095, 229507202, 229507224,
                        229507326, 229507235, 229507337, 229507288, 229507430, 229507317, 229507239, 229507312,
                        229507404, 229507121, 229507464, 229507413, 229507329, 229507378, 229507173, 229507150,
                        229507292, 229507308};
                anims[j].anInt359 = 4;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 9158) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 32;
                anims[j].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                        3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
                anims[j].anIntArray353 = new int[]{229507242, 229507350, 229507403, 229507099, 229507086, 229507365,
                        229507148, 229507289, 229507075, 229507246, 229507229, 229507171, 229507371, 229507296,
                        229507153, 229507333, 229507310, 229507198, 229507399, 229507458, 229507344, 229507142,
                        229507402, 229507154, 229507393, 229507220, 229507180, 229507479, 229507133, 229507450,
                        229507469, 229507204};
                anims[j].anInt359 = 2;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6319) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 24;
                anims[j].anIntArray355 = new int[]{2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2,
                        2, 2};
                anims[j].anIntArray353 = new int[]{229507415, 229507219, 229507411, 229507095, 229507202, 229507224,
                        229507326, 229507235, 229507337, 229507288, 229507430, 229507317, 229507239, 229507312,
                        229507404, 229507121, 229507464, 229507413, 229507329, 229507378, 229507173, 229507150,
                        229507292, 229507308};
                anims[j].anInt359 = 4;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6320) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 32;
                anims[j].anIntArray355 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                        3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
                anims[j].anIntArray353 = new int[]{229507242, 229507350, 229507403, 229507099, 229507086, 229507365,
                        229507148, 229507289, 229507075, 229507246, 229507229, 229507171, 229507371, 229507296,
                        229507153, 229507333, 229507310, 229507198, 229507399, 229507458, 229507344, 229507142,
                        229507402, 229507154, 229507393, 229507220, 229507180, 229507479, 229507133, 229507450,
                        229507469, 229507204};
                anims[j].anInt359 = 2;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6321) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 53;
                anims[j].anIntArray355 = new int[]{1, 3, 4, 4, 3, 3, 3, 3, 2, 2, 2, 2, 7, 7, 4, 6, 3, 2, 3, 2, 2, 2,
                        2, 3, 4, 3, 3, 3, 2, 6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 6, 6, 5, 5, 6, 2};
                anims[j].anIntArray353 = new int[]{229507234, 229507100, 229507316, 229507266, 229507363, 229507217,
                        229507382, 229507257, 229507177, 229507092, 229507389, 229507163, 229507117, 229507354,
                        229507347, 229507123, 229507111, 229507081, 229507453, 229507309, 229507390, 229507258,
                        229507160, 229507213, 229507162, 229507282, 229507304, 229507164, 229507098, 229507103,
                        229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103,
                        229507195, 229507103, 229507195, 229507103, 229507195, 229507103, 229507195, 229507103,
                        229507195, 229507174, 229507394, 229507225, 229507376, 229507271, 229507332};
                anims[j].anInt359 = 10;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6326) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 36;
                anims[j].anIntArray355 = new int[]{1, 3, 3, 4, 3, 3, 3, 3, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                        7, 8, 8, 7, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2};
                anims[j].anIntArray353 = new int[]{229507157, 229507156, 229507446, 229507440, 229507406, 229507431,
                        229507247, 229507218, 229507465, 229507474, 229507077, 229507357, 229507327, 229507482,
                        229507116, 229507259, 229507129, 229507275, 229507322, 229507087, 229507102, 229507436,
                        229507268, 229507443, 229507361, 229507128, 229507372, 229507407, 229507185, 229507293,
                        229507226, 229507323, 229507255, 229507352, 229507401, 229507159};
                anims[j].anInt359 = 10;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6354) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 25;
                anims[j].anIntArray355 = new int[]{1, 1, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 2, 1, 1,
                        2, 2, 3};
                anims[j].anIntArray353 = new int[]{229507373, 229507203, 229507097, 229507298, 229507386, 229507264,
                        229507277, 229507080, 229507089, 229507481, 229507078, 229507094, 229507451, 229507384,
                        229507183, 229507385, 229507209, 229507414, 229507417, 229507335, 229507270, 229507178,
                        229507331, 229507096, 229507260};
                anims[j].anInt359 = 8;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6355) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 36;
                anims[j].anIntArray355 = new int[]{2, 3, 2, 2, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 2, 2, 2, 2, 2, 3, 2, 1,
                        1, 1, 2, 2, 1, 2, 2, 3, 6, 5, 3, 1, 1, 1};
                anims[j].anIntArray353 = new int[]{229507412, 229507243, 229507299, 229507483, 229507428, 229507470,
                        229507113, 229507122, 229507468, 229507197, 229507251, 229507284, 229507215, 229507125,
                        229507447, 229507471, 229507303, 229507265, 229507093, 229507328, 229507273, 229507283,
                        229507346, 229507302, 229507480, 229507141, 229507475, 229507208, 229507396, 229507172,
                        229507375, 229507355, 229507305, 229507387, 229507138, 229507082};
                anims[j].anInt359 = 10;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6948) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 29;
                anims[j].anIntArray355 = new int[]{5, 5, 6, 3, 3, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12,
                        12, 12, 12, 12, 12, 12, 3, 3, 4, 5, 8};
                anims[j].anIntArray353 = new int[]{229507301, 229507367, 229507205, 229507131, 229507132, 229507395,
                        229507318, 229507194, 229507462, 229507395, 229507318, 229507194, 229507462, 229507395,
                        229507318, 229507194, 229507462, 229507395, 229507318, 229507194, 229507462, 229507395,
                        229507318, 229507194, 229507426, 229507278, 229507147, 229507236, 229507353};
                anims[j].anInt359 = 10;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6951) {
                // anims[j] = new Animation();
                anims[j].anInt352 = 65;
                anims[j].anIntArray355 = new int[]{4, 4, 3, 3, 4, 6, 5, 5, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 4, 4, 8, 6, 5, 1, 1, 1, 1, 3, 3,
                        3, 3, 3, 5, 6, 6, 6, 6, 36, 22, 22};
                anims[j].anIntArray353 = new int[]{229507307, 229507427, 229507228, 229507272, 229507422, 229507168,
                        229507107, 229507306, 229507249, 229507409, 229507476, 229507294, 229507250, 229507109,
                        229507461, 229507211, 229507244, 229507364, 229507348, 229507237, 229507341, 229507405,
                        229507408, 229507090, 229507079, 229507280, 229507290, 229507398, 229507119, 229507467,
                        229507330, 229507319, 229507181, 229507200, 229507112, 229507167, 229507334, 229507254,
                        229507340, 229507410, 229507383, 229507106, 229507377, 229507151, 229507269, 229507429,
                        229507196, 229507073, 229507136, 229507311, 229507313, 229507088, 229507432, 229507388,
                        229507074, 229507477, 229507456, 229507188, 229507274, 229507165, 229507212, 229507439,
                        229507118, 229507356, 229507438};
                anims[j].anInt359 = 10;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6983) {
                // anims[j] = new Animation();
                anims[j].anInt352 = 32;
                anims[j].anIntArray355 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2,
                        2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
                anims[j].anIntArray353 = new int[]{229507321, 229507140, 229507338, 229507135, 229507374, 229507419,
                        229507230, 229507320, 229507454, 229507392, 229507421, 229507084, 229507166, 229507444,
                        229507425, 229507120, 229507201, 229507459, 229507449, 229507190, 229507435, 229507110,
                        229507380, 229507083, 229507420, 229507206, 229507360, 229507452, 229507297, 229507262,
                        229507381, 229507104};
                anims[j].anInt359 = 2;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6984) {
                // anims[j] = new Animation();
                anims[j].anInt352 = 25;
                anims[j].anIntArray355 = new int[]{3, 5, 5, 5, 4, 4, 3, 3, 3, 3, 5, 8, 6, 3, 3, 3, 3, 3, 3, 3, 2, 2,
                        2, 3, 3};
                anims[j].anIntArray353 = new int[]{229507276, 229507448, 229507161, 229507325, 229507145, 229507076,
                        229507416, 229507351, 229507170, 229507358, 229507418, 229507457, 229507115, 229507158,
                        229507473, 229507169, 229507362, 229507182, 229507287, 229507191, 229507240, 229507434,
                        229507279, 229507091, 229507126};
                anims[j].anInt359 = 8;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6985) {
                // anims[j] = new Animation();
                anims[j].anInt352 = 9;
                anims[j].anIntArray355 = new int[]{3, 3, 2, 3, 4, 4, 4, 4, 3};
                anims[j].anIntArray353 = new int[]{229507397, 229507424, 229507186, 229507245, 229507175, 229507248,
                        229507445, 229507139, 229507291};
                anims[j].anInt359 = 10;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
            if (j == 6986) {
                // anims[j] = new Animation();
                anims[j].anInt352 = 33;
                anims[j].anIntArray355 = new int[]{4, 4, 8, 4, 4, 4, 4, 4, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                        2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2};
                anims[j].anIntArray353 = new int[]{229507149, 229507222, 229507134, 229507114, 229507130, 229507423,
                        229507144, 229507127, 229507227, 229507189, 229507463, 229507101, 229507263, 229507400,
                        229507324, 229507267, 229507238, 229507295, 229507072, 229507342, 229507300, 229507179,
                        229507359, 229507281, 229507105, 229507192, 229507343, 229507370, 229507339, 229507437,
                        229507146, 229507369, 229507252};
                anims[j].anInt359 = 6;
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }

            if (j == 6987) {
                //// anims[j] = new Animation();
                anims[j].anInt352 = 28;
                anims[j].anIntArray355 = new int[]{2, 6, 6, 5, 2, 3, 4, 4, 4, 4, 4, 2, 2, 3, 3, 2, 2, 3, 2, 4, 4, 3,
                        3, 3, 3, 2, 3, 2};
                anims[j].anIntArray353 = new int[]{229507216, 229507231, 229507442, 229507315, 229507478, 229507108,
                        229507193, 229507472, 229507261, 229507441, 229507460, 229507433, 229507285, 229507210,
                        229507155, 229507336, 229507286, 229507232, 229507366, 229507368, 229507391, 229507124,
                        229507253, 229507233, 229507221, 229507345, 229507143, 229507466};
                anims[j].anInt359 = 6;
                anims[j].anInt363 = 0;
                anims[6987].anInt364 = 0;
            }
            if (j == 4000) {
                anims[j].anInt352 = 28;
                anims[j].anIntArray355 = new int[]{3, 2, 2, 2, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 2, 1, 1, 3, 3, 3,
                        3, 3, 3, 3, 3, 3};
                anims[j].anIntArray353 = new int[]{223019263, 223019511, 223019120, 223019119, 223019242, 223019278,
                        223019027, 223019504, 223019417, 223019428, 223019705, 223019087, 223019664, 223019465,
                        223019589, 223019707, 223019322, 223019644, 223019174, 223019574, 223019108, 223019335,
                        223019521, 223019401, 223019300, 223019029, 223019276, 223019115};
                anims[j].anInt363 = 0;
                anims[j].anInt364 = 0;
            }
        }

    }

    public int method258(int i) {
        int j = anIntArray355[i];
        if (j == 0) {
            Frame class36 = Frame.method531(anIntArray353[i]);
            if (class36 != null)
                j = anIntArray355[i] = class36.anInt636;
        }
        if (j == 0)
            j = 1;
        return j;
    }

    public void readValues(Stream stream) {
        do {
            int i = stream.readUnsignedByte();
            if (i == 0)
                break;
            if (i == 1) {
                anInt352 = stream.readUnsignedWord();
                anIntArray353 = new int[anInt352];
                anIntArray354 = new int[anInt352];
                anIntArray355 = new int[anInt352];
                int i_;
                for (i_ = 0; i_ < anInt352; i_++) {
                    anIntArray353[i_] = stream.readDWord();
                    anIntArray354[i_] = -1;
                }

                i_ = 0;
                while (i_ < anInt352) {
                    anIntArray355[i_] = stream.readUnsignedByte();
                    i_++;
                }
            } else if (i == 2)
                anInt356 = stream.readUnsignedWord();
            else if (i == 3) {
                int k = stream.readUnsignedByte();
                anIntArray357 = new int[k + 1];
                for (int l = 0; l < k; l++)
                    anIntArray357[l] = stream.readUnsignedByte();

                anIntArray357[k] = 0x98967f;
            } else if (i == 4)
                aBoolean358 = true;
            else if (i == 5)
                anInt359 = stream.readUnsignedByte();
            else if (i == 6)
                anInt360 = stream.readUnsignedWord();
            else if (i == 7)
                anInt361 = stream.readUnsignedWord();
            else if (i == 8)
                anInt362 = stream.readUnsignedByte();
            else if (i == 9)
                anInt363 = stream.readUnsignedByte();
            else if (i == 10)
                anInt364 = stream.readUnsignedByte();
            else if (i == 11)
                anInt365 = stream.readUnsignedByte();
            else
                System.out.println(
                        (new StringBuilder()).append("Unrecognized seq.dat config code: ").append(i).toString());
        } while (true);
        if (anInt352 == 0) {
            anInt352 = 1;
            anIntArray353 = new int[1];
            anIntArray353[0] = -1;
            anIntArray354 = new int[1];
            anIntArray354[0] = -1;
            anIntArray355 = new int[1];
            anIntArray355[0] = -1;
        }
        if (anInt363 == -1)
            if (anIntArray357 != null)
                anInt363 = 2;
            else
                anInt363 = 0;
        if (anInt364 == -1) {
            if (anIntArray357 != null) {
                anInt364 = 2;
                return;
            }
            anInt364 = 0;
        }
    }
}
