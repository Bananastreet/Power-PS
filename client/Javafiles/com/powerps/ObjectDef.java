package com.powerps;

import sign.*;

public final class ObjectDef {

	public static ObjectDef forID(int i) {
		if (i > streamIndices.length)
			i = streamIndices.length - 1;
		for (int j = 0; j < 20; j++)
			if (cache[j].type == i)
				return cache[j];
		cacheIndex = (cacheIndex + 1) % 20;
		ObjectDef objectDef = cache[cacheIndex];
		try {
			stream.currentOffset = streamIndices[i];
		} catch (Exception e) {
		}
		objectDef.type = i;
		objectDef.setDefaults();
		objectDef.readValues(stream);
		if (i == 11214) {
			objectDef.name = "Empty space";
			objectDef.description = "You can build something here.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Build";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}
		if (i == 11215) {
			objectDef.name = "Prayer-Altar";
			objectDef.description = "You can build an altar here.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Build";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}

		if (i == 6072) {
			objectDef.name = "Power-ps Bank";
			objectDef.description = "You can bank here..".getBytes();
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Open Bank";
			objectDef.hasActions = true;
		}
		if (i == 1099) {
			objectDef.name = "Broken Throne";
			objectDef.description = "Fix it..".getBytes();
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Fix";
			objectDef.hasActions = true;
		}
		if (i == 6073) {
			objectDef.name = "Power-ps Bank";
			objectDef.description = "You can bank here..".getBytes();
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Open Bank";
			objectDef.hasActions = true;
		}

		if (i == 11216) {
			objectDef.name = "Bed";
			objectDef.description = "You can build a bed here.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Build";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}

		if (i == 823) {
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Hit";
			objectDef.hasActions = true;
		}
		if (i == 822) {
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Lift";
			objectDef.hasActions = true;
		}
		if (i == 3563) {
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Use";
			objectDef.hasActions = true;
		}
		if (i == 11217) {
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Cut";
			objectDef.hasActions = true;
		}
		if (i == 11217) {
			objectDef.name = "Tree";
			objectDef.description = "You can plant a tree here.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Plant";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}

		if (i == 1311) {
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Cut";
		}
		if (i == 1532) {
			objectDef.name = "Door";
			objectDef.description = "A Door For The Minigame.".getBytes();
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Unlock";
			objectDef.hasActions = true;
		}
		if (i == 1535) {
			objectDef.name = "Door";
			objectDef.description = "A Door For The Minigame.".getBytes();
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Unlock";
			objectDef.hasActions = true;
		}
		if (i == 2529) {
			objectDef.name = "Door";
			objectDef.description = "A Door For The Minigame.".getBytes();
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Unlock";
			objectDef.hasActions = true;
		}
		if (i == 11219) {
			objectDef.name = "Bank Chest";
			objectDef.description = "You can build a bank here.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Build";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}
		if (i == 11220) {
			objectDef.name = "Burner";
			objectDef.description = "Allows you to build two lecterns".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Build";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}
		if (i == 11212) {
			objectDef.name = "Teleporter";
			objectDef.description = "Allows you to teleport to places.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Build";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}
		if (i == 11209) {
			objectDef.name = "Crystal";
			objectDef.description = "Allows you to create teleport tablets.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 50099;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Build";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}
		if (i == 13660) {
			objectDef.name = "Pokeball";
			objectDef.description = "'Power-ps's Pokemon Mini-Game.".getBytes();
			objectDef.anInt744 = 1;
			objectDef.anInt761 = 1;
			objectDef.anIntArray773 = new int[1];
			objectDef.anIntArray773[0] = 52100;
			objectDef.itemActions = new String[5];
			objectDef.itemActions[0] = "Look Closely At";
			objectDef.hasActions = true;
			objectDef.aBoolean767 = false;
			objectDef.aBoolean762 = false;
			objectDef.aBoolean769 = false;
		}
		if (i == 3994) {
			objectDef.itemActions = new String[5];
			objectDef.name = "Small Furnace";
			objectDef.itemActions[1] = "Use";
		}
		if (i == 2152) {
			objectDef.itemActions = new String[5];
			objectDef.name = "Summoning Obelisk";
			objectDef.itemActions[1] = "Infuse Pouches";
			// objectDef.itemActions[2] = "Infuse Scrolls";
		}
		if (objectDef.modifiedModelColors == null) { // :)
			objectDef.modifiedModelColors = new int[1];
			objectDef.originalModelColors = new int[1];
			objectDef.modifiedModelColors[0] = 0;
			objectDef.originalModelColors[0] = 1;
		}
		if (objectDef.anInt781 == -1)
			objectDef.anInt781 = 0;
		return objectDef;
	}

	public void setDefaults() {
		anIntArray773 = null;
		anIntArray776 = null;
		name = null;
		description = null;
		modifiedModelColors = null;
		originalModelColors = null;
		anInt744 = 1;
		anInt761 = 1;
		aBoolean767 = true;
		aBoolean757 = true;
		hasActions = false;
		aBoolean762 = false;
		aBoolean769 = false;
		aBoolean764 = false;
		anInt781 = -1;
		anInt775 = 16;
		aByte737 = 0;
		aByte742 = 0;
		itemActions = null;
		anInt746 = -1;
		anInt758 = -1;
		aBoolean751 = false;
		aBoolean779 = true;
		anInt748 = 128;
		anInt772 = 128;
		anInt740 = 128;
		anInt768 = 0;
		anInt738 = 0;
		anInt745 = 0;
		anInt783 = 0;
		aBoolean736 = false;
		aBoolean766 = false;
		anInt760 = -1;
		anInt774 = -1;
		anInt749 = -1;
		childrenIDs = null;
	}

	public void method574(OnDemandFetcher class42_sub1) {
		if (anIntArray773 == null)
			return;
		for (int j = 0; j < anIntArray773.length; j++)
			class42_sub1.method560(anIntArray773[j] & 0xffff, 0);
	}

	public static void nullLoader() {
		mruNodes1 = null;
		mruNodes2 = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(streamLoader.getDataForName("loc.dat"));
		Stream stream = new Stream(streamLoader.getDataForName("loc.idx"));
		FileOperations.WriteFile("" + signlink.findcachedir() + "/loc.dat", streamLoader.getDataForName("loc.dat"));
		FileOperations.WriteFile("" + signlink.findcachedir() + "/loc.idx", streamLoader.getDataForName("loc.idx"));
		int totalObjects = stream.readUnsignedWord();
		System.out.println("508 Object Amount: " + totalObjects);
		streamIndices = new int[totalObjects];
		int i = 2;
		for (int j = 0; j < totalObjects; j++) {
			streamIndices[j] = i;
			i += stream.readUnsignedWord();
		}
		cache = new ObjectDef[20];
		for (int k = 0; k < 20; k++)
			cache[k] = new ObjectDef();
	}

	public boolean method577(int i) {
		if (anIntArray776 == null) {
			if (anIntArray773 == null)
				return true;
			if (i != 10)
				return true;
			boolean flag1 = true;
			for (int k = 0; k < anIntArray773.length; k++)
				flag1 &= Model.method463(anIntArray773[k] & 0xffff);

			return flag1;
		}
		for (int j = 0; j < anIntArray776.length; j++)
			if (anIntArray776[j] == i)
				return Model.method463(anIntArray773[j] & 0xffff);

		return true;
	}

	public Model method578(int i, int j, int k, int l, int i1, int j1, int k1) {
		Model model = method581(i, k1, j);
		if (model == null)
			return null;
		if (aBoolean762 || aBoolean769)
			model = new Model(aBoolean762, aBoolean769, model);
		if (aBoolean762) {
			int l1 = (k + l + i1 + j1) / 4;
			for (int i2 = 0; i2 < model.anInt1626; i2++) {
				int j2 = model.anIntArray1627[i2];
				int k2 = model.anIntArray1629[i2];
				int l2 = k + ((l - k) * (j2 + 64)) / 128;
				int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
				int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
				model.anIntArray1628[i2] += j3 - l1;
			}
			model.method467();
		}
		return model;
	}

	public boolean method579() {
		if (anIntArray773 == null)
			return true;
		boolean flag1 = true;
		for (int i = 0; i < anIntArray773.length; i++)
			flag1 &= Model.method463(anIntArray773[i] & 0xffff);
		return flag1;
	}

	public ObjectDef method580() {
		int i = -1;
		if (anInt774 != -1) {
			VarBit varBit = VarBit.cache[anInt774];
			int j = varBit.anInt648;
			int k = varBit.anInt649;
			int l = varBit.anInt650;
			int i1 = Client.anIntArray1232[l - k];
			i = clientInstance.variousSettings[j] >> k & i1;
		} else if (anInt749 != -1)
			i = clientInstance.variousSettings[anInt749];
		if (i < 0 || i >= childrenIDs.length || childrenIDs[i] == -1)
			return null;
		else
			return forID(childrenIDs[i]);
	}

	public Model method581(int j, int k, int l) {
		Model model = null;
		long l1;
		if (anIntArray776 == null) {
			if (j != 10)
				return null;
			l1 = (long) ((type << 6) + l) + ((long) (k + 1) << 32);
			Model model_1 = (Model) mruNodes2.insertFromCache(l1);
			if (model_1 != null)
				return model_1;
			if (anIntArray773 == null)
				return null;
			boolean flag1 = aBoolean751 ^ (l > 3);
			int k1 = anIntArray773.length;
			for (int i2 = 0; i2 < k1; i2++) {
				int l2 = anIntArray773[i2];
				if (flag1)
					l2 += 0x10000;
				model = (Model) mruNodes1.insertFromCache(l2);
				if (model == null) {
					model = Model.method462(l2 & 0xffff);
					if (model == null)
						return null;
					if (flag1)
						model.method477();
					mruNodes1.removeFromCache(model, l2);
				}
				if (k1 > 1)
					aModelArray741s[i2] = model;
			}

			if (k1 > 1)
				model = new Model(k1, aModelArray741s);
		} else {
			int i1 = -1;
			for (int j1 = 0; j1 < anIntArray776.length; j1++) {
				if (anIntArray776[j1] != j)
					continue;
				i1 = j1;
				break;
			}

			if (i1 == -1)
				return null;
			l1 = (long) ((type << 6) + (i1 << 3) + l) + ((long) (k + 1) << 32);
			Model model_2 = (Model) mruNodes2.insertFromCache(l1);
			if (model_2 != null)
				return model_2;
			int j2 = anIntArray773[i1];
			boolean flag3 = aBoolean751 ^ (l > 3);
			if (flag3)
				j2 += 0x10000;
			model = (Model) mruNodes1.insertFromCache(j2);
			if (model == null) {
				model = Model.method462(j2 & 0xffff);
				if (model == null)
					return null;
				if (flag3)
					model.method477();
				mruNodes1.removeFromCache(model, j2);
			}
		}
		boolean flag;
		flag = anInt748 != 128 || anInt772 != 128 || anInt740 != 128;
		boolean flag2;
		flag2 = anInt738 != 0 || anInt745 != 0 || anInt783 != 0;
		Model model_3 = new Model(modifiedModelColors == null, Frame.method532(k), l == 0 && k == -1 && !flag && !flag2,
				model);
		if (k != -1) {
			model_3.method469();
			model_3.method470(k);
			model_3.anIntArrayArray1658 = null;
			model_3.anIntArrayArray1657 = null;
		}
		while (l-- > 0)
			model_3.method473();
		if (modifiedModelColors != null) {
			for (int k2 = 0; k2 < modifiedModelColors.length; k2++)
				model_3.method476(modifiedModelColors[k2], originalModelColors[k2]);

		}
		if (flag)
			model_3.method478(anInt748, anInt740, anInt772);
		if (flag2)
			model_3.method475(anInt738, anInt745, anInt783);
		model_3.method479(74, 1000, -90, -580, -90, !aBoolean769);
		if (anInt760 == 1)
			model_3.anInt1654 = model_3.modelHeight;
		mruNodes2.removeFromCache(model_3, l1);
		return model_3;
	}

	private void readValues(Stream stream) {
		int i = -1;
		label0: do {
			int j;
			do {
				j = stream.readUnsignedByte();
				if (j == 0)
					break label0;
				if (j == 1) {
					int k = stream.readUnsignedByte();
					if (k > 0)
						if (anIntArray773 == null || lowMem) {
							anIntArray776 = new int[k];
							anIntArray773 = new int[k];
							for (int k1 = 0; k1 < k; k1++) {
								anIntArray773[k1] = stream.readUnsignedWord();
								anIntArray776[k1] = stream.readUnsignedByte();
							}
						} else {
							stream.currentOffset += k * 3;
						}
				} else if (j == 2)
					name = stream.readString();
				else if (j == 3)
					description = stream.readBytes();
				else if (j == 5) {
					int l = stream.readUnsignedByte();
					if (l > 0)
						if (anIntArray773 == null || lowMem) {
							anIntArray776 = null;
							anIntArray773 = new int[l];
							for (int l1 = 0; l1 < l; l1++)
								anIntArray773[l1] = stream.readUnsignedWord();
						} else {
							stream.currentOffset += l * 2;
						}
				} else if (j == 14)
					anInt744 = stream.readUnsignedByte();
				else if (j == 15)
					anInt761 = stream.readUnsignedByte();
				else if (j == 17)
					aBoolean767 = false;
				else if (j == 18)
					aBoolean757 = false;
				else if (j == 19) {
					i = stream.readUnsignedByte();
					if (i == 1)
						hasActions = true;
				} else if (j == 21)
					aBoolean762 = true;
				else if (j == 22)
					aBoolean769 = false; // change to false to fix gowwars waterfalls??
				else if (j == 23)
					aBoolean764 = true;
				else if (j == 24) {
					anInt781 = stream.readUnsignedWord();
					if (anInt781 == 65535)
						anInt781 = -1;
				} else if (j == 28)
					anInt775 = stream.readUnsignedByte();
				else if (j == 29)
					aByte737 = stream.readSignedByte();
				else if (j == 39)
					aByte742 = stream.readSignedByte();
				else if (j >= 30 && j < 39) {
					if (itemActions == null)
						itemActions = new String[10];
					itemActions[j - 30] = stream.readString();
					if (itemActions[j - 30].equalsIgnoreCase("hidden"))
						itemActions[j - 30] = null;
				} else if (j == 40) {
					int i1 = stream.readUnsignedByte();
					modifiedModelColors = new int[i1];
					originalModelColors = new int[i1];
					for (int i2 = 0; i2 < i1; i2++) {
						modifiedModelColors[i2] = stream.readUnsignedWord();
						originalModelColors[i2] = stream.readUnsignedWord();
					}
				} else if (j == 60)
					anInt746 = stream.readUnsignedWord();
				else if (j == 62)
					aBoolean751 = true;
				else if (j == 64)
					aBoolean779 = false;
				else if (j == 65)
					anInt748 = stream.readUnsignedWord();
				else if (j == 66)
					anInt772 = stream.readUnsignedWord();
				else if (j == 67)
					anInt740 = stream.readUnsignedWord();
				else if (j == 68)
					anInt758 = stream.readUnsignedWord();
				else if (j == 69)
					anInt768 = stream.readUnsignedByte();
				else if (j == 70)
					anInt738 = stream.readSignedWord();
				else if (j == 71)
					anInt745 = stream.readSignedWord();
				else if (j == 72)
					anInt783 = stream.readSignedWord();
				else if (j == 73)
					aBoolean736 = true;
				else if (j == 74) {
					aBoolean766 = true;
				} else {
					if (j != 75)
						continue;
					anInt760 = stream.readUnsignedByte();
				}
				continue label0;
			} while (j != 77);
			anInt774 = stream.readUnsignedWord();
			if (anInt774 == 65535)
				anInt774 = -1;
			anInt749 = stream.readUnsignedWord();
			if (anInt749 == 65535)
				anInt749 = -1;
			int j1 = stream.readUnsignedByte();
			childrenIDs = new int[j1 + 1];
			for (int j2 = 0; j2 <= j1; j2++) {
				childrenIDs[j2] = stream.readUnsignedWord();
				if (childrenIDs[j2] == 65535)
					childrenIDs[j2] = -1;
			}

		} while (true);
		if (i == -1) {
			hasActions = anIntArray773 != null && (anIntArray776 == null || anIntArray776[0] == 10);
			if (itemActions != null)
				hasActions = true;
		}
		if (aBoolean766) {
			aBoolean767 = false;
			aBoolean757 = false;
		}
		if (anInt760 == -1)
			anInt760 = aBoolean767 ? 1 : 0;
	}

	public ObjectDef() {
		type = -1;
	}

	public boolean aBoolean736;
	public byte aByte737;
	public int anInt738;
	public String name;
	public int anInt740;
	public static final Model[] aModelArray741s = new Model[4];
	public byte aByte742;
	public int anInt744;
	public int anInt745;
	public int anInt746;
	public int[] originalModelColors;
	public int anInt748;
	public int anInt749;
	public boolean aBoolean751;
	public static boolean lowMem;
	public static Stream stream;
	public int type;
	public static int[] streamIndices;
	public boolean aBoolean757;
	public int anInt758;
	public int childrenIDs[];
	public int anInt760;
	public int anInt761;
	public boolean aBoolean762;
	public boolean aBoolean764;
	public static Client clientInstance;
	public boolean aBoolean766;
	public boolean aBoolean767;
	public int anInt768;
	public boolean aBoolean769;
	public static int cacheIndex;
	public int anInt772;
	public int[] anIntArray773;
	public int anInt774;
	public int anInt775;
	public int dummy;
	public int[] anIntArray776;
	public byte description[];
	public boolean hasActions;
	public boolean aBoolean779;
	public static MRUNodes mruNodes2 = new MRUNodes(30);
	public int anInt781;
	public static ObjectDef[] cache;
	public int anInt783;
	public int[] modifiedModelColors;
	public static MRUNodes mruNodes1 = new MRUNodes(500);
	public String itemActions[];

}