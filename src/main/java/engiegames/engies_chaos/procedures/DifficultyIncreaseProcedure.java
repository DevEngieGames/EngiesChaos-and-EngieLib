package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DifficultyIncreaseProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 1) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 2) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 2;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 3) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 3;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 4) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 5) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 5;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 6) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 6;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 7) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 7;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 8) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 8;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 9) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 9;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 10) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 11) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 11;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 12) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 12;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 13) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 13;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 14) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 14;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 15) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 15;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 16) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 16;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 17) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 17;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 18) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 18;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 19) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 19;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 20) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 20;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 21) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 21;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 22) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 22;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 23) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 23;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 24) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 24;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 25) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 25;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 26) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 26;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 27) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 27;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 28) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 28;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 29) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 30) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 30;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 31) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 31;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 32) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 32;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else {
						EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}