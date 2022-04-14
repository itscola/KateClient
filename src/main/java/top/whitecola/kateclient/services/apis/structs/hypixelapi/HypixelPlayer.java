package top.whitecola.kateclient.services.apis.structs.hypixelapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class HypixelPlayer {

    private Boolean success;
    private PlayerBean player;

    
    
    public static class PlayerBean {
        private String _id;
        private String uuid;
        private Long firstLogin;
        private String playername;
        private Long lastLogin;
        private String displayname;
        private List<String> knownAliases;
        private List<String> knownAliasesLower;
        private List<String> achievementsOneTime;
        private StatsBean stats;
        private AchievementsBean achievements;
        private QuestsBean quests;
        private Double networkExp;
        private EugeneBean eugene;
        private HousingMetaBean housingMeta;
        private PetConsumablesBean petConsumables;
        private VanityMetaBean vanityMeta;
        private Integer karma;
        private Boolean rewardConsumed;
        private String mcVersionRp;
        private List<?> friendRequestsUuid;
        private Boolean levelingReward_0;
        private Boolean levelingReward_9;
        private ParkourCompletionsBean parkourCompletions;
        private String language;
        private Long lastAdsenseGenerateTime;
        private Boolean levelingReward_1;
        private Boolean levelingReward_2;
        private Boolean levelingReward_3;
        private Boolean levelingReward_4;
        private Boolean levelingReward_5;
        private Boolean levelingReward_6;
        private Boolean levelingReward_7;
        private Boolean levelingReward_8;
        private Boolean levelingReward_10;
        private Boolean levelingReward_11;
        private Boolean levelingReward_12;
        private Boolean levelingReward_13;
        private Boolean levelingReward_14;
        private Boolean levelingReward_15;
        private Boolean levelingReward_16;
        private Boolean levelingReward_17;
        private Boolean levelingReward_18;
        private Boolean levelingReward_19;
        private Boolean levelingReward_20;
        private Boolean levelingReward_21;
        private Boolean levelingReward_22;
        private Boolean levelingReward_23;
        private Boolean levelingReward_24;
        private Boolean levelingReward_25;
        private Boolean levelingReward_26;
        private Boolean levelingReward_27;
        private Long flashingSalePopup;
        private Integer flashingSaleOpens;
        private Integer flashingSalePoppedUp;
        private Integer flashingSaleClicks;
        private Boolean levelingReward_28;
        private Boolean levelingReward_29;
        private Boolean levelingReward_30;
        private Boolean levelingReward_31;
        private Boolean levelingReward_32;
        private Boolean levelingReward_33;
        private Boolean levelingReward_34;
        private Boolean levelingReward_35;
        private Boolean levelingReward_36;
        private Boolean levelingReward_37;
        private Boolean levelingReward_38;
        private String userLanguage;
        private Boolean levelingReward_39;
        private Boolean levelingReward_40;
        private Boolean levelingReward_41;
        private Boolean levelingReward_42;
        private Boolean levelingReward_43;
        private Boolean levelingReward_44;
        private Boolean levelingReward_45;
        private Boolean levelingReward_46;
        private Boolean levelingReward_47;
        private Boolean levelingReward_48;
        private String vanityFavorites;
        private String channel;
        private Boolean levelingReward_49;
        private Long lastClaimedReward;
        private Integer totalRewards;
        private Integer totalDailyRewards;
        private Integer rewardStreak;
        private Integer rewardScore;
        private Integer rewardHighScore;
        private Boolean levelingReward_50;
        private Boolean levelingReward_52;
        private String newPackageRank;
        private Long levelUp_MVP;
        private Boolean levelingReward_51;
        private PetStatsBean petStats;
        private Boolean levelingReward_53;
        private Boolean levelingReward_54;
        private Boolean levelingReward_55;
        private Boolean levelingReward_56;
        private Boolean levelingReward_57;
        private Boolean levelingReward_58;
        private Boolean levelingReward_59;
        private Boolean levelingReward_60;
        private VotingBean voting;
        private Boolean levelingReward_61;
        private Integer adsense_tokens;
        private Boolean levelingReward_62;
        private Boolean levelingReward_63;
        private Boolean levelingReward_64;
        private Boolean levelingReward_65;
        private Long lastLogout;
        private Boolean levelingReward_66;
        private String currentPet;
        private GiftingMetaBean giftingMeta;
        private Integer fortuneBuff;
        private Boolean levelingReward_67;
        private String network_update_book;
        private List<?> achievementTracking;
        private AchievementRewardsNewBean achievementRewardsNew;
        private Boolean levelingReward_68;
        private AchievementSyncBean achievementSync;
        private ChallengesBean challenges;
        private Integer achievementPoints;
        private Boolean levelingReward_69;
        private MonthlycratesBean monthlycrates;
        private Boolean levelingReward_70;
        private Boolean levelingReward_71;
        private Boolean levelingReward_72;
        private String currentCloak;
        private AdventRewards2019Bean adventRewards2019;
        private AdventRewardsV22018Bean adventRewards_v2_2018;
        private Summer2021CooldownsBean summer2021Cooldowns;
        private Boolean levelingReward_73;
        private Boolean levelingReward_74;
        private Boolean levelingReward_75;
        private Halloween2021CooldownsBean halloween2021Cooldowns;
        private Boolean levelingReward_76;
        private Boolean levelingReward_77;
        private String particlePack;
        private Boolean levelingReward_78;
        private AchievementTotemBean achievementTotem;
        private Long levelUp_MVP_PLUS;
        private QuestSettingsBean questSettings;
        private Boolean levelingReward_79;
        private String rankPlusColor;
        private Boolean levelingReward_80;
        private SeasonalBean seasonal;
        private Integer completed_christmas_quests_2021;
        private String currentClickEffect;
        private Boolean levelingReward_81;
        private Boolean levelingReward_82;
        private String currentGadget;
        private Integer completed_christmas_quests_2022;
        private Boolean levelingReward_83;
        private Boolean levelingReward_84;
        private Boolean levelingReward_85;
        private Boolean levelingReward_86;
        private Boolean main2017Tutorial;
        private Boolean levelingReward_87;
        private String mostRecentGameType;

        public Double getNetworkExp() {
            return networkExp;
        }

        public static class StatsBean {
            @SerializedName("Battleground")
            private BattlegroundBean battleground;
            @SerializedName("MCGO")
            private MCGOBean mCGO;
            @SerializedName("Paintball")
            private PaintballBean paintball;
            @SerializedName("SkyWars")
            private SkyWarsBean skyWars;
            @SerializedName("HungerGames")
            private HungerGamesBean hungerGames;
            @SerializedName("VampireZ")
            private VampireZBean vampireZ;
            @SerializedName("Arena")
            private ArenaBean arena;
            @SerializedName("GingerBread")
            private GingerBreadBean gingerBread;
            @SerializedName("Arcade")
            private ArcadeBean arcade;
            @SerializedName("Quake")
            private QuakeBean quake;
            @SerializedName("Walls")
            private WallsBean walls;
            @SerializedName("Walls3")
            private Walls3Bean walls3;
            @SerializedName("TNTGames")
            private TNTGamesBean tNTGames;
            @SerializedName("TrueCombat")
            private TrueCombatBean trueCombat;
            @SerializedName("SuperSmash")
            private SuperSmashBean superSmash;
            @SerializedName("UHC")
            private UHCBean uHC;
            @SerializedName("SpeedUHC")
            private SpeedUHCBean speedUHC;
            @SerializedName("SkyClash")
            private SkyClashBean skyClash;
            @SerializedName("Legacy")
            private LegacyBean legacy;
            @SerializedName("Bedwars")
            private BedwarsBean bedwars;
            @SerializedName("BuildBattle")
            private BuildBattleBean buildBattle;
            @SerializedName("MurderMystery")
            private MurderMysteryBean murderMystery;
            @SerializedName("Duels")
            private DuelsBean duels;
            @SerializedName("SkyBlock")
            private SkyBlockBean skyBlock;
            @SerializedName("Pit")
            private PitBean pit;
            @SerializedName("Housing")
            private HousingBean housing;

            
            
            public static class BattlegroundBean {
                private String warrior_spec;
                private String shaman_spec;
                private String paladin_spec;
                private String selected_mount;
                private List<String> packages;
                private String mage_spec;
                private String chosen_class;
                private Integer coins;
            }

            
            
            public static class MCGOBean {
                private List<String> packages;
                private McgoBean mcgo;
                private Integer game_wins;
                private Integer coins;
                private Integer round_wins;
                private Integer game_wins_alleyway;
                private Integer game_wins_temple;
                private Integer headshot_kills;
                private Integer deaths_deathmatch;
                private Integer criminal_kills_deathmatch;
                private Integer shots_fired;
                private Integer weekly_kills_b;
                private Integer kills_deathmatch;
                private Integer monthly_kills_b;
                private Integer kills;
                private Integer deaths;
                private Integer criminal_kills;
                private Integer weekly_kills_a;
                private Integer rifle_recoil_reduction;
                private Integer rifle_cost_reduction;
                private Integer cop_kills;
                private Integer game_wins_overgrown;
                private Integer bombs_planted;
                private Integer bombs_defused;
                private Integer game_wins_deathmatch;
                @SerializedName("game_wins_melon factory")
                private Integer _$Game_wins_melonFactory160;// FIXME check this code
                private String selectedCarbineDev;
                private String selectedRifleDev;
                private String selectedMagnumDev;
                private Integer carbine_cost_reduction;
                private Integer carbine_reload_speed_reduction;
                private Integer carbine_recoil_reduction;
                private Integer carbine_damage_increase;
                private Integer cop_kills_deathmatch;
                private Integer grenade_kills;
                private Integer pocket_change;
                private Integer grenadeKills;
                private Long lastTourneyAd;

                
                
                public static class McgoBean {
                    private Integer points;
                }
            }

            
            
            public static class PaintballBean {
                private List<String> packages;
                private Integer kills;
                private Integer wins;
                private Integer coins;
                private Integer shots_fired;
                private Integer weekly_kills_a;
                private Integer monthly_kills_a;
                private Integer deaths;
                private Integer weekly_kills_b;
                private Integer monthly_kills_b;
                private Integer killstreaks;
            }

            
            
            public static class SkyWarsBean {
                private List<String> packages;
                private String activeKit_TEAM;
                private Integer win_streak;
                private Integer deaths_team_normal;
                private Integer losses_kit_mining_team_default;
                private Integer losses_team_normal;
                private Integer losses;
                private Integer deaths_team;
                private Integer deaths_kit_mining_team_default;
                private Integer deaths;
                private Integer losses_team;
                private Integer quits;
                private Integer survived_players;
                private Integer survived_players_kit_mining_team_default;
                private Integer survived_players_team;
                private Integer blocks_placed;
                private Integer coins;
                private Integer deaths_team_insane;
                private Integer losses_team_insane;
                private Integer arrows_hit;
                private Integer arrows_shot;
                private Boolean usedSoulWell;
                private Integer soul_well;
                private Integer souls;
                private Integer blocks_broken;
                private Integer assists_team;
                private Integer assists;
                private Integer assists_kit_mining_team_default;
                private Integer kills_weekly_b;
                private Integer kills;
                private Integer souls_gathered;
                private Integer kills_team_normal;
                private Integer kills_team;
                private Integer kills_kit_mining_team_default;
                private Integer kills_monthly_a;
                private Integer survived_players_solo;
                private Integer losses_solo_insane;
                private Integer losses_solo;
                private Integer survived_players_kit_basic_solo_default;
                private Integer losses_kit_basic_solo_default;
                private Integer deaths_kit_basic_solo_default;
                private Integer deaths_solo_insane;
                private Integer deaths_solo;
                private Integer egg_thrown;
                private Integer deaths_solo_normal;
                private Integer losses_solo_normal;
                private Integer losses_mega_normal;
                private Integer deaths_mega;
                private Integer survived_players_kit_mega_mega_default;
                private Integer deaths_kit_mega_mega_default;
                private Integer deaths_mega_normal;
                private Integer losses_kit_mega_mega_default;
                private Integer survived_players_mega;
                private Integer losses_mega;
                private String activeKit_MEGA;
                private Integer kills_weekly_a;
                private Integer kills_solo_normal;
                private Integer kills_kit_basic_solo_default;
                private Integer kills_solo;
                private Integer assists_kit_basic_solo_default;
                private Integer assists_solo;
                private Integer kills_kit_mega_mega_default;
                private Integer kills_mega;
                private Integer kills_mega_normal;
                private Integer games_kit_mining_team_default;
                private Integer games_team;
                private Integer games;
                private Integer games_solo;
                private Integer wins_solo_normal;
                private Integer wins;
                private Integer wins_kit_basic_solo_default;
                private Integer wins_solo;
                private Integer games_kit_basic_solo_default;
                private Integer team_ender_mastery;
                private Integer deaths_kit_supporting_team_ecologist;
                private Integer kills_kit_supporting_team_ecologist;
                private Integer survived_players_kit_supporting_team_ecologist;
                private Integer games_kit_supporting_team_ecologist;
                private Integer losses_kit_supporting_team_ecologist;
                private Integer assists_kit_supporting_team_ecologist;
                private Integer assists_mega;
                private Integer assists_kit_mega_mega_default;
                private Integer losses_kit_supporting_team_healer;
                private Integer deaths_kit_supporting_team_healer;
                private Integer survived_players_kit_supporting_team_healer;
                private Integer wins_team_normal;
                private Integer wins_team;
                private Integer wins_kit_supporting_team_healer;
                private Integer assists_kit_supporting_team_healer;
                private Integer refill_chest_destroy;
                private Integer wins_kit_supporting_team_ecologist;
                private Integer paid_souls;
                private Integer soul_well_legendaries;
                private Integer survived_players_kit_attacking_team_scout;
                private Integer kills_kit_attacking_team_scout;
                private Integer losses_kit_attacking_team_scout;
                private Integer deaths_kit_attacking_team_scout;
                private Integer solo_juggernaut;
                private Integer soul_well_rares;
                private Integer solo_mining_expertise;
                private Integer losses_kit_defending_team_armorer;
                private Integer survived_players_kit_defending_team_armorer;
                private Integer deaths_kit_defending_team_armorer;
                private Integer assists_kit_defending_team_armorer;
                private Integer kills_kit_defending_team_armorer;
                private Integer games_kit_defending_team_armorer;
                private Integer wins_kit_defending_team_armorer;
                private Integer enderpearls_thrown;
                private Integer mega_mining_expertise;
                private String activeCage;
                private String activeKit_SOLO;
                private Integer losses_kit_basic_solo_troll;
                private Integer deaths_kit_basic_solo_troll;
                private Integer survived_players_kit_basic_solo_troll;
                private Integer games_kit_basic_solo_troll;
                private Integer solo_ender_mastery;
                private Integer kills_kit_basic_solo_troll;
                private Integer solo_resistance_boost;
                private Integer team_mining_expertise;
                private Integer solo_instant_smelting;
                private Integer losses_kit_advanced_solo_enchanter;
                private Integer deaths_kit_advanced_solo_enchanter;
                private Integer survived_players_kit_advanced_solo_enchanter;
                private Integer games_kit_advanced_solo_enchanter;
                private Integer assists_kit_attacking_team_scout;
                private Integer losses_kit_basic_solo_ecologist;
                private Integer kills_kit_basic_solo_ecologist;
                private Integer survived_players_kit_basic_solo_ecologist;
                private Integer deaths_kit_basic_solo_ecologist;
                private Integer kills_kit_advanced_solo_enchanter;
                private Integer items_enchanted;
                private Integer games_kit_attacking_team_scout;
                private Integer kills_monthly_b;
                private Integer assists_kit_basic_solo_ecologist;
                private Integer games_kit_basic_solo_ecologist;
                private Integer wins_kit_basic_solo_ecologist;
                private Integer losses_kit_attacking_team_knight;
                private Integer survived_players_kit_attacking_team_knight;
                private Integer deaths_kit_attacking_team_knight;
                private Integer kills_kit_attacking_team_knight;
                private Integer assists_kit_attacking_team_knight;
                private Integer wins_kit_attacking_team_knight;
                private Integer games_kit_attacking_team_knight;
                private Integer team_resistance_boost;
                private Integer games_kit_advanced_solo_farmer;
                private Integer wins_kit_advanced_solo_farmer;
                private Integer survived_players_kit_advanced_solo_farmer;
                private Integer kills_kit_advanced_solo_farmer;
                private Integer deaths_kit_advanced_solo_farmer;
                private Integer losses_kit_advanced_solo_farmer;
                private Integer team_instant_smelting;
                private Integer team_arrow_recovery;
                private Integer assists_kit_advanced_solo_farmer;
                private Integer mega_ender_mastery;
                private Integer kills_solo_insane;
                private Integer highestKillstreak;
                private Integer highestWinstreak;
                private Integer winstreak;
                private Integer killstreak;
                private Integer winstreak_kit_attacking_team_knight;
                private Integer winstreak_team;
                private Integer killstreak_solo;
                private Integer wins_solo_insane;
                private Integer winstreak_solo;
                private Integer winstreak_kit_basic_solo_ecologist;
                private Integer killstreak_kit_basic_solo_ecologist;
                private Integer deaths_kit_basic_solo_armorsmith;
                private Integer losses_kit_basic_solo_armorsmith;
                private Integer survived_players_kit_basic_solo_armorsmith;
                private Integer kills_team_insane;
                private Integer survived_players_kit_supporting_team_armorsmith;
                private Integer losses_kit_supporting_team_armorsmith;
                private Integer deaths_kit_supporting_team_armorsmith;
                private Integer deaths_kit_ranked_ranked_default;
                private Integer survived_players_kit_ranked_ranked_default;
                private Integer losses_ranked_normal;
                private Integer deaths_ranked;
                private Integer losses_ranked;
                private Integer deaths_ranked_normal;
                private Integer losses_kit_ranked_ranked_default;
                private Integer survived_players_ranked;
                private Integer team_knowledge;
                private Integer solo_nourishment;
                private String activeKit_RANKED;
                private Integer winstreak_kit_supporting_team_ecologist;
                private Integer killstreak_team;
                private Integer killstreak_kit_supporting_team_ecologist;
                private Integer solo_knowledge;
                private Integer survived_players_kit_basic_solo_pharaoh;
                private Integer losses_kit_basic_solo_pharaoh;
                private Integer deaths_kit_basic_solo_pharaoh;
                private Integer kills_kit_basic_solo_pharaoh;
                private Integer games_kit_basic_solo_pharaoh;
                private Integer killstreak_kit_attacking_team_knight;
                private Integer solo_arrow_recovery;
                private Integer losses_kit_basic_solo_rookie;
                private Integer survived_players_kit_basic_solo_rookie;
                private Integer kills_kit_basic_solo_rookie;
                private Integer deaths_kit_basic_solo_rookie;
                private Integer assists_kit_basic_solo_rookie;
                private Integer games_kit_basic_solo_rookie;
                private Integer wins_kit_basic_solo_rookie;
                private Integer winstreak_kit_basic_solo_rookie;
                private Integer killstreak_kit_basic_solo_rookie;
                private Integer survived_players_kit_advanced_solo_knight;
                private Integer assists_kit_advanced_solo_knight;
                private Integer kills_kit_advanced_solo_knight;
                private Integer deaths_kit_advanced_solo_knight;
                private Integer losses_kit_advanced_solo_knight;
                private Integer killstreak_kit_supporting_team_armorsmith;
                private Integer winstreak_kit_supporting_team_armorsmith;
                private Integer wins_kit_supporting_team_armorsmith;
                private Integer kills_kit_supporting_team_armorsmith;
                private Integer wins_team_insane;
                private Integer games_kit_supporting_team_armorsmith;
                private Integer games_kit_advanced_solo_knight;
                private Integer losses_kit_enderchest_solo_enderchest;
                private Integer games_kit_enderchest_solo_enderchest;
                private Integer deaths_kit_enderchest_solo_enderchest;
                private Integer kills_kit_enderchest_solo_enderchest;
                private Integer survived_players_kit_enderchest_solo_enderchest;
                private Integer winstreak_kit_enderchest_solo_enderchest;
                private Integer wins_kit_enderchest_solo_enderchest;
                private Integer killstreak_kit_enderchest_solo_enderchest;
                private Integer team_savior;
                private Integer kills_kit_basic_solo_armorsmith;
                private Integer mega_nourishment;
                private Integer mega_rusher;
                private Integer winstreak_kit_defending_team_armorer;
                private Integer winstreak_kit_advanced_solo_knight;
                private Integer killstreak_kit_advanced_solo_knight;
                private Integer wins_kit_advanced_solo_knight;
                private Integer games_ranked;
                private Integer kills_kit_ranked_ranked_default;
                private Integer kills_ranked_normal;
                private Integer games_kit_ranked_ranked_default;
                private Integer kills_ranked;
                private Integer survived_players_kit_supporting_team_pharaoh;
                private Integer losses_kit_supporting_team_pharaoh;
                private Integer deaths_kit_supporting_team_pharaoh;
                private Integer losses_kit_supporting_team_rookie;
                private Integer survived_players_kit_supporting_team_rookie;
                private Integer deaths_kit_supporting_team_rookie;
                private Integer assists_kit_supporting_team_pharaoh;
                private Integer kills_kit_supporting_team_pharaoh;
                private Integer kills_kit_supporting_team_rookie;
                private Integer assists_kit_supporting_team_rookie;
                private Integer ranked_instant_smelting;
                private Integer wins_kit_attacking_team_scout;
                private Integer winstreak_kit_attacking_team_scout;
                private Integer killstreak_kit_attacking_team_scout;
                private Integer games_kit_supporting_team_rookie;
                private Integer killstreak_kit_advanced_solo_farmer;
                private Integer winstreak_kit_advanced_solo_farmer;
                private Integer team_nourishment;
                private Integer mega_instant_smelting;
                private Integer team_juggernaut;
                @SerializedName("solo_annoy-o-mite")
                private Integer solo_annoyomite;
                private Integer kills_kit_advanced_solo_enderman;
                private Integer losses_kit_advanced_solo_enderman;
                private Integer survived_players_kit_advanced_solo_enderman;
                private Integer deaths_kit_advanced_solo_enderman;
                private Integer team_speed_boost;
                private Integer xezbeth_luck;
                private Integer killstreak_kit_defending_team_armorer;
                private Integer assists_kit_supporting_team_armorsmith;
                private Integer mega_blazing_arrows;
                @SerializedName("survived_players_kit_defending_team_baseball-player")
                private Integer survived_players_kit_defending_team_baseballplayer;
                @SerializedName("losses_kit_defending_team_baseball-player")
                private Integer losses_kit_defending_team_baseballplayer;
                @SerializedName("deaths_kit_defending_team_baseball-player")
                private Integer deaths_kit_defending_team_baseballplayer;
                @SerializedName("assists_kit_defending_team_baseball-player")
                private Integer assists_kit_defending_team_baseballplayer;
                @SerializedName("kills_kit_defending_team_baseball-player")
                private Integer kills_kit_defending_team_baseballplayer;
                @SerializedName("games_kit_defending_team_baseball-player")
                private Integer games_kit_defending_team_baseballplayer;
                @SerializedName("team_annoy-o-mite")
                private Integer team_annoyomite;
                private Integer team_blazing_arrows;
                private Integer wins_kit_advanced_solo_enchanter;
                private Integer winstreak_kit_advanced_solo_enchanter;
                private Integer assists_kit_advanced_solo_enderman;
                @SerializedName("winstreak_kit_defending_team_baseball-player")
                private Integer winstreak_kit_defending_team_baseballplayer;
                @SerializedName("wins_kit_defending_team_baseball-player")
                private Integer wins_kit_defending_team_baseballplayer;
                @SerializedName("killstreak_kit_defending_team_baseball-player")
                private Integer killstreak_kit_defending_team_baseballplayer;
                private Integer games_kit_supporting_team_healer;
                private Integer killstreak_kit_supporting_team_healer;
                private Integer winstreak_kit_supporting_team_healer;
                private Integer kills_kit_supporting_team_healer;
                private Integer games_kit_supporting_team_pharaoh;
                private Integer team_marksmanship;
                private Integer solo_blazing_arrows;
                private Integer games_kit_advanced_solo_enderman;
                private Integer mega_tank;
                private Integer winstreak_kit_supporting_team_rookie;
                private Integer wins_kit_supporting_team_rookie;
                private Integer killstreak_kit_supporting_team_rookie;
                private Integer mega_marksmanship;
                private Integer mega_juggernaut;
                private Integer survived_players_kit_advanced_solo_hunter;
                private Integer deaths_kit_advanced_solo_hunter;
                private Integer losses_kit_advanced_solo_hunter;
                private Integer kills_kit_advanced_solo_hunter;
                private Integer games_kit_advanced_solo_hunter;
                private Integer winstreak_kit_advanced_solo_hunter;
                private Integer wins_kit_advanced_solo_hunter;
                private Integer killstreak_kit_advanced_solo_hunter;
                private Integer assists_kit_advanced_solo_hunter;
                private Integer deaths_kit_attacking_team_enderman;
                private Integer losses_kit_attacking_team_enderman;
                private Integer survived_players_kit_attacking_team_enderman;
                private Integer mega_arrow_recovery;
                private Integer losses_kit_basic_solo_speleologist;
                private Integer deaths_kit_basic_solo_speleologist;
                private Integer winstreak_kit_basic_solo_speleologist;
                private Integer wins_kit_basic_solo_speleologist;
                private Integer kills_kit_basic_solo_speleologist;
                private Integer games_kit_basic_solo_speleologist;
                private Integer killstreak_kit_basic_solo_speleologist;
                private Integer survived_players_kit_basic_solo_speleologist;
                private Integer assists_kit_basic_solo_speleologist;
                private Integer killstreak_kit_basic_solo_armorsmith;
                private Integer winstreak_kit_basic_solo_armorsmith;
                private Integer wins_kit_basic_solo_armorsmith;
                private Integer games_kit_basic_solo_armorsmith;
                private Integer solo_bulldozer;
                private Integer solo_fat;
                private Integer assists_kit_enderchest_solo_enderchest;
                private Integer survived_players_kit_basic_solo_snowman;
                private Integer kills_kit_basic_solo_snowman;
                private Integer deaths_kit_basic_solo_snowman;
                private Integer losses_kit_basic_solo_snowman;
                private Integer solo_marksmanship;
                private Integer kills_kit_attacking_team_snowman;
                private Integer survived_players_kit_attacking_team_snowman;
                private Integer deaths_kit_attacking_team_snowman;
                private Integer losses_kit_attacking_team_snowman;
                private Integer games_kit_basic_solo_snowman;
                private Integer team_fat;
                private Integer solo_revenge;
                private Integer wins_kit_basic_solo_snowman;
                private Integer winstreak_kit_basic_solo_snowman;
                private Integer killstreak_kit_basic_solo_snowman;
                private Integer assists_kit_basic_solo_snowman;
                private Integer games_kit_attacking_team_snowman;
                private Integer assists_kit_attacking_team_snowman;
                private Integer assists_ranked;
                private Integer assists_kit_ranked_ranked_default;
                private Integer losses_kit_advanced_solo_pyro;
                private Integer survived_players_kit_advanced_solo_pyro;
                private Integer deaths_kit_advanced_solo_pyro;
                private Integer wins_kit_attacking_team_snowman;
                private Integer winstreak_kit_attacking_team_snowman;
                private Integer killstreak_kit_attacking_team_snowman;
                private Integer extra_wheels;
                private Integer kills_kit_attacking_team_enderman;
                private Integer assists_kit_attacking_team_enderman;
                private Integer wins_kit_supporting_team_enchanter;
                private Integer kills_kit_supporting_team_enchanter;
                private Integer games_kit_supporting_team_enchanter;
                private Integer killstreak_kit_supporting_team_enchanter;
                private Integer survived_players_kit_supporting_team_enchanter;
                private Integer winstreak_kit_supporting_team_enchanter;
                private Integer deaths_kit_supporting_team_enchanter;
                private Integer losses_kit_supporting_team_enchanter;
                private Integer kit_mega_mega_armorer;
                private Integer kit_mega_mega_knight;
                private Integer kit_mega_mega_cannoneer;
                private Integer kit_mega_mega_paladin;
                private Integer kit_mega_mega_skeletor;
                private Integer losses_kit_mega_mega_armorer;
                private Integer deaths_kit_mega_mega_armorer;
                private Integer survived_players_kit_mega_mega_armorer;
                private Integer assists_kit_mega_mega_armorer;
                private Integer games_mega;
                private Integer killstreak_kit_mega_mega_armorer;
                private Integer wins_kit_mega_mega_armorer;
                private Integer winstreak_kit_mega_mega_armorer;
                private Integer winstreak_mega;
                private Integer wins_mega_normal;
                private Integer killstreak_mega;
                private Integer wins_mega;
                private Integer games_kit_mega_mega_armorer;
                private Integer kills_kit_mega_mega_armorer;
                private Integer assists_kit_supporting_team_enchanter;
                private Integer kills_kit_mining_team_speleologist;
                private Integer survived_players_kit_mining_team_speleologist;
                private Integer deaths_kit_mining_team_speleologist;
                private Integer losses_kit_mining_team_speleologist;
                private Integer kit_mega_mega_scout;
                private Integer deaths_kit_mega_mega_scout;
                private Integer losses_kit_mega_mega_scout;
                private Integer kills_kit_advanced_solo_pyro;
                private Integer games_kit_advanced_solo_pyro;
                private Integer assists_kit_mining_team_speleologist;
                @SerializedName("kit_mega_mega_baseball-player")
                private Integer kit_mega_mega_baseballplayer;
                private Integer wins_kit_mining_team_speleologist;
                private Integer games_kit_mining_team_speleologist;
                private Integer winstreak_kit_mining_team_speleologist;
                private Integer longest_bow_shot_kit_advanced_solo_knight;
                private Integer longest_bow_shot;
                private Integer longest_bow_shot_solo;
                private Integer melee_kills_solo;
                private Integer most_kills_game_kit_advanced_solo_knight;
                private Integer chests_opened;
                private Integer arrows_hit_solo;
                private Integer time_played_kit_advanced_solo_knight;
                private Integer melee_kills;
                private Integer most_kills_game_solo;
                private Integer arrows_hit_kit_advanced_solo_knight;
                private Integer chests_opened_solo;
                private Integer time_played_solo;
                private Integer chests_opened_kit_advanced_solo_knight;
                private Integer time_played;
                private Integer most_kills_game;
                private Integer melee_kills_kit_advanced_solo_knight;
                private Integer arrows_shot_kit_advanced_solo_knight;
                private Integer arrows_shot_solo;
                private Integer void_kills;
                private Integer void_kills_kit_advanced_solo_knight;
                private Integer void_kills_solo;
                private Integer time_played_kit_attacking_team_knight;
                private Integer melee_kills_team;
                private Integer most_kills_game_team;
                private Integer chests_opened_team;
                private Integer time_played_team;
                private Integer melee_kills_kit_attacking_team_knight;
                private Integer most_kills_game_kit_attacking_team_knight;
                private Integer chests_opened_kit_attacking_team_knight;
                private Integer longest_bow_shot_team;
                private Integer fastest_win_kit_attacking_team_knight;
                private Integer fastest_win;
                private Integer fastest_win_team;
                private Integer longest_bow_shot_kit_attacking_team_knight;
                private Integer arrows_shot_team;
                private Integer void_kills_kit_attacking_team_knight;
                private Integer arrows_hit_team;
                private Integer arrows_hit_kit_attacking_team_knight;
                private Integer void_kills_team;
                private Integer arrows_shot_kit_attacking_team_knight;
                private Integer team_bridger;
                private Integer chests_opened_kit_attacking_team_scout;
                private Integer time_played_kit_attacking_team_scout;
                private Integer chests_opened_kit_ranked_ranked_champion;
                private Integer chests_opened_ranked;
                private Integer time_played_ranked;
                private Integer losses_kit_ranked_ranked_champion;
                private Integer time_played_kit_ranked_ranked_champion;
                private Integer deaths_kit_ranked_ranked_champion;
                private Integer deaths_kit_ranked_ranked_pyromancer;
                private Integer time_played_kit_ranked_ranked_pyromancer;
                private Integer losses_kit_ranked_ranked_pyromancer;
                private Integer chests_opened_kit_ranked_ranked_pyromancer;
                private Integer longest_bow_shot_kit_mega_mega_armorer;
                private Integer longest_bow_shot_mega;
                private Integer chests_opened_kit_mega_mega_armorer;
                private Integer chests_opened_mega;
                private Integer arrows_hit_kit_mega_mega_armorer;
                private Integer arrows_shot_kit_mega_mega_armorer;
                private Integer arrows_shot_mega;
                private Integer time_played_kit_mega_mega_armorer;
                private Integer arrows_hit_mega;
                private Integer time_played_mega;
                private Integer fastest_win_solo;
                private Integer fastest_win_kit_advanced_solo_knight;
                private Integer team_lucky_charm;
                private Integer mega_lucky_charm;
                private Integer melee_kills_kit_basic_solo_speleologist;
                private Integer most_kills_game_kit_basic_solo_speleologist;
                private Integer time_played_kit_basic_solo_speleologist;
                private Integer arrows_shot_kit_basic_solo_speleologist;
                private Integer chests_opened_kit_basic_solo_speleologist;
                private KitAdvancedSoloEndermanInventoryBean kit_advanced_solo_enderman_inventory;
                private Integer chests_opened_kit_basic_solo_batguy;
                private Integer deaths_kit_basic_solo_batguy;
                private Integer time_played_kit_basic_solo_batguy;
                private Integer losses_kit_basic_solo_batguy;
                private Integer melee_kills_kit_attacking_team_scout;
                private Integer most_kills_game_kit_attacking_team_scout;
                private Integer time_played_kit_mining_team_speleologist;
                private Integer melee_kills_kit_mining_team_speleologist;
                private Integer most_kills_game_kit_mining_team_speleologist;
                private Integer longest_bow_shot_kit_attacking_team_energix;
                private Integer losses_kit_attacking_team_energix;
                private Integer chests_opened_kit_attacking_team_energix;
                private Integer time_played_kit_attacking_team_energix;
                private Integer arrows_shot_kit_attacking_team_energix;
                private Integer deaths_kit_attacking_team_energix;
                private Integer survived_players_kit_attacking_team_energix;
                private Integer arrows_hit_kit_attacking_team_energix;
                private Integer chests_opened_kit_defending_team_guardian;
                private Integer survived_players_kit_defending_team_guardian;
                private Integer losses_kit_defending_team_guardian;
                private Integer deaths_kit_defending_team_guardian;
                private Integer time_played_kit_defending_team_guardian;
                private Integer solo_lucky_charm;
                private Integer survived_players_kit_ranked_ranked_champion;
                private Integer melee_kills_ranked;
                private Integer kills_kit_ranked_ranked_champion;
                private Integer most_kills_game_kit_ranked_ranked_champion;
                private Integer most_kills_game_ranked;
                private Integer melee_kills_kit_ranked_ranked_champion;
                private Integer games_kit_ranked_ranked_champion;
                private Integer time_played_kit_defending_team_armorer;
                private Integer mob_kills;
                private Integer mob_kills_solo;
                private Integer mob_kills_kit_advanced_solo_knight;
                private Integer solo_bridger;
                private Integer longest_bow_shot_ranked;
                private Integer longest_bow_shot_kit_ranked_ranked_champion;
                private Integer arrows_shot_kit_ranked_ranked_champion;
                private Integer arrows_hit_ranked;
                private Integer void_kills_kit_ranked_ranked_champion;
                private Integer arrows_shot_ranked;
                private Integer void_kills_ranked;
                private Integer arrows_hit_kit_ranked_ranked_champion;
                private Integer melee_kills_kit_mega_mega_armorer;
                private Integer most_kills_game_mega;
                private Integer melee_kills_mega;
                private Integer most_kills_game_kit_mega_mega_armorer;
                private Integer void_kills_mega;
                private Integer void_kills_kit_mega_mega_armorer;
                private Integer void_kills_kit_attacking_team_scout;
                private Integer fastest_win_kit_attacking_team_scout;
                private Integer survived_players_kit_defending_team_frog;
                private Integer time_played_kit_defending_team_frog;
                private Integer deaths_kit_defending_team_frog;
                private Integer losses_kit_defending_team_frog;
                private Integer chests_opened_kit_defending_team_frog;
                private Integer survived_players_kit_basic_solo_scout;
                private Integer losses_kit_basic_solo_scout;
                private Integer deaths_kit_basic_solo_scout;
                private Integer time_played_kit_basic_solo_scout;
                private Integer chests_opened_kit_basic_solo_scout;
                private Integer chests_opened_kit_advanced_solo_enderman;
                private Integer time_played_kit_advanced_solo_enderman;
                private Integer most_kills_game_kit_advanced_solo_enderman;
                private Integer melee_kills_kit_advanced_solo_enderman;
                private Integer chests_opened_kit_advanced_solo_pyro;
                private Integer time_played_kit_advanced_solo_pyro;
                private Integer fastest_win_kit_advanced_solo_pyro;
                private Integer wins_kit_advanced_solo_pyro;
                private Integer winstreak_kit_advanced_solo_pyro;
                private Integer void_kills_kit_advanced_solo_pyro;
                private Integer most_kills_game_kit_advanced_solo_pyro;
                private Integer killstreak_kit_advanced_solo_pyro;
                private Integer melee_kills_kit_advanced_solo_pyro;
                private Integer assists_kit_advanced_solo_pyro;
                private Integer longest_bow_shot_kit_advanced_solo_pyro;
                private Integer arrows_shot_kit_advanced_solo_pyro;
                private Integer arrows_hit_kit_advanced_solo_pyro;
                private Integer longest_bow_shot_kit_mining_team_speleologist;
                private Integer arrows_hit_kit_mining_team_speleologist;
                private Integer chests_opened_kit_mining_team_speleologist;
                private Integer arrows_shot_kit_mining_team_speleologist;
                private Integer most_kills_game_kit_enderchest_solo_enderchest;
                private Integer melee_kills_kit_enderchest_solo_enderchest;
                private Integer time_played_kit_enderchest_solo_enderchest;
                private Integer chests_opened_kit_enderchest_solo_enderchest;
                private Integer longest_bow_shot_kit_enderchest_solo_enderchest;
                private Integer arrows_hit_kit_enderchest_solo_enderchest;
                private Integer arrows_shot_kit_enderchest_solo_enderchest;
                private Integer time_played_kit_supporting_team_ecologist;
                private Integer chests_opened_kit_supporting_team_ecologist;
                private Integer longest_bow_shot_kit_defending_team_guardian;
                private Integer assists_kit_defending_team_guardian;
                private Integer most_kills_game_kit_defending_team_guardian;
                private Integer mob_kills_kit_defending_team_guardian;
                private Integer void_kills_kit_defending_team_guardian;
                private Integer arrows_hit_kit_defending_team_guardian;
                private Integer games_kit_defending_team_guardian;
                private Integer arrows_shot_kit_defending_team_guardian;
                private Integer melee_kills_kit_defending_team_guardian;
                private Integer mob_kills_team;
                private Integer kills_kit_defending_team_guardian;
                private Integer mega_bridger;
                private Integer longest_bow_shot_kit_defending_team_disco;
                private Integer fastest_win_kit_defending_team_disco;
                private Integer void_kills_kit_defending_team_disco;
                private Integer assists_kit_defending_team_disco;
                private Integer games_kit_defending_team_disco;
                private Integer most_kills_game_kit_defending_team_disco;
                private Integer survived_players_kit_defending_team_disco;
                private Integer arrows_shot_kit_defending_team_disco;
                private Integer wins_kit_defending_team_disco;
                private Integer killstreak_kit_defending_team_disco;
                private Integer winstreak_kit_defending_team_disco;
                private Integer kills_kit_defending_team_disco;
                private Integer chests_opened_kit_defending_team_disco;
                private Integer time_played_kit_defending_team_disco;
                private Integer melee_kills_kit_defending_team_disco;
                private Integer arrows_hit_kit_defending_team_disco;
                private Integer deaths_kit_defending_team_disco;
                private Integer time_played_kit_advanced_solo_cannoneer;
                private Integer chests_opened_kit_advanced_solo_cannoneer;
                private Integer losses_kit_advanced_solo_cannoneer;
                private Integer deaths_kit_advanced_solo_cannoneer;
                private Integer survived_players_kit_advanced_solo_cannoneer;
                private Integer fastest_win_kit_advanced_solo_cannoneer;
                private Integer wins_kit_advanced_solo_cannoneer;
                private Integer void_kills_kit_advanced_solo_cannoneer;
                private Integer winstreak_kit_advanced_solo_cannoneer;
                private Integer most_kills_game_kit_advanced_solo_cannoneer;
                private Integer kills_kit_advanced_solo_cannoneer;
                private Integer killstreak_kit_advanced_solo_cannoneer;
                private Integer melee_kills_kit_advanced_solo_cannoneer;
                private Integer games_kit_advanced_solo_cannoneer;
                private Integer void_kills_kit_mining_team_speleologist;
                private Integer longest_bow_shot_kit_attacking_team_scout;
                private Integer arrows_shot_kit_attacking_team_scout;
                private Integer arrows_hit_kit_attacking_team_scout;
                private Integer assists_kit_ranked_ranked_champion;
                private Integer fastest_win_kit_ranked_ranked_scout;
                private Integer fastest_win_ranked;
                private Integer winstreak_ranked;
                private Integer games_kit_ranked_ranked_scout;
                private Integer survived_players_kit_ranked_ranked_scout;
                private Integer time_played_kit_ranked_ranked_scout;
                private Integer most_kills_game_kit_ranked_ranked_scout;
                private Integer wins_ranked_normal;
                private Integer chests_opened_kit_ranked_ranked_scout;
                private Integer killstreak_ranked;
                private Integer melee_kills_kit_ranked_ranked_scout;
                private Integer arrows_shot_kit_ranked_ranked_scout;
                private Integer winstreak_kit_ranked_ranked_scout;
                private Integer killstreak_kit_ranked_ranked_scout;
                private Integer kills_kit_ranked_ranked_scout;
                private Integer wins_ranked;
                private Integer wins_kit_ranked_ranked_scout;
                private Integer deaths_kit_ranked_ranked_scout;
                private Integer losses_kit_ranked_ranked_scout;
                private Integer void_kills_kit_ranked_ranked_scout;
                private Integer assists_kit_ranked_ranked_scout;
                private KitAdvancedSoloKnightInventoryBean kit_advanced_solo_knight_inventory;
                private Integer most_kills_game_kit_supporting_team_ecologist;
                private Integer melee_kills_kit_supporting_team_ecologist;
                private Integer longest_bow_shot_kit_advanced_solo_hunter;
                private Integer arrows_hit_kit_advanced_solo_hunter;
                private Integer time_played_kit_advanced_solo_hunter;
                private Integer most_kills_game_kit_advanced_solo_hunter;
                private Integer arrows_shot_kit_advanced_solo_hunter;
                private Integer chests_opened_kit_advanced_solo_hunter;
                private Integer melee_kills_kit_advanced_solo_hunter;
                private Integer games_played_skywars;
                private String lastMode;
                private Integer longest_bow_shot_kit_ranked_ranked_scout;
                private Integer arrows_hit_kit_ranked_ranked_scout;
                private Integer fastest_win_kit_mining_team_speleologist;
                private Integer killstreak_kit_mining_team_speleologist;
                private Integer time_played_kit_basic_solo_fisherman;
                private Integer survived_players_kit_basic_solo_fisherman;
                private Integer chests_opened_kit_basic_solo_fisherman;
                private Integer melee_kills_kit_basic_solo_fisherman;
                private Integer most_kills_game_kit_basic_solo_fisherman;
                private Integer losses_kit_basic_solo_fisherman;
                private Integer deaths_kit_basic_solo_fisherman;
                private Integer kills_kit_basic_solo_fisherman;
                private Integer arrows_shot_kit_basic_solo_fisherman;
                private Integer chests_opened_kit_defending_team_armorer;
                private Integer melee_kills_kit_defending_team_armorer;
                private Integer most_kills_game_kit_defending_team_armorer;
                private Integer void_kills_kit_defending_team_armorer;
                private Integer melee_kills_kit_ranked_ranked_pyromancer;
                private Integer games_kit_ranked_ranked_pyromancer;
                private Integer kills_kit_ranked_ranked_pyromancer;
                private Integer most_kills_game_kit_ranked_ranked_pyromancer;
                private Integer survived_players_kit_ranked_ranked_pyromancer;
                private Integer fastest_win_kit_ranked_ranked_pyromancer;
                private Integer killstreak_kit_ranked_ranked_pyromancer;
                private Integer winstreak_kit_ranked_ranked_pyromancer;
                private Integer wins_kit_ranked_ranked_pyromancer;
                private Integer arrows_shot_kit_ranked_ranked_pyromancer;
                private Integer longest_bow_shot_kit_ranked_ranked_pyromancer;
                private Integer arrows_hit_kit_ranked_ranked_pyromancer;
                private Integer void_kills_kit_ranked_ranked_pyromancer;
                private Integer assists_kit_ranked_ranked_pyromancer;
                private Integer survived_players_kit_mining_team_cannoneer;
                private Integer losses_kit_mining_team_cannoneer;
                private Integer melee_kills_kit_mining_team_cannoneer;
                private Integer most_kills_game_kit_mining_team_cannoneer;
                private Integer deaths_kit_mining_team_cannoneer;
                private Integer kills_kit_mining_team_cannoneer;
                private Integer chests_opened_kit_mining_team_cannoneer;
                private Integer arrows_shot_kit_mining_team_cannoneer;
                private Integer time_played_kit_mining_team_cannoneer;
                private Integer losses_kit_attacking_team_grenade;
                private Integer survived_players_kit_attacking_team_grenade;
                private Integer time_played_kit_attacking_team_grenade;
                private Integer chests_opened_kit_attacking_team_grenade;
                private Integer deaths_kit_attacking_team_grenade;
                private Integer arrows_shot_kit_attacking_team_grenade;
                private Integer melee_kills_kit_basic_solo_snowman;
                private Integer chests_opened_kit_basic_solo_snowman;
                private Integer most_kills_game_kit_basic_solo_snowman;
                private Integer time_played_kit_basic_solo_snowman;
                private Integer void_kills_kit_basic_solo_speleologist;
                private Integer mob_kills_mega;
                private Integer mob_kills_kit_mega_mega_armorer;
                private Integer longest_bow_shot_kit_defending_team_armorer;
                private Integer arrows_hit_kit_defending_team_armorer;
                private Integer arrows_shot_kit_defending_team_armorer;
                private Integer fastest_win_kit_defending_team_armorer;
                @SerializedName("time_played_kit_defending_team_baseball-player")
                private Integer time_played_kit_defending_team_baseballplayer;
                @SerializedName("most_kills_game_kit_defending_team_baseball-player")
                private Integer most_kills_game_kit_defending_team_baseballplayer;
                @SerializedName("void_kills_kit_defending_team_baseball-player")
                private Integer void_kills_kit_defending_team_baseballplayer;
                private Integer longest_bow_shot_kit_attacking_team_hunter;
                private Integer deaths_kit_attacking_team_hunter;
                private Integer arrows_hit_kit_attacking_team_hunter;
                private Integer survived_players_kit_attacking_team_hunter;
                private Integer time_played_kit_attacking_team_hunter;
                private Integer losses_kit_attacking_team_hunter;
                private Integer arrows_shot_kit_attacking_team_hunter;
                private Integer chests_opened_kit_attacking_team_hunter;
                private Integer void_kills_kit_attacking_team_hunter;
                private Integer most_kills_game_kit_attacking_team_hunter;
                private Integer kills_kit_attacking_team_hunter;
                private Integer team_environmental_expert;
                private Integer melee_kills_kit_attacking_team_hunter;
                private Integer assists_kit_attacking_team_hunter;
                private Integer chests_opened_kit_advanced_solo_armorer;
                private Integer kills_kit_advanced_solo_armorer;
                private Integer most_kills_game_kit_advanced_solo_armorer;
                private Integer survived_players_kit_advanced_solo_armorer;
                private Integer deaths_kit_advanced_solo_armorer;
                private Integer losses_kit_advanced_solo_armorer;
                private Integer time_played_kit_advanced_solo_armorer;
                private Integer time_played_kit_attacking_team_snowman;
                private Integer fastest_win_kit_defending_team_guardian;
                private Integer killstreak_kit_defending_team_guardian;
                private Integer wins_kit_defending_team_guardian;
                private Integer winstreak_kit_defending_team_guardian;
                private Integer melee_kills_kit_basic_solo_grenade;
                private Integer time_played_kit_basic_solo_grenade;
                private Integer void_kills_kit_basic_solo_grenade;
                private Integer most_kills_game_kit_basic_solo_grenade;
                private Integer kills_kit_basic_solo_grenade;
                private Integer survived_players_kit_basic_solo_grenade;
                private Integer deaths_kit_basic_solo_grenade;
                private Integer losses_kit_basic_solo_grenade;
                private Integer chests_opened_kit_basic_solo_grenade;
                private Integer longest_bow_shot_kit_advanced_solo_cannoneer;
                private Integer arrows_shot_kit_advanced_solo_cannoneer;
                private Integer arrows_hit_kit_advanced_solo_cannoneer;
                private Integer mega_environmental_expert;
                private Integer longest_bow_shot_kit_basic_solo_armorsmith;
                private Integer arrows_hit_kit_basic_solo_armorsmith;
                private Integer chests_opened_kit_basic_solo_armorsmith;
                private Integer most_kills_game_kit_basic_solo_armorsmith;
                private Integer arrows_shot_kit_basic_solo_armorsmith;
                private Integer void_kills_kit_basic_solo_armorsmith;
                private Integer time_played_kit_basic_solo_armorsmith;
                private Integer fastest_win_kit_basic_solo_armorsmith;
                private Integer melee_kills_kit_basic_solo_armorsmith;
                private Integer longest_bow_shot_kit_basic_solo_grenade;
                private Integer arrows_shot_kit_basic_solo_grenade;
                private Integer games_kit_basic_solo_grenade;
                private Integer arrows_hit_kit_basic_solo_grenade;
                private Integer fastest_win_kit_basic_solo_grenade;
                private Integer winstreak_kit_basic_solo_grenade;
                private Integer wins_kit_basic_solo_grenade;
                private Integer killstreak_kit_basic_solo_grenade;
                private Integer fastest_win_kit_attacking_team_grenade;
                private Integer kills_kit_attacking_team_grenade;
                private Integer wins_kit_attacking_team_grenade;
                private Integer winstreak_kit_attacking_team_grenade;
                private Integer most_kills_game_kit_attacking_team_grenade;
                private Integer void_kills_kit_attacking_team_grenade;
                private Integer games_kit_attacking_team_grenade;
                private Integer killstreak_kit_attacking_team_grenade;
                private Integer melee_kills_kit_attacking_team_grenade;
                private Integer longest_bow_shot_kit_attacking_team_grenade;
                private Integer arrows_hit_kit_attacking_team_grenade;
                private Integer melee_kills_kit_advanced_solo_armorer;
                private Integer arrows_shot_kit_advanced_solo_armorer;
                private Integer void_kills_kit_advanced_solo_armorer;
                private Integer fastest_win_kit_advanced_solo_farmer;
                private Integer longest_bow_shot_kit_advanced_solo_farmer;
                private Integer chests_opened_kit_advanced_solo_farmer;
                private Integer most_kills_game_kit_advanced_solo_farmer;
                private Integer time_played_kit_advanced_solo_farmer;
                private Integer arrows_shot_kit_advanced_solo_farmer;
                private Integer melee_kills_kit_advanced_solo_farmer;
                private Integer void_kills_kit_advanced_solo_farmer;
                private Integer arrows_hit_kit_advanced_solo_farmer;
                private Integer longest_bow_shot_kit_basic_solo_fisherman;
                private Integer fastest_win_kit_basic_solo_fisherman;
                private Integer games_kit_basic_solo_fisherman;
                private Integer killstreak_kit_basic_solo_fisherman;
                private Integer void_kills_kit_basic_solo_fisherman;
                private Integer arrows_hit_kit_basic_solo_fisherman;
                private Integer winstreak_kit_basic_solo_fisherman;
                private Integer wins_kit_basic_solo_fisherman;
                private Integer assists_kit_basic_solo_grenade;
                private Integer assists_kit_attacking_team_grenade;
                private Integer longest_bow_shot_kit_basic_solo_scout;
                private Integer arrows_shot_kit_basic_solo_scout;
                private Integer arrows_hit_kit_basic_solo_scout;
                private Integer tnt_madness_explained;
                private Long tnt_madness_explained_last;
                private Integer rush_explained;
                private Long rush_explained_last;
                private Integer win_streak_lab;
                private Integer deaths_lab_kit_advanced_solo_pyro;
                private Integer survived_players_lab_solo;
                private Integer chests_opened_lab_solo;
                private Integer deaths_lab;
                private Integer deaths_lab_solo;
                private Integer time_played_lab_solo;
                private Integer time_played_lab;
                private Integer time_played_lab_kit_advanced_solo_pyro;
                private Integer chests_opened_lab_kit_advanced_solo_pyro;
                private Integer coins_gained_lab;
                private Integer survived_players_lab;
                private Integer chests_opened_lab;
                private Integer losses_lab_solo;
                private Integer survived_players_lab_kit_advanced_solo_pyro;
                private Integer losses_lab_kit_advanced_solo_pyro;
                private Integer losses_lab;
                private Integer blocks_placed_lab;
                private Integer quits_lab;
                private Integer egg_thrown_lab;
                private Integer enderpearls_thrown_lab;
                private String activeKit_TEAMS;
                private Integer assists_kit_advanced_solo_armorer;
                private Integer games_kit_advanced_solo_armorer;
                private Integer longest_bow_shot_kit_advanced_solo_armorer;
                private Integer arrows_hit_kit_advanced_solo_armorer;
                private Long freeLootChestNpc;
                private Integer skywars_chests;
                private Boolean activeKit_TEAMS_random;
                private Integer chests_opened_kit_supporting_team_armorsmith;
                private Integer time_played_kit_supporting_team_armorsmith;
                private Integer most_kills_game_kit_supporting_team_armorsmith;
                private Integer longest_bow_kill_kit_supporting_team_armorsmith;
                private Integer longest_bow_kill_team;
                private Integer longest_bow_kill;
                private Integer melee_kills_kit_supporting_team_armorsmith;
                private Boolean activeKit_SOLO_random;
                private Integer longest_bow_kill_kit_advanced_solo_knight;
                private Integer longest_bow_kill_solo;
                @SerializedName("SkyWars_openedRares")
                private Integer skyWars_openedRares;
                @SerializedName("SkyWars_openedChests")
                private Integer skyWars_openedChests;
                private List<String> skywars_chest_history;
                @SerializedName("SkyWars_openedCommons")
                private Integer skyWars_openedCommons;
                private Integer cosmetic_tokens;
                private String active_projectiletrail;
                private String active_cage;
                private Integer longest_bow_kill_kit_defending_team_armorer;
                private Integer most_kills_game_kit_attacking_team_snowman;
                private Integer void_kills_kit_attacking_team_snowman;
                private Integer chests_opened_kit_attacking_team_snowman;
                private Integer longest_bow_kill_kit_attacking_team_knight;
                private String active_deathcry;
                private Integer longest_bow_kill_kit_advanced_solo_jester;
                private Integer most_kills_game_kit_advanced_solo_jester;
                private Integer deaths_kit_advanced_solo_jester;
                private Integer kills_kit_advanced_solo_jester;
                private Integer survived_players_kit_advanced_solo_jester;
                private Integer melee_kills_kit_advanced_solo_jester;
                private Integer time_played_kit_advanced_solo_jester;
                private Integer losses_kit_advanced_solo_jester;
                private Integer void_kills_kit_advanced_solo_jester;
                private Integer chests_opened_kit_advanced_solo_jester;
                private Integer fastest_win_kit_advanced_solo_jester;
                private Integer winstreak_kit_advanced_solo_jester;
                private Integer killstreak_kit_advanced_solo_jester;
                private Integer games_kit_advanced_solo_jester;
                private Integer wins_kit_advanced_solo_jester;
                private Integer assists_kit_advanced_solo_jester;
                private Integer time_played_kit_advanced_solo_magician;
                private Integer chests_opened_kit_advanced_solo_magician;
                private Integer losses_kit_advanced_solo_magician;
                private Integer survived_players_kit_advanced_solo_magician;
                private Integer deaths_kit_advanced_solo_magician;
                private Integer longest_bow_shot_kit_attacking_team_jester;
                private Integer most_kills_game_kit_attacking_team_jester;
                private Integer deaths_kit_attacking_team_jester;
                private Integer arrows_hit_kit_attacking_team_jester;
                private Integer chests_opened_kit_attacking_team_jester;
                private Integer kills_kit_attacking_team_jester;
                private Integer survived_players_kit_attacking_team_jester;
                private Integer losses_kit_attacking_team_jester;
                private Integer arrows_shot_kit_attacking_team_jester;
                private Integer time_played_kit_attacking_team_jester;
                private Integer void_kills_kit_attacking_team_jester;
                private Integer longest_bow_kill_kit_attacking_team_scout;
                private Integer team_robbery;
                private Integer team_frost;
                private Integer team_necromancer;
                private Integer team_bulldozer;
                private Integer skywars_experience;
                private Integer solo_necromancer;
                private Integer solo_speed_boost;
                private Integer solo_robbery;
                private Integer solo_frost;
                private Integer solo_environmental_expert;
                private String active_killmessages;
                @SerializedName("SkyWars_openedEpics")
                private Integer skyWars_openedEpics;
                private String active_killeffect;
                private Integer longest_bow_kill_kit_advanced_solo_pyro;
                private Integer heads_eww;
                private Integer heads_eww_team;
                private Integer heads_meh;
                private Integer heads;
                private Integer heads_eww_kit_advanced_solo_pyro;
                private Integer heads_meh_kit_advanced_solo_pyro;
                private Integer heads_kit_advanced_solo_pyro;
                private Integer heads_team;
                private Integer heads_meh_team;
                private HeadCollectionBean head_collection;
                private Integer most_kills_game_kit_supporting_team_pyro;
                private Integer longest_bow_kill_kit_supporting_team_pyro;
                private Integer arrows_shot_kit_supporting_team_pyro;
                private Integer time_played_kit_supporting_team_pyro;
                private Integer survived_players_kit_supporting_team_pyro;
                private Integer losses_kit_supporting_team_pyro;
                private Integer melee_kills_kit_supporting_team_pyro;
                private Integer deaths_kit_supporting_team_pyro;
                private Integer chests_opened_kit_supporting_team_pyro;
                private Integer void_kills_kit_supporting_team_pyro;
                private Integer games_kit_supporting_team_pyro;
                private Integer kills_kit_supporting_team_pyro;
                private String levelFormatted;
                private Integer skywars_christmas_boxes;
                private Boolean free_event_key_skywars_christmas_boxes_2019;
                private String active_sprays;
                private Integer longest_bow_kill_kit_advanced_solo_armorer;
                private Integer heads_heavenly;
                private Integer heads_heavenly_kit_advanced_solo_armorer;
                private Integer heads_heavenly_team;
                private Integer heads_kit_advanced_solo_armorer;
                private Integer heads_meh_kit_advanced_solo_armorer;
                private Integer fastest_win_kit_advanced_solo_armorer;
                private Integer killstreak_kit_advanced_solo_armorer;
                private Integer wins_kit_advanced_solo_armorer;
                private Integer heads_yucky;
                private Integer heads_yucky_kit_advanced_solo_armorer;
                private Integer heads_yucky_team;
                private Long slime_explained_last;
                private Integer slime_explained;
                private Integer bow_kills;
                private Integer bow_kills_kit_advanced_solo_armorer;
                private Integer bow_kills_team;
                private Integer skywars_easter_boxes;
                private Boolean free_event_key_skywars_easter_boxes_2020;
                private Integer heads_salty;
                private Integer heads_salty_kit_advanced_solo_armorer;
                private Integer heads_salty_team;
                private Integer opals;
                private Integer longest_bow_kill_kit_advanced_solo_farmer;
                private Integer fall_kills;
                private Integer fall_kills_kit_advanced_solo_knight;
                private Integer fall_kills_team;
                private Integer heads_kit_advanced_solo_knight;
                private Integer heads_meh_kit_advanced_solo_knight;
                private Integer heads_succulent;
                private Integer heads_succulent_kit_advanced_solo_knight;
                private Integer heads_succulent_team;
                private Integer heads_yucky_kit_advanced_solo_knight;
                private Integer heads_decent;
                private Integer heads_decent_kit_advanced_solo_armorer;
                private Integer heads_decent_team;
                private Integer heads_succulent_kit_advanced_solo_armorer;
                private Integer heads_tasty;
                private Integer heads_tasty_kit_advanced_solo_armorer;
                private Integer heads_tasty_team;
                private Integer solo_black_magic;
                private Integer solo_savior;
                private Integer arrows_shot_kit_basic_solo_princess;
                private Integer chests_opened_kit_basic_solo_princess;
                private Integer deaths_kit_basic_solo_princess;
                private Integer losses_kit_basic_solo_princess;
                private Integer survived_players_kit_basic_solo_princess;
                private Integer time_played_kit_basic_solo_princess;
                private Integer arrows_hit_kit_basic_solo_princess;
                private Integer fastest_win_kit_basic_solo_princess;
                private Integer games_kit_basic_solo_princess;
                private Integer kills_kit_basic_solo_princess;
                private Integer killstreak_kit_basic_solo_princess;
                private Integer longest_bow_kill_kit_basic_solo_princess;
                private Integer longest_bow_shot_kit_basic_solo_princess;
                private Integer melee_kills_kit_basic_solo_princess;
                private Integer most_kills_game_kit_basic_solo_princess;
                private Integer wins_kit_basic_solo_princess;
                private Integer longest_bow_kill_kit_advanced_solo_hunter;
                private Integer void_kills_kit_advanced_solo_hunter;
                private Integer fastest_win_kit_advanced_solo_hunter;
                private Integer heads_kit_advanced_solo_hunter;
                private Integer heads_meh_kit_advanced_solo_hunter;
                private Integer heads_eww_kit_advanced_solo_armorer;
                private Integer chests_opened_kit_advanced_solo_guardian;
                private Integer deaths_kit_advanced_solo_guardian;
                private Integer losses_kit_advanced_solo_guardian;
                private Integer survived_players_kit_advanced_solo_guardian;
                private Integer time_played_kit_advanced_solo_guardian;
                private Integer fall_kills_solo;
                private String active_balloon;
                private Integer fall_kills_kit_advanced_solo_armorer;
                private Integer heads_kit_defending_team_armorer;
                private Integer heads_salty_kit_defending_team_armorer;
                private Integer arrows_shot_kit_supporting_team_armorsmith;
                private Integer heads_eww_kit_supporting_team_armorsmith;
                private Integer heads_kit_supporting_team_armorsmith;
                private Integer heads_tasty_kit_supporting_team_armorsmith;
                private String active_victorydance;
                private Integer heads_divine;
                private Integer heads_divine_kit_advanced_solo_knight;
                private Integer heads_divine_team;
                private Integer longest_bow_kill_kit_ranked_ranked_pyromancer;
                private Integer longest_bow_kill_ranked;
                private Integer heads_salty_kit_advanced_solo_pyro;
                private Integer heads_yucky_kit_advanced_solo_pyro;
                private Integer bow_kills_kit_advanced_solo_pyro;
                private Integer heads_decent_kit_advanced_solo_pyro;
                private Integer fall_kills_kit_advanced_solo_pyro;
                private Integer heads_tasty_kit_advanced_solo_pyro;
                private Long lastTourneyAd;
                private Integer heads_eww_kit_advanced_solo_knight;
                private Integer heads_decent_solo;
                private Integer heads_solo;
                private Integer heads_meh_solo;
                private Integer heads_yucky_solo;
                private Integer fall_kills_kit_advanced_solo_farmer;
                private Long lucky_explained_last;
                private Integer lucky_explained;
                private Integer time_played_kit_basic_solo_ecologist;
                private Integer blocks_broken_lab;
                private Integer chests_opened_lab_kit_defending_team_armorer;
                private Integer chests_opened_lab_team;
                private Integer deaths_lab_kit_defending_team_armorer;
                private Integer deaths_lab_team;
                private Integer losses_lab_kit_defending_team_armorer;
                private Integer losses_lab_team;
                private Integer time_played_lab_kit_defending_team_armorer;
                private Integer time_played_lab_team;
                private Integer chests_opened_kit_basic_solo_ecologist;
                private Integer arrows_shot_kit_basic_solo_ecologist;
                private Integer most_kills_game_kit_basic_solo_ecologist;
                private Integer void_kills_kit_basic_solo_ecologist;
                private Integer chests_opened_kit_basic_solo_disco;
                private Integer deaths_kit_basic_solo_disco;
                private Integer losses_kit_basic_solo_disco;
                private Integer survived_players_kit_basic_solo_disco;
                private Integer time_played_kit_basic_solo_disco;
                private Integer heads_salty_kit_advanced_solo_knight;
                private Integer heads_salty_solo;
                private Integer heads_kit_advanced_solo_farmer;
                private Integer heads_succulent_kit_advanced_solo_farmer;
                private Integer heads_succulent_solo;
                private Integer chests_opened_kit_defending_team_farmer;
                private Integer deaths_kit_defending_team_farmer;
                private Integer heads_eww_kit_defending_team_farmer;
                private Integer heads_kit_defending_team_farmer;
                private Integer kills_kit_defending_team_farmer;
                private Integer losses_kit_defending_team_farmer;
                private Integer most_kills_game_kit_defending_team_farmer;
                private Integer survived_players_kit_defending_team_farmer;
                private Integer time_played_kit_defending_team_farmer;
                private Integer void_kills_kit_defending_team_farmer;
                private Integer heads_divine_kit_attacking_team_knight;
                private Integer heads_eww_kit_attacking_team_knight;
                private Integer heads_kit_attacking_team_knight;
                private Integer heads_yucky_kit_attacking_team_knight;
                private Integer harvesting_season;
                private Integer mob_kills_kit_advanced_solo_pyro;
                private Integer avarice;
                private Integer angel_of_death_level;
                private String selected_prestige_icon;
                @SerializedName("chests_opened_kit_mythical_nether-lord")
                private Integer chests_opened_kit_mythical_netherlord;
                @SerializedName("deaths_kit_mythical_nether-lord")
                private Integer deaths_kit_mythical_netherlord;
                @SerializedName("kills_kit_mythical_nether-lord")
                private Integer kills_kit_mythical_netherlord;
                @SerializedName("losses_kit_mythical_nether-lord")
                private Integer losses_kit_mythical_netherlord;
                @SerializedName("most_kills_game_kit_mythical_nether-lord")
                private Integer most_kills_game_kit_mythical_netherlord;
                @SerializedName("survived_players_kit_mythical_nether-lord")
                private Integer survived_players_kit_mythical_netherlord;
                @SerializedName("time_played_kit_mythical_nether-lord")
                private Integer time_played_kit_mythical_netherlord;
                @SerializedName("void_kills_kit_mythical_nether-lord")
                private Integer void_kills_kit_mythical_netherlord;
                @SerializedName("games_kit_mythical_nether-lord")
                private Integer games_kit_mythical_netherlord;
                @SerializedName("longest_bow_kill_kit_mythical_nether-lord")
                private Integer longest_bow_kill_kit_mythical_netherlord;
                @SerializedName("melee_kills_kit_mythical_nether-lord")
                private Integer melee_kills_kit_mythical_netherlord;
                @SerializedName("assists_kit_mythical_nether-lord")
                private Integer assists_kit_mythical_netherlord;
                private Integer inGamePresentsCap_2021_13;
                private Boolean free_event_key_skywars_christmas_boxes_2021_2;
                @SerializedName("SkyWars_openedLegendaries")
                private Integer skyWars_openedLegendaries;
                private Integer inGamePresentsCap_2021_17;
                private Integer inGamePresentsCap_2021_24;
                private Integer inGamePresentsCap_2021_30;
                private Integer heads_kit_attacking_team_scout;
                private Integer heads_meh_kit_attacking_team_scout;
                private Integer inGamePresentsCap_2021_31;
                private Integer heads_decent_kit_attacking_team_scout;
                private Integer inGamePresentsCap_2022_7;
                private Integer heads_eww_kit_basic_solo_ecologist;
                private Integer heads_kit_basic_solo_ecologist;
                private Integer heads_yucky_kit_basic_solo_ecologist;
                private Integer longest_bow_kill_kit_basic_solo_ecologist;
                private Integer melee_kills_kit_basic_solo_ecologist;
                private Integer shard;
                private Integer shard_kit_basic_solo_ecologist;
                private Integer shard_team;
                private Integer inGamePresentsCap_2022_8;
                private Integer assists_kit_basic_solo_disco;
                private Integer kills_kit_basic_solo_disco;
                private Integer longest_bow_kill_kit_basic_solo_disco;
                private Integer melee_kills_kit_basic_solo_disco;
                private Integer most_kills_game_kit_basic_solo_disco;
                private Integer mobs_killed;
                private Integer mobs_killed_kit_advanced_solo_knight;
                private Integer mobs_killed_team;
                private Integer heads_decent_kit_advanced_solo_knight;
                private Integer shard_kit_advanced_solo_knight;
                private Integer shard_kit_advanced_solo_armorer;
                private Integer mob_kills_kit_advanced_solo_armorer;
                private Integer solo_barbarian;
                private Integer heads_divine_kit_advanced_solo_armorer;
                private Integer heads_divine_solo;
                private Integer shard_solo;
                private Integer mobs_killed_kit_advanced_solo_farmer;
                private Integer heads_eww_kit_advanced_solo_farmer;
                private Integer shard_kit_advanced_solo_farmer;
                private Boolean activeKit_RANKED_random;
                private Integer deaths_kit_ranked_ranked_paladin;
                private Integer losses_kit_ranked_ranked_paladin;
                private Integer time_played_kit_ranked_ranked_paladin;
                private Integer fall_kills_kit_ranked_ranked_paladin;
                private Integer fall_kills_ranked;
                private Integer fastest_win_kit_ranked_ranked_paladin;
                private Integer games_kit_ranked_ranked_paladin;
                private Integer kills_kit_ranked_ranked_paladin;
                private Integer killstreak_kit_ranked_ranked_paladin;
                private Integer most_kills_game_kit_ranked_ranked_paladin;
                private Integer survived_players_kit_ranked_ranked_paladin;
                private Integer void_kills_kit_ranked_ranked_paladin;
                private Integer wins_kit_ranked_ranked_paladin;
                private Integer chests_opened_kit_ranked_ranked_magician;
                private Integer deaths_kit_ranked_ranked_magician;
                private Integer games_kit_ranked_ranked_magician;
                private Integer losses_kit_ranked_ranked_magician;
                private Integer survived_players_kit_ranked_ranked_magician;
                private Integer time_played_kit_ranked_ranked_magician;
                private Integer chests_opened_kit_ranked_ranked_armorer;
                private Integer deaths_kit_ranked_ranked_armorer;
                private Integer games_kit_ranked_ranked_armorer;
                private Integer kills_kit_ranked_ranked_armorer;
                private Integer losses_kit_ranked_ranked_armorer;
                private Integer most_kills_game_kit_ranked_ranked_armorer;
                private Integer survived_players_kit_ranked_ranked_armorer;
                private Integer time_played_kit_ranked_ranked_armorer;
                private Integer void_kills_kit_ranked_ranked_armorer;

                
                
                public static class KitAdvancedSoloEndermanInventoryBean {
                    @SerializedName("ENDER_PEARL:0")
                    private String _$ENDER_PEARL0101;// FIXME check this code
                }

                
                
                public static class KitAdvancedSoloKnightInventoryBean {
                    @SerializedName("GOLD_HELMET:0")
                    private String _$GOLD_HELMET0215;// FIXME check this code
                    @SerializedName("GOLD_SWORD:0")
                    private String _$GOLD_SWORD0298;// FIXME check this code
                }

                
                
                public static class HeadCollectionBean {
                    private List<RecentBean> recent;
                    private List<PrestigiousBean> prestigious;

                    
                    
                    public static class RecentBean {
                        private String uuid;
                        private Long timestamp;
                        private String mode;
                        private String sacrifice;
                    }

                    
                    
                    public static class PrestigiousBean {
                        private String uuid;
                        private Long timestamp;
                        private String mode;
                        private String sacrifice;
                    }
                }
            }

            
            
            public static class HungerGamesBean {
                private Integer deaths;
                private Integer monthly_kills_a;
                private Integer coins;
                private Integer weekly_kills_b;
                private Integer kills;
                private Integer monthly_kills_b;
                private Integer weekly_kills_a;
                private Integer togglekillcounter;
                private Integer wins_teams;
                private Integer archer;
                private Integer knight;
                private List<String> packages;
                private Long lastTourneyAd;
                private Integer wins_teams_normal;
                private Boolean autoarmor;
                private Integer wins_backup;
                private Integer wins;
                private Integer wins_solo_normal;
                private Integer arrows_fired;
                private Integer arrows_fired_knight;
                private Integer arrows_hit;
                private Integer arrows_hit_knight;
                private Integer chests_opened;
                private Integer chests_opened_knight;
                private Integer damage;
                private Integer damage_knight;
                private Integer damage_taken;
                private Integer damage_taken_knight;
                private Integer exp_knight;
                private Integer games_played;
                private Integer games_played_knight;
                private Integer kills_knight;
                private Integer kills_teams_normal;
                private Integer potions_drunk;
                private Integer potions_drunk_knight;
                private Integer time_played;
                private Integer time_played_knight;
                private Integer chests_opened_scout;
                private Integer damage_scout;
                private Integer damage_taken_scout;
                private Integer exp_scout;
                private Integer games_played_scout;
                private Integer potions_thrown;
                private Integer potions_thrown_scout;
                private Integer time_played_scout;
                private String chosen_victorydance;
                private String aura;
                private String chosen_finisher;
                private Integer arrows_fired_archer;
                private Integer chests_opened_archer;
                private Integer damage_archer;
                private Integer damage_taken_archer;
                private Integer exp_archer;
                private Integer games_played_archer;
                private Integer kills_archer;
                private Integer potions_drunk_archer;
                private Integer time_played_archer;
                private Integer arrows_hit_archer;
                private Integer chests_opened_guardian;
                private Integer damage_guardian;
                private Integer damage_taken_guardian;
                private Integer games_played_guardian;
                private Integer potions_drunk_guardian;
                private Integer time_played_guardian;
                private Integer potions_thrown_knight;
                private Integer wins_teams_knight;
                private Integer mobs_spawned;
                private Integer mobs_spawned_knight;
                private Boolean toggled;
                private Integer kills_solo_normal;
                private String afterkill;
            }

            
            
            public static class VampireZBean {
                private Integer human_deaths;
                private Integer vampire_deaths;
                private Integer human_kills;
                private Integer coins;
                private Integer zombie_kills;
                private Boolean updated_stats;
            }

            
            
            public static class ArenaBean {
                private Double rating;
                private Integer win_streaks_1v1;
                private Integer deaths_1v1;
                private Integer coins;
                private Integer damage_1v1;
                private Integer games_1v1;
                private Integer losses_1v1;
                private Integer win_streaks_2v2;
                private Integer deaths_2v2;
                private Integer losses_2v2;
                private Integer damage_2v2;
                private Integer games_2v2;
                private Integer win_streaks_4v4;
                private Integer losses_4v4;
                private Integer damage_4v4;
                private Integer deaths_4v4;
                private Integer games_4v4;
                private Integer wins_4v4;
                private Integer kills_4v4;
                private Integer keys;
                private Integer wins;
            }

            
            
            public static class GingerBreadBean {
                private String engine_active;
                private String pants_active;
                private String skin_active;
                private List<String> packages;
                private String booster_active;
                private String helmet_active;
                private String shoes_active;
                private String frame_active;
                private String jacket_active;
                private String horn;
                private Integer box_pickups_monthly_a;
                private Integer olympus_plays;
                private Integer banana_hits_received;
                private Integer box_pickups;
                private Integer coins_picked_up;
                private Integer box_pickups_weekly_b;
                private Integer laps_completed;
                private Integer box_pickups_olympus;
                private Integer coins;
                private Integer box_pickups_monthly_b;
                private Integer box_pickups_hypixelgp;
                private Integer hypixelgp_plays;
                private String parts;
                private Integer banana_hits_sent;
                private Integer box_pickups_junglerush;
                private Integer junglerush_plays;
                private Integer box_pickups_canyon;
                private Integer canyon_plays;
            }

            
            
            public static class ArcadeBean {
                private Integer coins;
                private Integer monthly_coins_a;
                private Integer weekly_coins_a;
                private Integer weekly_coins_b;
                private Integer monthly_coins_b;
                private Integer max_wave;
                private Integer sw_kills;
                private Integer sw_weekly_kills_a;
                private Integer sw_deaths;
                private Integer sw_shots_fired;
                private Integer sw_monthly_kills_b;
                private Integer sw_rebel_kills;
                private Boolean music;
                private Integer wins_soccer;
                private Integer powerkicks_soccer;
                private Integer goals_soccer;
                private String miniwalls_activeKit;
                private Integer arrows_hit_mini_walls;
                private Integer kills_mini_walls;
                private Integer wither_kills_mini_walls;
                private Integer deaths_mini_walls;
                private Integer arrows_shot_mini_walls;
                private Integer wither_damage_mini_walls;
                private Integer stamp_level;
                private Long time_stamp;
                private Integer kills_throw_out;
                private Integer deaths_throw_out;
                private Integer final_kills_mini_walls;
                private Integer wins_mini_walls;
                private Integer poop_collected;
                private Integer wins_farm_hunt;
                private Integer rounds_simon_says;
                private Integer sw_weekly_kills_b;
                private Integer sw_monthly_kills_a;
                private Integer wins_party;
                private Integer headshots_dayone;
                private Integer kills_dayone;
                private Integer sw_empire_kills;
                private Integer sw_game_wins;
                private Integer kills_oneinthequiver;
                private Integer deaths_oneinthequiver;
                private Integer wins_simon_says;
                private Integer wins_party_3;
                private Boolean dec2016_achievements;
                private Boolean dec2016_achievements2;
                private Integer bounty_kills_oneinthequiver;
                private Boolean simon_song;
                private Integer fastest_time_10_zombies_deadend_normal;
                private Integer best_round_zombies;
                private Integer fastest_time_10_zombies;
                private Integer players_revived_zombies;
                private Integer headshots_zombies;
                private Integer deaths_zombies;
                private Integer bullets_shot_zombies;
                private Integer times_knocked_down_zombies;
                private Integer zombie_kills_zombies;
                private Integer bullets_hit_zombies;
                private Integer gifts_grinch_simulator_v2;
                private Integer kicks_soccer;
                private Integer basic_zombie_kills_zombies;
                private Integer best_round_zombies_alienarcadium;
                private Integer best_round_zombies_alienarcadium_normal;
                private Integer blob_zombie_kills_zombies;
                private Integer clown_zombie_kills_zombies;
                private Integer deaths_zombies_alienarcadium;
                private Integer deaths_zombies_alienarcadium_normal;
                private Integer fastest_time_10_zombies_alienarcadium_normal;
                private Integer fastest_time_20_zombies;
                private Integer fastest_time_20_zombies_alienarcadium_normal;
                private Integer ghast_zombie_kills_zombies;
                private Integer mega_blob_zombie_kills_zombies;
                private Integer pig_zombie_zombie_kills_zombies;
                private Integer players_revived_zombies_alienarcadium;
                private Integer players_revived_zombies_alienarcadium_normal;
                private Integer rainbow_zombie_kills_zombies;
                private Integer sentinel_zombie_kills_zombies;
                private Integer skeleton_zombie_kills_zombies;
                private Integer space_blaster_zombie_kills_zombies;
                private Integer space_grunt_zombie_kills_zombies;
                private Integer times_knocked_down_zombies_alienarcadium;
                private Integer times_knocked_down_zombies_alienarcadium_normal;
                private Integer total_rounds_survived_zombies;
                private Integer total_rounds_survived_zombies_alienarcadium;
                private Integer total_rounds_survived_zombies_alienarcadium_normal;
                private Integer windows_repaired_zombies;
                private Integer windows_repaired_zombies_alienarcadium;
                private Integer windows_repaired_zombies_alienarcadium_normal;
                private Integer worm_small_zombie_kills_zombies;
                private Integer worm_zombie_kills_zombies;
                private Integer zombie_kills_zombies_alienarcadium;
                private Integer zombie_kills_zombies_alienarcadium_normal;
                private Integer best_round_zombies_deadend;
                private Integer best_round_zombies_deadend_normal;
                private Integer deaths_zombies_deadend;
                private Integer deaths_zombies_deadend_normal;
                private Integer doors_opened_zombies;
                private Integer doors_opened_zombies_deadend;
                private Integer doors_opened_zombies_deadend_normal;
                private Integer empowered_zombie_kills_zombies;
                private Integer fire_zombie_kills_zombies;
                private Integer magma_cube_zombie_kills_zombies;
                private Integer magma_zombie_kills_zombies;
                private Integer times_knocked_down_zombies_deadend;
                private Integer times_knocked_down_zombies_deadend_normal;
                private Integer tnt_baby_zombie_kills_zombies;
                private Integer total_rounds_survived_zombies_deadend;
                private Integer total_rounds_survived_zombies_deadend_normal;
                private Integer windows_repaired_zombies_deadend;
                private Integer windows_repaired_zombies_deadend_normal;
                private Integer wolf_zombie_kills_zombies;
                private Integer zombie_kills_zombies_deadend;
                private Integer zombie_kills_zombies_deadend_normal;
                private Integer best_round_zombies_badblood;
                private Integer best_round_zombies_badblood_normal;
                private Integer deaths_zombies_badblood;
                private Integer deaths_zombies_badblood_normal;
                private Integer players_revived_zombies_badblood;
                private Integer players_revived_zombies_badblood_normal;
                private Integer slime_zombie_kills_zombies;
                private Integer slime_zombie_zombie_kills_zombies;
                private Integer times_knocked_down_zombies_badblood;
                private Integer times_knocked_down_zombies_badblood_normal;
                private Integer total_rounds_survived_zombies_badblood;
                private Integer total_rounds_survived_zombies_badblood_normal;
                private Integer werewolf_zombie_kills_zombies;
                private Integer windows_repaired_zombies_badblood;
                private Integer windows_repaired_zombies_badblood_normal;
                private Integer witch_zombie_kills_zombies;
                private Integer wolf_pet_zombie_kills_zombies;
                private Integer zombie_kills_zombies_badblood;
                private Integer zombie_kills_zombies_badblood_normal;
                private Integer chgluglu_zombie_kills_zombies;
                private Integer giant_zombie_kills_zombies;
                private Integer jungle_jump_best_time_party;
                private Integer lawn_moower_mowed_best_score_party;
                private Integer lawn_moower_mowed_total_score_party;
                private Integer dangerous_taunts_used_farm_hunt;
                private Integer firework_taunts_used_farm_hunt;
                private Integer risky_taunts_used_farm_hunt;
                private Integer safe_taunts_used_farm_hunt;
                private Integer taunts_used_farm_hunt;
                private Integer round_wins_simon_says;
                private Integer top_score_simon_says;
                private Integer hunter_kills_farm_hunt;
                private Integer hunter_wins_farm_hunt;
                private Integer kills_farm_hunt;
                private Integer poop_collected_farm_hunt;
                private List<String> packages;
                private String active_movement_trail;
                private String active_projectile_trail;
                private Integer animal_slaughter_best_score_party;
                private Integer animal_slaughter_kills_party;
                private Integer animal_slaughter_round_wins_party;
                private Integer jigsaw_rush_best_time_party;
                private Integer pig_fishing_round_wins_party;
                private Integer round_wins_party;
                private Integer rpg_16_kills_best_score_party;
                private Integer rpg_16_kills_party;
                private Integer rpg_16_round_wins_party;
                private Integer total_stars_party;
                private Integer hoe_hoe_hoe_best_score_party;
                private Integer hoe_hoe_hoe_total_score_party;
                private Integer animal_wins_farm_hunt;
                private String active_victory_dance;
                private Integer avalanche_round_wins_party;
                private Integer bombardment_best_time_party;
                private Integer dive_best_score_party;
                private Integer dive_round_wins_party;
                private Integer dive_total_score_party;
                private Integer pig_jousting_round_wins_party;
                private Integer spider_maze_best_time_party;
                private Integer chicken_rings_best_time_party;
                private Integer volcano_round_wins_party;
                private Integer jungle_jump_round_wins_party;
                private Integer high_ground_best_score_party;
                private Integer high_ground_total_score_party;
                private Integer the_floor_is_lava_best_time_party;
            }

            
            
            public static class QuakeBean {
                private List<String> packages;
                private Integer kills;
                private Integer coins;
                private Integer monthly_kills_a;
                private Integer weekly_kills_a;
                private Integer deaths;
                private Integer monthly_kills_b;
                private Integer weekly_kills_b;
                @SerializedName("case")
                private String caseX;
                private Long lastTourneyAd;
            }

            
            
            public static class WallsBean {
                private Integer losses;
                private Integer deaths;
                private Integer coins;
                private Integer kills;
                private Integer weekly_kills_b;
                private Integer monthly_kills_a;
                private List<String> packages;
                private Integer sage;
                private Integer monthly_assists_b;
                private Integer assists;
                private Integer weekly_assists_b;
                private Integer monthly_kills_b;
                private Integer wins;
                private Integer weekly_wins_b;
                private Integer monthly_wins_b;
                private Integer dwarwen_skills;
                private Integer fisherman;
                private Integer smart_boy;
                private Integer blacksmith;
                private Integer weekly_kills_a;
                private Integer monthly_assists_a;
                private Integer weekly_assists_a;
                private Integer weekly_wins_a;
                private Integer monthly_wins_a;
                private Integer boss_skills;
                private Integer snack_lover;
                private Integer ready;
                private Integer skybase_king;
                private Integer gold_rush;
                private Integer artisan;
                private Integer votes_Aztec;
                private Integer berserk;
                private Integer adrenaline;
                private Integer hunter;
                private Integer guitarist;
                private Integer grave_digger;
                private Integer scotsman;
                private Integer chemist;
                private Integer step;
                private Integer bomberman;
                private Integer expert_miner;
                private Integer votes_Island;
                private Integer lazyman;
                private Integer votes_Nordic;
                private Integer fortune;
                private Integer einstein;
                private Integer fireproof;
                private Integer cats_eye;
                private Integer votes_Saraat;
                private Integer votes_Castle;
                private Integer votes_Jungle;
                private Integer burn_baby_burn;
                private Integer haste;
                private Integer swift;
                private Integer shout_count;
                private Integer master_troll;
                private Integer bacon;
                @SerializedName("Inventory")
                private InventoryBean inventory;
                private Integer votes_Egypt;
                private Integer very_fortunate;
                private Integer blacksmith_starter;
                private Integer vampirism;
                private Integer boss_guardian;
                private Integer leather_worker;
                private Integer soup_drinker;
                private Integer ecologist;
                @SerializedName("InventoryLayout2")
                private InventoryLayout2Bean inventoryLayout2;

                
                
                public static class InventoryBean {
                    @SerializedName("22")
                    private String _$22;
                    @SerializedName("23")
                    private String _$23;
                    @SerializedName("24")
                    private String _$24;
                    @SerializedName("10")
                    private String _$10;
                    @SerializedName("11")
                    private String _$11;
                    @SerializedName("12")
                    private String _$12;
                    @SerializedName("13")
                    private String _$13;
                    @SerializedName("35")
                    private String _$35;
                    @SerializedName("14")
                    private String _$14;
                    @SerializedName("15")
                    private String _$15;
                    @SerializedName("16")
                    private String _$16;
                    @SerializedName("18")
                    private String _$18;
                    @SerializedName("19")
                    private String _$19;
                    @SerializedName("0")
                    private String _$0;
                    @SerializedName("1")
                    private String _$1;
                    @SerializedName("2")
                    private String _$2;
                    @SerializedName("3")
                    private String _$3;
                    @SerializedName("4")
                    private String _$4;
                    @SerializedName("5")
                    private String _$5;
                    @SerializedName("6")
                    private String _$6;
                    @SerializedName("7")
                    private String _$7;
                    @SerializedName("8")
                    private String _$8;
                    @SerializedName("9")
                    private String _$9;
                    @SerializedName("20")
                    private String _$20;
                    @SerializedName("21")
                    private String _$21;
                }

                
                
                public static class InventoryLayout2Bean {
                    @SerializedName("22")
                    private String _$22;
                    @SerializedName("23")
                    private String _$23;
                    @SerializedName("24")
                    private String _$24;
                    @SerializedName("25")
                    private String _$25;
                    @SerializedName("26")
                    private String _$26;
                    @SerializedName("27")
                    private String _$27;
                    @SerializedName("28")
                    private String _$28;
                    @SerializedName("29")
                    private String _$29;
                    @SerializedName("30")
                    private String _$30;
                    @SerializedName("31")
                    private String _$31;
                    @SerializedName("10")
                    private String _$10;
                    @SerializedName("32")
                    private String _$32;
                    @SerializedName("11")
                    private String _$11;
                    @SerializedName("33")
                    private String _$33;
                    @SerializedName("12")
                    private String _$12;
                    @SerializedName("34")
                    private String _$34;
                    @SerializedName("13")
                    private String _$13;
                    @SerializedName("35")
                    private String _$35;
                    @SerializedName("14")
                    private String _$14;
                    @SerializedName("15")
                    private String _$15;
                    @SerializedName("16")
                    private String _$16;
                    @SerializedName("0")
                    private String _$0;
                    @SerializedName("1")
                    private String _$1;
                    @SerializedName("2")
                    private String _$2;
                    @SerializedName("3")
                    private String _$3;
                    @SerializedName("4")
                    private String _$4;
                    @SerializedName("5")
                    private String _$5;
                    @SerializedName("9")
                    private String _$9;
                    @SerializedName("20")
                    private String _$20;
                    @SerializedName("21")
                    private String _$21;
                }
            }

            
            
            public static class Walls3Bean {
                private List<String> packages;
                private String chosen_class;
                private Integer weeklyLosses_practice;
                private Integer deaths_Skeleton;
                private Integer weeklyDeaths_Skeleton;
                private Integer coins;
                private Integer losses_practice_Skeleton;
                private Integer weeklyDeaths;
                private Integer weeklyLosses_Skeleton;
                private Integer finalDeaths;
                private Integer losses_practice;
                private Integer weeklyLosses_practice_Skeleton;
                private Integer losses;
                private Integer assists_Skeleton;
                private Integer weeklyLosses;
                private Integer assists;
                private Integer deaths;
                private Integer losses_Skeleton;
                private Integer plays_practice;
                private Boolean colorblind;
                private Integer weeklyDeaths_Herobrine;
                private Integer plays_face_off;
                private Integer deaths_new;
                private Integer deaths_new_Herobrine;
                private Integer assists_Herobrine;
                private Integer deaths_Herobrine;
                private Integer skeleton_losses;
                private Integer skeleton_deaths;
                private Integer herobrine_deaths;
                private Integer herobrine_d;
                private Integer herobrine_a;
                private Integer herobrine_b;
                private Integer herobrine_a_activations_deathmatch_face_off;
                private Integer herobrine_time_played_face_off;
                private Integer herobrine_a_defender_assists;
                private Integer herobrine_assists;
                private Integer final_deaths_face_off;
                private Integer herobrine_meters_walked_face_off;
                private Integer kills_face_off;
                private Integer total_final_kills;
                private Integer herobrine_iron_ore_broken_face_off;
                private Integer food_eaten_face_off;
                private Integer herobrine_treasures_found_face_off;
                private Integer herobrine_games_played;
                private Integer herobrine_defender_assists_face_off;
                private Integer herobrine_iron_ore_broken;
                private Integer total_deaths;
                private Integer herobrine_total_kills_face_off;
                private Integer herobrine_potions_drunk;
                private Integer herobrine_blocks_broken;
                private Integer blocks_broken_face_off;
                private Integer games_played_face_off;
                private Integer steaks_eaten_face_off;
                private Integer herobrine_kills_melee_behind;
                private Integer total_kills;
                private Integer treasures_found;
                private Integer herobrine_a_kills;
                private Integer herobrine_defender_kills_face_off;
                private Integer iron_armor_gifted_december;
                private Integer herobrine_assists_face_off;
                private Integer herobrine_a_damage_dealt;
                private Integer herobrine_defender_kills;
                private Integer blocks_placed_face_off;
                private Integer herobrine_a_defender_kills_face_off;
                private Integer herobrine_blocks_placed;
                private Integer time_played;
                private Integer herobrine_kills_melee_face_off;
                private Integer herobrine_blocks_placed_preparation;
                private Integer herobrine_food_eaten;
                private Integer herobrine_damage_dealt_face_off;
                private Integer herobrine_kills;
                private Integer kills_melee_face_off;
                private Integer herobrine_a_total_kills;
                private Integer herobrine_defender_assists;
                private Integer total_final_kills_face_off;
                private Integer kills_melee_behind_face_off;
                private Integer final_deaths;
                private Integer herobrine_blocks_placed_face_off;
                private Integer games_played;
                private Integer meters_walked_speed_face_off;
                private Integer herobrine_kills_melee;
                private Integer herobrine_total_deaths;
                private Integer herobrine_kills_face_off;
                private Integer herobrine_kills_melee_behind_face_off;
                private Integer herobrine_a_assists_face_off;
                private Integer blocks_placed_preparation;
                private Integer herobrine_final_deaths;
                private Integer herobrine_a_defender_kills;
                private Integer treasures_found_face_off;
                private Integer activations_deathmatch_face_off;
                private Integer activations_face_off;
                private Integer herobrine_meters_walked_speed_face_off;
                private Integer herobrine_meters_fallen_face_off;
                private Integer meters_fallen_face_off;
                private Integer damage_dealt;
                private Integer defender_kills_face_off;
                private Integer herobrine_activations;
                private Integer herobrine_total_final_kills_face_off;
                private Integer assists_face_off;
                private Integer final_assists;
                private Integer herobrine_a_kills_face_off;
                private Integer herobrine_final_assists;
                private Integer herobrine_a_assists;
                private Integer damage_dealt_face_off;
                private Integer herobrine_iron_armor_gifted_december_face_off;
                private Integer herobrine_losses_face_off;
                private Integer defender_assists_face_off;
                private Integer losses_face_off;
                private Integer food_eaten;
                private Integer time_played_face_off;
                private Integer herobrine_potions_drunk_face_off;
                private Integer herobrine_iron_armor_gifted_december;
                private Integer herobrine_meters_walked_speed;
                private Integer herobrine_a_activations_face_off;
                private Integer herobrine_a_kills_melee_face_off;
                private Integer herobrine_a_total_kills_face_off;
                private Integer herobrine_meters_walked;
                private Integer blocks_placed_preparation_face_off;
                private Integer herobrine_total_final_kills;
                private Integer kills_melee;
                private Integer total_kills_face_off;
                private Integer herobrine_treasures_found;
                private Integer defender_kills;
                private Integer herobrine_damage_dealt;
                private Integer iron_armor_gifted;
                private Integer herobrine_time_played;
                private Integer herobrine_blocks_broken_face_off;
                private Integer meters_walked;
                private Integer herobrine_steaks_eaten_face_off;
                private Integer kills_melee_behind;
                private Integer iron_armor_gifted_december_face_off;
                private Integer potions_drunk;
                private Integer blocks_broken;
                private Integer iron_armor_gifted_face_off;
                private Integer herobrine_a_defender_assists_face_off;
                private Integer activations;
                private Integer blocks_placed;
                private Integer kills;
                private Integer herobrine_a_activations_deathmatch;
                private Integer meters_walked_speed;
                private Integer meters_walked_face_off;
                private Integer iron_ore_broken;
                private Integer steaks_eaten;
                private Integer herobrine_a_damage_dealt_face_off;
                private Integer herobrine_losses;
                private Integer herobrine_food_eaten_face_off;
                private Integer herobrine_meters_fallen;
                private Integer herobrine_activations_deathmatch_face_off;
                private Integer herobrine_blocks_placed_preparation_face_off;
                private Integer defender_assists;
                private Integer herobrine_games_played_face_off;
                private Integer meters_fallen;
                private Integer iron_ore_broken_face_off;
                private Integer herobrine_activations_deathmatch;
                private Integer herobrine_iron_armor_gifted_face_off;
                private Integer herobrine_a_kills_melee;
                private Integer activations_deathmatch;
                private Integer herobrine_iron_armor_gifted;
                private Integer total_deaths_face_off;
                private Integer herobrine_final_assists_face_off;
                private Integer herobrine_steaks_eaten;
                private Integer herobrine_a_activations;
                private Integer herobrine_total_deaths_face_off;
                private Integer potions_drunk_face_off;
                private Integer final_assists_face_off;
                private Integer herobrine_total_kills;
                private Integer herobrine_activations_face_off;
                private Integer herobrine_final_deaths_face_off;
                private Integer herobrine_total_final_kills_standard;
                private Integer herobrine_meters_walked_standard;
                private Integer herobrine_wins;
                private Integer wins;
                private Integer deaths_standard;
                private Integer total_deaths_standard;
                private Integer meters_walked_standard;
                private Integer herobrine_wins_standard;
                private Integer games_played_standard;
                private Integer herobrine_games_played_standard;
                private Integer wins_standard;
                private Integer herobrine_total_deaths_standard;
                private Integer herobrine_deaths_standard;
                private Integer herobrine_treasures_found_standard;
                private Integer herobrine_iron_ore_broken_standard;
                private Integer iron_ore_broken_standard;
                private Integer treasures_found_standard;
                private Integer blocks_broken_standard;
                private Integer herobrine_wood_chopped_standard;
                private Integer herobrine_blocks_broken_standard;
                private Integer herobrine_meters_fallen_standard;
                private Integer herobrine_blocks_placed_preparation_standard;
                private Integer losses_standard;
                private Integer meters_fallen_standard;
                private Integer wood_chopped;
                private Integer wood_chopped_standard;
                private Integer herobrine_losses_standard;
                private Integer blocks_placed_standard;
                private Integer blocks_placed_preparation_standard;
                private Integer herobrine_time_played_standard;
                private Integer herobrine_blocks_placed_standard;
                private Integer time_played_standard;
                private Integer herobrine_wood_chopped;
                private HerobrineInventoryBean herobrineInventory;
                private Integer herobrine_defender_assists_standard;
                private Integer herobrine_a_activations_standard;
                private Integer potions_drunk_standard;
                private Integer damage_dealt_standard;
                private Integer meters_walked_speed_standard;
                private Integer herobrine_potions_drunk_standard;
                private Integer defender_assists_standard;
                private Integer herobrine_arrows_fired;
                private Integer final_deaths_standard;
                private Integer herobrine_arrows_hit;
                private Integer herobrine_activations_standard;
                private Integer herobrine_final_deaths_standard;
                private Integer activations_standard;
                private Integer herobrine_meters_walked_speed_standard;
                private Integer herobrine_arrows_fired_standard;
                private Integer arrows_fired_standard;
                private Integer assists_standard;
                private Integer herobrine_damage_dealt_standard;
                private Integer herobrine_arrows_hit_standard;
                private Integer arrows_fired;
                private Integer herobrine_total_kills_standard;
                private Integer arrows_hit_standard;
                private Integer herobrine_a_damage_dealt_standard;
                private Integer herobrine_assists_standard;
                private Integer arrows_hit;
                private Integer total_kills_standard;
                private Integer herobrine_kills_melee_behind_standard;
                private Integer herobrine_kills_standard;
                private Integer defender_kills_standard;
                private Integer kills_melee_standard;
                private Integer kills_standard;
                private Integer herobrine_defender_kills_standard;
                private Integer herobrine_kills_melee_standard;
                private Integer kills_melee_behind_standard;
                private Integer apples_eaten;
                private Integer arrows_hit_face_off;
                private Integer herobrine_bread_eaten;
                private Integer herobrine_arrows_hit_face_off;
                private Integer herobrine_fish_eaten;
                private Integer wins_face_off;
                private Integer apples_eaten_face_off;
                private Integer wood_chopped_face_off;
                private Integer herobrine_apples_eaten_face_off;
                private Integer herobrine_wood_chopped_face_off;
                private Integer herobrine_fish_eaten_face_off;
                private Integer herobrine_bread_eaten_face_off;
                private Integer herobrine_arrows_fired_face_off;
                private Integer herobrine_bread_crafted;
                private Integer bread_crafted;
                private Integer herobrine_wins_face_off;
                private Integer bread_eaten;
                private Integer arrows_fired_face_off;
                private Integer herobrine_apples_eaten;
                private Integer fish_eaten_face_off;
                private Integer bread_eaten_face_off;
                private Integer fish_eaten;
                private Integer bread_crafted_face_off;
                private Integer herobrine_bread_crafted_face_off;
                private ClassesBean classes;

                
                
                public static class HerobrineInventoryBean {
                    @SerializedName("0")
                    private String _$0;
                    @SerializedName("1")
                    private String _$1;
                    @SerializedName("2")
                    private String _$2;
                    @SerializedName("5")
                    private String _$5;
                    @SerializedName("6")
                    private String _$6;
                    @SerializedName("7")
                    private String _$7;
                    @SerializedName("8")
                    private String _$8;
                }

                
                
                public static class ClassesBean {
                    private HerobrineBean herobrine;
                    private ZombieBean zombie;
                    private SkeletonBean skeleton;
                    private EndermanBean enderman;

                    
                    
                    public static class HerobrineBean {
                        private Boolean skill_level_dChecked5;
                        private Integer skill_level_d;
                        private Boolean checked4;
                        private Boolean unlocked;
                    }

                    
                    
                    public static class ZombieBean {
                        private Boolean skill_level_dChecked5;
                        private Integer skill_level_d;
                        private Boolean unlocked;
                        private Boolean checked4;
                        private Boolean skill_level_aChecked5;
                        private Integer skill_level_a;
                    }

                    
                    
                    public static class SkeletonBean {
                        private Integer skill_level_d;
                        private Boolean skill_level_dChecked5;
                        private Boolean checked4;
                        private Boolean unlocked;
                        private Integer skill_level_a;
                        private Boolean skill_level_aChecked5;
                    }

                    
                    
                    public static class EndermanBean {
                        private Boolean skill_level_dChecked5;
                        private Integer skill_level_d;
                        private Boolean checked4;
                        private Boolean unlocked;
                        private Boolean skill_level_aChecked5;
                        private Integer skill_level_a;
                    }
                }
            }

            
            
            public static class TNTGamesBean {
                private Integer deaths_bowspleef;
                private Integer coins;
                private Integer tags_bowspleef;
                private Integer kills_tntag;
                private Integer record_pvprun;
                private String capture_class;
                private Integer deaths_capture;
                private Integer record_tntrun;
                private Integer wins_pvprun;
                private Integer kills_capture;
                private Integer assists_capture;
                private Integer wins_capture;
                private Integer new_spleef_double_jumps;
                private Integer new_bloodwizard_regen;
                private Integer new_kineticwizard_regen;
                private Integer new_bloodwizard_explode;
                private Integer new_witherwizard_regen;
                private Integer new_tntag_speedy;
                private Integer new_icewizard_explode;
                private List<String> packages;
                private Integer new_tntrun_double_jumps;
                private Integer new_spleef_tripleshot;
                private Integer new_kineticwizard_explode;
                private Integer new_pvprun_double_jumps;
                private Integer new_witherwizard_explode;
                private Integer new_icewizard_regen;
                private Integer new_spleef_repulsor;
                private Integer new_firewizard_regen;
                private Integer new_firewizard_explode;
                private Integer winstreak;
                private Integer run_potions_splashed_on_players;
                private Integer deaths_pvprun;
                private String wizards_selected_class;
                private Integer new_toxicwizard_regen;
                private Integer new_toxicwizard_explode;
                private Integer new_toxicwizard_deaths;
                private Integer new_firewizard_deaths;
                private Integer new_icewizard_deaths;
                private Integer new_bloodwizard_deaths;
                private Integer new_toxicwizard_assists;
                private Integer new_witherwizard_deaths;
                private Integer new_kineticwizard_deaths;
                private Integer tag_blastprotection;
                private Integer deaths_tntrun;
                private Integer tag_speeditup;
                private Integer tag_slowitdown;
                private Integer wins;
                private FlagsBean flags;
                private Integer points_capture;
                private Integer kinetic_healing_capture;
                private Integer air_time_capture;
                private Integer new_spleef_arrowrain;
                private Integer deaths_tntag;
                private Integer wins_tntag;
                private String new_active_particle_effect;
                private String new_active_death_effect;

                
                
                public static class FlagsBean {
                    private Boolean show_tip_holograms;
                    private Boolean show_tntrun_actionbar_info;
                    private Boolean show_tnttag_actionbar_info;
                    private Boolean show_wizards_actionbar_info;
                    private Boolean show_wizards_cooldown_notifications;
                    private Boolean enable_explosive_dash;
                }
            }

            
            
            public static class TrueCombatBean {
                private List<String> packages;
                private Integer kills_weekly_b;
                private Integer items_enchanted;
                private Integer arrows_shot;
                private Integer coins;
                private Integer kills;
                private Integer crazywalls_kills_weekly_b_team;
                private Integer survived_players;
                private Integer skulls_gathered;
                private Integer crazywalls_kills_monthly_b_team;
                private Integer crazywalls_kills_team;
                private Integer arrows_hit;
                private Integer golden_skulls;
                private Integer kills_monthly_b;
                private Integer giant_zombie;
                private Integer team_blazing_arrow;
                private Integer solo_swiftness;
                private String activeKit_Team;
                private String activeKit_Solo;
                private Integer win_streak;
                private Integer kills_weekly_a;
                private Integer crazywalls_kills_monthly_a_team_chaos;
                private Integer crazywalls_games_team_chaos;
                private Integer losses;
                private Integer crazywalls_losses_team_chaos;
                private Integer games;
                private Integer crazywalls_deaths_team_chaos;
                private Integer deaths;
                private Integer crazywalls_kills_team_chaos;
                private Integer crazywalls_kills_weekly_a_team_chaos;
                private Integer kills_monthly_a;
                private Integer crazywalls_losses_solo_chaos;
                private Integer crazywalls_games_solo_chaos;
                private Integer crazywalls_deaths_solo_chaos;
                private Integer crazywalls_kills_solo_chaos;
                private Integer crazywalls_kills_monthly_a_solo_chaos;
                private Integer crazywalls_kills_weekly_a_solo_chaos;
                private Integer giant_zombie_rares;
                private Integer solo_speed_mining;
                private Integer crazywalls_kills_weekly_b_team_chaos;
                private Integer solo_chaos_knowledge;
                private Integer crazywalls_losses_solo;
                private Integer crazywalls_deaths_solo;
                private Integer crazywalls_games_solo;
                private Integer solo_chaos_super_luck;
                private Integer team_rusher;
                private Integer crazywalls_kills_monthly_b_team_chaos;
                private Integer gold_dust;
                private Integer crazywalls_kills_monthly_b_solo_chaos;
                private Integer crazywalls_wins_solo_chaos;
                private Integer wins;
            }

            
            
            public static class SuperSmashBean {
                private Integer lastLevel_THE_BULK;
                private String active_class;
                private Integer win_streak;
                private ClassStatsBean class_stats;
                private Integer damage_dealt;
                private Integer coins;
                private Integer losses_weekly_b;
                private Integer losses;
                private Integer quits;
                private Integer games_monthly_a;
                private Integer deaths_normal;
                private Integer kills_monthly_a;
                private Integer games_normal;
                private Integer kills;
                private Integer losses_normal;
                private Integer kills_normal;
                private Integer losses_monthly_a;
                private Integer games_weekly_b;
                private Integer deaths;
                private Integer damage_dealt_normal;
                private Integer games;
                private Integer kills_weekly_b;
                private Integer lastLevel_BOTMUN;
                private Integer losses_weekly_a;
                private Integer games_weekly_a;
                private Integer smashed_normal;
                private Integer smashed;
                private Integer kills_weekly_a;
                private Integer smasher;
                private Integer smasher_normal;
                private Integer wins_normal;
                private Integer wins;
                private Integer wins_weekly_a;
                private Integer wins_monthly_a;
                private Integer xp_THE_BULK;
                private Integer smashLevel;
                private Integer smash_level_total;
                private Integer deaths_2v2;
                private Integer losses_2v2;
                private Integer games_2v2;
                private Integer damage_dealt_2v2;
                private Integer lastLevel_GENERAL_CLUCK;
                private Integer damage_dealt_teams;
                private Integer losses_teams;
                private Integer smashed_teams;
                private Integer deaths_teams;
                private Integer games_teams;
                private Integer smasher_2v2;
                private Integer losses_monthly_b;
                private Integer kills_2v2;
                private Integer kills_monthly_b;
                private Integer games_monthly_b;
                private Integer xp_GENERAL_CLUCK;
                private Integer smashed_2v2;
                private Integer wins_monthly_b;
                private Integer wins_2v2;
                private Integer kills_teams;
                private Integer smasher_teams;
                private Integer xp_BOTMUN;
                private Integer wins_weekly_b;
                private Integer wins_teams;
                private Integer xp_CAKE_MONSTER;
                private Integer lastLevel_CAKE_MONSTER;
                private ClassesBean classes;
                private Integer xp_MARAUDER;
                private Integer lastLevel_MARAUDER;
                private Integer xp_GOKU;
                private Integer lastLevel_GOKU;

                
                
                public static class ClassStatsBean {
                    @SerializedName("BOTMUN")
                    private BOTMUNBean bOTMUN;
                    @SerializedName("THE_BULK")
                    private THEBULKBean tHE_BULK;
                    @SerializedName("GENERAL_CLUCK")
                    private GENERALCLUCKBean gENERAL_CLUCK;
                    @SerializedName("CAKE_MONSTER")
                    private CAKEMONSTERBean cAKE_MONSTER;
                    @SerializedName("MARAUDER")
                    private MARAUDERBean mARAUDER;
                    @SerializedName("GOKU")
                    private GOKUBean gOKU;

                    
                    
                    public static class BOTMUNBean {
                        private BatarangBean batarang;
                        private Integer deaths;
                        private Integer games_normal;
                        private Integer games;
                        private Integer kills;
                        private Integer damage_dealt_normal;
                        private MeleeBean melee;
                        private Integer kills_normal;
                        private Integer damage_dealt;
                        private Integer deaths_normal;
                        private Integer losses;
                        private Integer losses_normal;
                        private Integer smashed_normal;
                        private LaserCannonBean laser_cannon;
                        private BotmubileBean botmubile;
                        private GrapplingHookBean grappling_hook;
                        private Integer smashed;
                        private Integer smasher;
                        private Integer smasher_normal;

                        
                        
                        public static class BatarangBean {
                            private Integer kills;
                            private Integer damage_dealt_normal;
                            private Integer damage_dealt;
                            private Integer kills_normal;
                        }

                        
                        
                        public static class MeleeBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_normal;
                        }

                        
                        
                        public static class LaserCannonBean {
                            private Integer smashed_normal;
                            private Integer smashed;
                        }

                        
                        
                        public static class BotmubileBean {
                            private Integer damage_dealt_normal;
                            private Integer damage_dealt;
                        }

                        
                        
                        public static class GrapplingHookBean {
                            private Integer damage_dealt_normal;
                            private Integer damage_dealt;
                            private Integer smasher_normal;
                            private Integer kills;
                            private Integer kills_normal;
                            private Integer smasher;
                        }
                    }

                    
                    
                    public static class THEBULKBean {
                        private BoulderBean boulder;
                        private Integer kills;
                        private BotmubileBean botmubile;
                        private MonsterChargeBean monster_charge;
                        private Integer smashed;
                        private MeleeBean melee;
                        private Integer games;
                        private Integer smashed_normal;
                        private Integer deaths_normal;
                        private Integer losses_normal;
                        private Integer damage_dealt;
                        private Integer kills_normal;
                        private Integer losses;
                        private Integer deaths;
                        private Integer games_normal;
                        private Integer damage_dealt_normal;
                        private Integer smasher;
                        private Integer win_streak;
                        private Integer wins;
                        private Integer smasher_normal;
                        private Integer win_streak_normal;
                        private Integer wins_normal;
                        private Integer games_2v2;
                        private Integer damage_dealt_2v2;
                        private Integer deaths_2v2;
                        private Integer losses_2v2;
                        private SeismicSlamBean seismic_slam;
                        private LaserCannonBean laser_cannon;
                        private Integer smashed_2v2;
                        private ForceLightningBean force_lightning;
                        private MonsterMashBean monster_mash;

                        
                        
                        public static class BoulderBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_normal;
                            private Integer damage_dealt_2v2;
                            private Integer kills;
                            private Integer kills_normal;
                        }

                        
                        
                        public static class BotmubileBean {
                            private Integer smashed_normal;
                            private Integer smashed;
                        }

                        
                        
                        public static class MonsterChargeBean {
                            private Integer kills_normal;
                            private Integer damage_dealt;
                            private Integer kills;
                            private Integer damage_dealt_normal;
                            private Integer smasher_normal;
                            private Integer smasher;
                            private Integer damage_dealt_2v2;
                        }

                        
                        
                        public static class MeleeBean {
                            private Integer damage_dealt_normal;
                            private Integer smashed;
                            private Integer smashed_normal;
                            private Integer damage_dealt;
                            private Integer kills_normal;
                            private Integer kills;
                            private Integer damage_dealt_2v2;
                        }

                        
                        
                        public static class SeismicSlamBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_2v2;
                            private Integer damage_dealt_normal;
                        }

                        
                        
                        public static class LaserCannonBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class ForceLightningBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class MonsterMashBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_normal;
                            private Integer kills_normal;
                            private Integer kills;
                        }
                    }

                    
                    
                    public static class GENERALCLUCKBean {
                        private BazookaBean bazooka;
                        private EggBazookaBean egg_bazooka;
                        private Integer damage_dealt_teams;
                        private ReinforcementsBean reinforcements;
                        private Integer games;
                        private Integer deaths;
                        private Integer smashed;
                        private Integer losses;
                        private Integer smashed_teams;
                        private Integer deaths_teams;
                        private Integer games_teams;
                        private MeleeBean melee;
                        private Integer losses_teams;
                        private Integer damage_dealt;
                        private Integer damage_dealt_2v2;
                        private Integer deaths_2v2;
                        private Integer losses_2v2;
                        private Integer games_2v2;
                        private Integer smasher_2v2;
                        private Integer smasher;
                        private Integer kills_2v2;
                        private Integer kills;
                        private Integer deaths_normal;
                        private Integer games_normal;
                        private Integer damage_dealt_normal;
                        private Integer losses_normal;
                        private Integer smasher_normal;
                        private Integer kills_normal;
                        private Integer smashed_normal;
                        private Integer win_streak_normal;
                        private Integer wins;
                        private Integer win_streak;
                        private Integer wins_normal;
                        private BatarangBean batarang;
                        private SwingPinBean swing_pin;
                        private Integer wins_2v2;
                        private Integer win_streak_2v2;
                        private ForceLightningBean force_lightning;
                        private Integer smashed_2v2;
                        private KameBeamBean kame_beam;
                        private SpooderBuddiesBean spooder_buddies;
                        private Integer smasher_teams;
                        private Integer kills_teams;
                        private MonsterChargeBean monster_charge;
                        private BotmubileBean botmubile;
                        private Integer win_streak_teams;
                        private Integer wins_teams;
                        private LaserCannonBean laser_cannon;
                        private CakeStormBean cake_storm;
                        private DesertEagleBean desert_eagle;
                        private WebShotBean web_shot;

                        
                        
                        public static class BazookaBean {
                            private Integer damage_dealt_teams;
                            private Integer damage_dealt;
                            private Integer damage_dealt_2v2;
                            private Integer kills;
                            private Integer kills_2v2;
                            private Integer smasher_2v2;
                            private Integer smasher;
                            private Integer damage_dealt_normal;
                            private Integer smasher_normal;
                            private Integer kills_normal;
                            private Integer smashed;
                            private Integer smashed_normal;
                            private Integer smasher_teams;
                            private Integer kills_teams;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class EggBazookaBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_teams;
                            private Integer damage_dealt_2v2;
                            private Integer damage_dealt_normal;
                            private Integer kills_normal;
                            private Integer kills;
                            private Integer kills_2v2;
                            private Integer smasher_2v2;
                            private Integer smasher;
                            private Integer smasher_normal;
                        }

                        
                        
                        public static class ReinforcementsBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_teams;
                            private Integer smashed_teams;
                            private Integer smashed;
                            private Integer smasher;
                            private Integer smasher_2v2;
                            private Integer kills;
                            private Integer damage_dealt_2v2;
                            private Integer kills_2v2;
                            private Integer damage_dealt_normal;
                            private Integer kills_normal;
                            private Integer smasher_normal;
                            private Integer kills_teams;
                            private Integer smashed_2v2;
                            private Integer smasher_teams;
                        }

                        
                        
                        public static class MeleeBean {
                            private Integer damage_dealt_teams;
                            private Integer damage_dealt;
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer damage_dealt_2v2;
                        }

                        
                        
                        public static class BatarangBean {
                            private Integer smashed;
                            private Integer smashed_normal;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class SwingPinBean {
                            private Integer smashed_normal;
                            private Integer smashed;
                            private Integer smashed_teams;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class ForceLightningBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class KameBeamBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class SpooderBuddiesBean {
                            private Integer smashed;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class MonsterChargeBean {
                            private Integer smashed;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class BotmubileBean {
                            private Integer smashed_normal;
                            private Integer smashed;
                            private Integer smashed_teams;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class LaserCannonBean {
                            private Integer smashed_teams;
                            private Integer smashed;
                        }

                        
                        
                        public static class CakeStormBean {
                            private Integer smashed;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class DesertEagleBean {
                            private Integer smashed_normal;
                            private Integer smashed;
                        }

                        
                        
                        public static class WebShotBean {
                            private Integer smashed;
                            private Integer smashed_normal;
                        }
                    }

                    
                    
                    public static class CAKEMONSTERBean {
                        private Integer win_streak;
                        private Integer damage_dealt;
                        private MeleeBean melee;
                        private Integer kills;
                        private Integer games;
                        private Integer wins;
                        private Integer damage_dealt_2v2;
                        private Integer games_2v2;
                        private Integer kills_2v2;
                        private Integer win_streak_2v2;
                        private Integer wins_2v2;
                        private Integer smasher_2v2;
                        private DefecakeBean defecake;
                        private VoidSlashBean void_slash;
                        private Integer smashed;
                        private ThrowCakeBean throw_cake;
                        private Integer losses_2v2;
                        private CakeStormBean cake_storm;
                        private Integer smasher;
                        private Integer deaths_2v2;
                        private Integer deaths;
                        private Integer smashed_2v2;
                        private BazookaBean bazooka;
                        private Integer losses;

                        
                        
                        public static class MeleeBean {
                            private Integer damage_dealt_2v2;
                            private Integer kills;
                            private Integer kills_2v2;
                            private Integer damage_dealt;
                        }

                        
                        
                        public static class DefecakeBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_2v2;
                        }

                        
                        
                        public static class VoidSlashBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class ThrowCakeBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_2v2;
                        }

                        
                        
                        public static class CakeStormBean {
                            private Integer smasher_2v2;
                            private Integer kills_2v2;
                            private Integer kills;
                            private Integer damage_dealt;
                            private Integer smasher;
                            private Integer damage_dealt_2v2;
                        }

                        
                        
                        public static class BazookaBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }
                    }

                    
                    
                    public static class MARAUDERBean {
                        private MeleeBean melee;
                        private Integer smashed;
                        private Integer smasher;
                        private Integer damage_dealt;
                        private BatarangBean batarang;
                        private ForcePullBean force_pull;
                        private ForceLightningBean force_lightning;
                        private Integer smasher_2v2;
                        private Integer deaths_2v2;
                        private Integer games;
                        private Integer kills_2v2;
                        private MonsterMashBean monster_mash;
                        private Integer wins_2v2;
                        private Integer games_2v2;
                        private Integer win_streak_2v2;
                        private Integer smashed_2v2;
                        private Integer wins;
                        private Integer damage_dealt_2v2;
                        private Integer kills;
                        private Integer deaths;
                        private Integer win_streak;
                        private LaserCannonBean laser_cannon;
                        private HomingMissilesBean homing_missiles;
                        private Integer losses;
                        private Integer losses_2v2;
                        private KiBlastBean ki_blast;
                        private MonsterChargeBean monster_charge;
                        private BoulderBean boulder;
                        private Integer deaths_normal;
                        private Integer wins_normal;
                        private Integer games_normal;
                        private Integer smasher_normal;
                        private Integer damage_dealt_normal;
                        private Integer win_streak_normal;
                        private Integer kills_normal;
                        private Integer smashed_normal;
                        private Integer losses_normal;
                        private FlamingDesertEagleBean flaming_desert_eagle;
                        private OverloadBean overload;
                        private ChargedBeamBean charged_beam;
                        private KameBeamBean kame_beam;
                        private ReinforcementsBean reinforcements;
                        private BazookaBean bazooka;
                        private Integer kills_teams;
                        private Integer deaths_teams;
                        private Integer damage_dealt_teams;
                        private Integer games_teams;
                        private Integer losses_teams;
                        private CakeStormBean cake_storm;
                        private ThrowCakeBean throw_cake;
                        private FrostboltBean frostbolt;
                        private Integer wins_teams;
                        private Integer win_streak_teams;
                        private Integer smashed_teams;
                        private Integer smasher_teams;
                        private BotmubileBean botmubile;
                        private WebShotBean web_shot;
                        private SwingPinBean swing_pin;
                        private DefecakeBean defecake;
                        private VoidSlashBean void_slash;
                        private DesertEagleBean desert_eagle;
                        private SpiderKickBean spider_kick;

                        
                        
                        public static class MeleeBean {
                            private Integer smasher;
                            private Integer kills_2v2;
                            private Integer kills;
                            private Integer damage_dealt_2v2;
                            private Integer damage_dealt;
                            private Integer smasher_2v2;
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer kills_normal;
                            private Integer damage_dealt_normal;
                            private Integer smasher_normal;
                            private Integer smashed_normal;
                            private Integer damage_dealt_teams;
                            private Integer kills_teams;
                            private Integer smasher_teams;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class BatarangBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer smashed_normal;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class ForcePullBean {
                            private Integer damage_dealt;
                            private Integer damage_dealt_2v2;
                            private Integer kills;
                            private Integer smasher;
                            private Integer kills_2v2;
                            private Integer smasher_2v2;
                            private Integer damage_dealt_normal;
                            private Integer kills_normal;
                            private Integer smasher_normal;
                            private Integer damage_dealt_teams;
                            private Integer kills_teams;
                            private Integer smasher_teams;
                        }

                        
                        
                        public static class ForceLightningBean {
                            private Integer damage_dealt_2v2;
                            private Integer damage_dealt;
                            private Integer kills;
                            private Integer kills_2v2;
                            private Integer smasher;
                            private Integer smasher_2v2;
                            private Integer kills_normal;
                            private Integer damage_dealt_normal;
                            private Integer smashed;
                            private Integer smashed_normal;
                            private Integer smasher_normal;
                            private Integer smashed_2v2;
                            private Integer damage_dealt_teams;
                            private Integer kills_teams;
                            private Integer smasher_teams;
                        }

                        
                        
                        public static class MonsterMashBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class LaserCannonBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_teams;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class HomingMissilesBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_normal;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class KiBlastBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer smashed_teams;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class MonsterChargeBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_teams;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class BoulderBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_normal;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class FlamingDesertEagleBean {
                            private Integer smashed;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class OverloadBean {
                            private Integer smashed;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class ChargedBeamBean {
                            private Integer smashed_normal;
                            private Integer smashed;
                            private Integer smashed_teams;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class KameBeamBean {
                            private Integer smashed;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class ReinforcementsBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer smashed_teams;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class BazookaBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class CakeStormBean {
                            private Integer smashed;
                            private Integer smashed_normal;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class ThrowCakeBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class FrostboltBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class BotmubileBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class WebShotBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class SwingPinBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class DefecakeBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class VoidSlashBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class DesertEagleBean {
                            private Integer smashed_teams;
                            private Integer smashed;
                        }

                        
                        
                        public static class SpiderKickBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }
                    }

                    
                    
                    public static class GOKUBean {
                        private Integer smasher;
                        private MeleeBean melee;
                        private Integer deaths_2v2;
                        private KiBlastBean ki_blast;
                        private Integer smashed_2v2;
                        private Integer kills;
                        private KameBeamBean kame_beam;
                        private Integer deaths;
                        private HomingMissilesBean homing_missiles;
                        private BatarangBean batarang;
                        private Integer damage_dealt;
                        private Integer kills_2v2;
                        private Integer losses_2v2;
                        private Integer games;
                        private Integer games_2v2;
                        private Integer losses;
                        private Integer damage_dealt_2v2;
                        private Integer smasher_2v2;
                        private Integer smashed;
                        private LaserCannonBean laser_cannon;
                        private Integer wins;
                        private Integer win_streak_2v2;
                        private Integer win_streak;
                        private Integer wins_2v2;
                        private BoulderBean boulder;
                        private ForceLightningBean force_lightning;
                        private EggBazookaBean egg_bazooka;
                        private TelepunchBean telepunch;
                        private ReinforcementsBean reinforcements;
                        private Integer deaths_teams;
                        private Integer games_teams;
                        private Integer smasher_teams;
                        private Integer damage_dealt_teams;
                        private Integer losses_teams;
                        private Integer smashed_teams;
                        private Integer kills_teams;
                        private MonsterChargeBean monster_charge;
                        private BotmubileBean botmubile;
                        private FrostboltBean frostbolt;
                        private Integer losses_normal;
                        private Integer smasher_normal;
                        private Integer games_normal;
                        private Integer damage_dealt_normal;
                        private Integer kills_normal;
                        private Integer deaths_normal;
                        private Integer smashed_normal;
                        private SeismicSlamBean seismic_slam;
                        private BazookaBean bazooka;
                        private ThrowCakeBean throw_cake;
                        private CakeStormBean cake_storm;
                        private DesertEagleBean desert_eagle;
                        private VoidSlashBean void_slash;
                        private SwingPinBean swing_pin;

                        
                        
                        public static class MeleeBean {
                            private Integer kills_2v2;
                            private Integer damage_dealt;
                            private Integer damage_dealt_2v2;
                            private Integer smasher;
                            private Integer smasher_2v2;
                            private Integer kills;
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer smasher_teams;
                            private Integer damage_dealt_teams;
                            private Integer kills_teams;
                            private Integer smashed_teams;
                            private Integer smashed_normal;
                            private Integer damage_dealt_normal;
                        }

                        
                        
                        public static class KiBlastBean {
                            private Integer kills;
                            private Integer damage_dealt_2v2;
                            private Integer damage_dealt;
                            private Integer kills_2v2;
                            private Integer smasher_2v2;
                            private Integer smasher;
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer damage_dealt_teams;
                            private Integer smasher_teams;
                            private Integer kills_teams;
                            private Integer smasher_normal;
                            private Integer kills_normal;
                            private Integer damage_dealt_normal;
                        }

                        
                        
                        public static class KameBeamBean {
                            private Integer kills;
                            private Integer damage_dealt;
                            private Integer damage_dealt_2v2;
                            private Integer smasher_2v2;
                            private Integer smasher;
                            private Integer kills_2v2;
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer damage_dealt_teams;
                            private Integer damage_dealt_normal;
                        }

                        
                        
                        public static class HomingMissilesBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class BatarangBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class LaserCannonBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class BoulderBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class ForceLightningBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class EggBazookaBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class TelepunchBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class ReinforcementsBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                            private Integer smashed_teams;
                            private Integer smashed_normal;
                        }

                        
                        
                        public static class MonsterChargeBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class BotmubileBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                            private Integer smashed_teams;
                        }

                        
                        
                        public static class FrostboltBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class SeismicSlamBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class BazookaBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class ThrowCakeBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class CakeStormBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class DesertEagleBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }

                        
                        
                        public static class VoidSlashBean {
                            private Integer smashed_2v2;
                            private Integer smashed;
                        }

                        
                        
                        public static class SwingPinBean {
                            private Integer smashed;
                            private Integer smashed_2v2;
                        }
                    }
                }

                
                
                public static class ClassesBean {
                    @SerializedName("MARAUDER")
                    private Boolean mARAUDER;
                    @SerializedName("GOKU")
                    private Boolean gOKU;
                }
            }

            
            
            public static class UHCBean {
                private Integer coins;
                private Boolean cache3;
                private String equippedKit;
                private Integer kit_WORKING_TOOLS;
                private List<String> packages;
                private Integer deaths;
                private Boolean clearup_achievement;
                private Boolean saved_stats;
            }

            
            
            public static class SpeedUHCBean {
                private Integer firstJoinLobbyInt;
                private List<String> packages;
                private Integer tearWellUses;
                private Integer tears;
                private Integer found_RARE;
                private String activeKit_NORMAL;
                private Integer highestKillstreak;
                private Integer killstreak;
                private Integer win_streak;
                private Integer deaths_kit_basic_normal_archaeologist;
                private Integer survived_players_normal;
                private Integer coins;
                private Integer losses;
                private Integer deaths_solo;
                private Integer games_solo;
                private Integer kills_monthly_a;
                private Integer games_kit_basic_normal_archaeologist;
                private Integer kills_solo_normal;
                private Integer deaths_normal;
                private Integer losses_solo_normal;
                private Integer kills_kit_basic_normal_archaeologist;
                private Integer survived_players_kit_basic_normal_archaeologist;
                private Integer survived_players_solo;
                private Integer games_normal;
                private Integer losses_kit_basic_normal_archaeologist;
                private Integer kills_mastery_wild_specialist;
                private Integer kills_weekly_b;
                private Integer deaths_solo_normal;
                private Integer deaths;
                private Integer kills;
                private Integer deaths_mastery_wild_specialist;
                private Integer tears_gathered;
                private Integer losses_mastery_wild_specialist;
                private Integer blocks_broken;
                private Integer kills_solo;
                private Integer games;
                private Integer losses_normal;
                private Integer losses_solo;
                private Integer survived_players;
                private Integer kills_normal;
                private Integer blocks_placed;
                private Integer quits;
                private Integer deaths_kit_basic_normal_default;
                private Integer items_enchanted;
                private Integer losses_kit_basic_normal_default;
                private Integer survived_players_kit_basic_normal_default;
                private Integer games_kit_basic_normal_default;
                private Integer kills_kit_basic_normal_default;
                private Integer deaths_solo_insane;
                private Integer arrows_shot;
                private Integer losses_solo_insane;
                private Integer kills_insane;
                private Integer arrows_hit;
                private Integer losses_insane;
                private Integer deaths_insane;
                private Integer deaths_kit_basic_insane_default;
                private Integer losses_kit_basic_insane_default;
                private Integer kills_solo_insane;
                private Integer survived_players_insane;
                private Integer survived_players_kit_basic_insane_default;
                private Integer kills_kit_basic_insane_default;
                private Integer deaths_team;
                private Integer losses_team;
                private Integer deaths_team_normal;
                private Integer losses_team_normal;
                private Integer survived_players_team;
                private Integer kills_team_normal;
                private Integer kills_team;
                private Integer kills_weekly_a;
                private Integer assists_kit_basic_normal_archaeologist;
                private Integer assists_normal;
                private Integer assists_team;
                private Integer assists;
                private Integer insane_no_mercy;
                private Integer found_COMMON;
                private Integer wins_normal;
                private Integer wins;
                private Integer wins_mastery_wild_specialist;
                private Integer wins_kit_basic_normal_default;
                private Integer killstreak_solo;
                private Integer winstreak_solo;
                private Integer wins_solo_normal;
                private Integer winstreak;
                private Integer killstreak_kit_basic_normal_default;
                private Integer wins_solo;
                private Integer winstreak_kit_basic_normal_default;
                private Integer winstreak_normal;
                private Integer killstreak_normal;
                private Integer highestWinstreak;
                private Integer kills_monthly_b;
                private Integer assists_solo;
                private Integer assists_kit_basic_normal_default;
                private Integer normal_no_mercy;
                private Integer survived_players_kit_basic_normal_archer;
                private Integer deaths_kit_basic_normal_archer;
                private Integer kills_kit_basic_normal_archer;
                private Integer losses_kit_basic_normal_archer;
                private Integer assists_insane;
                private Integer assists_kit_basic_insane_default;
                private Integer games_insane;
                private Integer games_kit_basic_insane_default;
                private Integer salt;
                private Integer games_team;
                private Integer losses_team_insane;
                private Integer kills_team_insane;
                private Integer deaths_team_insane;
                private Integer score;
                private Boolean movedOver;
            }

            
            
            public static class SkyClashBean {
                private Integer card_packs;
                private Integer active_class;
                private Integer killstreak;
                private Integer playstreak;
                private Integer win_streak;
                private Integer losses_solo;
                private Integer deaths_kit_guardian;
                private Integer losses;
                private Integer deaths;
                private Integer games_played_kit_guardian;
                private Integer deaths_solo;
                private Integer coins;
                private Integer games_played;
                private Integer quits;
                private Integer play_streak;
                private Integer highestKillstreak;
                private Integer void_kills;
                private Integer kills;
                private Integer most_kills_game;
                private Integer most_kills_game_kit_guardian;
                private Integer void_kills_kit_guardian;
                private Integer kills_kit_guardian;
                private Integer kills_solo;
                private Integer kills_monthly_b;
                private Integer kills_weekly_b;
                private Integer deaths_kit_swordsman;
                private Integer games_played_kit_swordsman;
                private Integer melee_kills_kit_guardian;
                private Integer melee_kills;
                private Integer assists;
                private Integer assists_kit_guardian;
                private Integer longest_bow_shot_kit_guardian;
                private Integer longest_bow_shot;
                private Integer bow_shots;
                private Integer bow_hits;
                private Integer games;
                private Integer bow_shots_kit_guardian;
                private Integer bow_hits_kit_guardian;
                private Integer fastest_win_solo;
                private Integer fastest_win_solo_kit_guardian;
                private Integer solo_wins_kit_guardian;
                private Integer wins;
                private Integer solo_wins;
                private Integer wins_solo;
                private Integer spawn_at_witch;
                private List<String> packages;
                private Integer perk_tripleshot;
                private Integer perk_iron_golem;
                private Boolean perk_tripleshot_new;
                private Integer perk_hit_and_run_duplicates;
                private Boolean perk_iron_golem_new;
                private Integer perk_blast_protection;
                private Boolean perk_chicken_bow_new;
                private Boolean perk_blast_protection_new;
                private Integer perk_hearty_start_duplicates;
                private Integer perk_chicken_bow;
                private Boolean perk_blazing_arrows_new;
                private Integer perk_sugar_rush;
                private Integer perk_void_magnet;
                private Boolean perk_void_magnet_new;
                private Integer perk_blazing_arrows;
                private Boolean perk_sugar_rush_new;
                private Integer kills_doubles;
                private Integer losses_doubles;
                private Integer deaths_doubles;
                private Integer enderchests_opened_kit_guardian;
                private Integer enderchests_opened;
                private Integer mobs_killed_kit_guardian;
                private Integer mobs_killed;
                private Integer fastest_win_doubles;
                private Integer fastest_win_doubles_kit_guardian;
                private Integer doubles_wins_kit_guardian;
                private Integer doubles_wins;
                private Integer wins_doubles;
                private Integer perk_blazing_arrows_duplicates;
                private Integer perk_blast_protection_duplicates;
                private Integer perk_void_magnet_duplicates;
                private Integer losses_team_war;
                private Integer deaths_team_war;
                private Integer assists_kit_swordsman;
                private Boolean perk_headstart_new;
                private Integer perk_sharpened_sword;
                private Boolean perk_invisibility_new;
                private Integer perk_invisibility;
                private Integer perk_headstart;
                private Boolean perk_sharpened_sword_new;
                private Integer perk_marksman_duplicates;
                private Integer perk_rampage_duplicates;
                private Boolean perk_alchemy_new;
                private Integer perk_alchemy;
                private Integer kit_swordsman_minor;
                private Integer kills_monthly_a;
                private Integer kills_weekly_a;
                private Integer enderchests_opened_kit_swordsman;
                private SwordsmanInventoryBean swordsman_inventory;
                private GuardianInventoryBean guardian_inventory;
                private Integer kills_kit_swordsman;
                private Integer void_kills_kit_swordsman;
                private Integer most_kills_game_kit_swordsman;
                private Integer longest_bow_shot_kit_swordsman;
                private Integer bow_shots_kit_swordsman;
                private Integer bow_hits_kit_swordsman;
                private Integer melee_kills_kit_swordsman;
                private Boolean perk_damage_potion_new;
                private Boolean perk_pearl_absorption_new;
                private Integer perk_sharpened_sword_duplicates;
                private Integer perk_pearl_absorption;
                private Integer perk_damage_potion;
                private String class_1;
                private Integer classes_unlocked;
                private String class_4;
                private Integer perk_creeper;
                private Boolean perk_creeper_new;
                private Integer perk_pearl_absorption_duplicates;
                private Integer mobs_killed_kit_swordsman;
                private Integer fastest_win_solo_kit_swordsman;
                private Integer solo_wins_kit_swordsman;
                private Integer perk_alchemy_duplicates;
                private Integer perk_invisibility_duplicates;
                private String class_0;
                private Boolean perk_snow_golem_new;
                private Integer perk_sugar_rush_duplicates;
                private Integer perk_snow_golem;
                private Integer kills_team_war;
                private Integer fastest_win_team_war_kit_guardian;
                private Integer fastest_win_team_war;
                private Integer team_war_wins_kit_guardian;
                private Integer team_war_wins;
                private Integer wins_team_war;
                private Boolean perk_enderman_new;
                private Integer perk_fruit_finder;
                private Integer perk_enderman;
                private Boolean perk_fruit_finder_new;
                private Integer perk_resistant_duplicates;
                private Integer fastest_win_team_war_kit_swordsman;
                private Integer team_war_wins_kit_swordsman;
                private Integer perk_rampage;
                private ArcherInventoryBean archer_inventory;
                private Integer longest_bow_shot_kit_archer;
                private Integer games_played_kit_archer;
                private Integer bow_hits_kit_archer;
                private Integer bow_shots_kit_archer;
                private Integer deaths_kit_archer;
                private Boolean perk_pacify_new;
                private Integer perk_pacify;
                private Integer perk_regeneration_duplicates;
                private Boolean perk_endless_quiver_new;
                private Integer perk_endless_quiver;
                private Integer perk_creeper_duplicates;
                private Integer perk_endless_quiver_duplicates;
                private Boolean perk_arrow_deflection_new;
                private Integer perk_arrow_deflection;
                private Integer perk_fruit_finder_duplicates;
                private Integer perk_energy_drink;
                private Boolean perk_energy_drink_new;
                private Integer perk_snow_golem_duplicates;
                private Boolean perk_supply_drop_new;
                private Integer perk_supply_drop;
                private Integer perk_damage_potion_duplicates;
                private Integer perk_skeleton_jockey;
                private Boolean perk_skeleton_jockey_new;
                private Integer perk_arrow_deflection_duplicates;
                private Integer perk_energy_drink_duplicates;
                private Integer perk_skeleton_jockey_duplicates;
                private Boolean perk_void_warranty_new;
                private Integer perk_void_warranty;
                private Integer perk_honed_bow;
                private Boolean perk_honed_bow_new;
                private Integer perk_tripleshot_duplicates;
                private Integer perk_supply_drop_duplicates;
                private Integer perk_witch;
                private Boolean perk_witch_new;
                private String class_2;
                private Integer fastest_win_doubles_kit_swordsman;
                private Integer doubles_wins_kit_swordsman;
                private Integer perk_iron_golem_duplicates;
                private Boolean perk_guardian_new;
                private Integer perk_guardian;
                private Integer perk_pacify_duplicates;
                private Integer mob_kills_kit_swordsman;
                private Integer mob_kills;
                private Integer perk_guardian_duplicates;
                private Integer perk_witch_duplicates;
                private Integer deaths_perk_guardian;
                private Integer losses_perk_fruit_finder;
                private Integer losses_perk_guardian;
                private Integer kills_perk_iron_golem;
                private Integer deaths_perk_fruit_finder;
                private Integer kills_perk_fruit_finder;
                private Integer mobs_spawned;
                private Integer deaths_perk_iron_golem;
                private Integer losses_perk_iron_golem;
                private Integer kills_perk_guardian;
                private Integer mobs_spawned_kit_swordsman;
                private Integer perk_bigger_bangs;
                private Boolean perk_bigger_bangs_new;
                private Integer wins_perk_guardian;
                private Integer wins_perk_iron_golem;
                private Integer wins_perk_fruit_finder;
                private Integer kit_treasure_hunter_minor;
                private TreasureHunterInventoryBean treasure_hunter_inventory;
                private Integer games_played_kit_treasure_hunter;
                private Integer deaths_perk_sugar_rush;
                private Integer kills_perk_sharpened_sword;
                private Integer deaths_kit_treasure_hunter;
                private Integer kills_kit_treasure_hunter;
                private Integer losses_perk_sharpened_sword;
                private Integer deaths_perk_sharpened_sword;
                private Integer kills_perk_enderman;
                private Integer losses_perk_enderman;
                private Integer deaths_perk_enderman;
                private Integer most_kills_game_kit_treasure_hunter;
                private Integer melee_kills_kit_treasure_hunter;
                private Integer kills_perk_sugar_rush;
                private Integer losses_perk_sugar_rush;
                private Integer mobs_spawned_kit_treasure_hunter;
                private Integer losses_perk_arrow_deflection;
                private Integer deaths_perk_arrow_deflection;
                private Integer kills_perk_arrow_deflection;
                private Integer longest_bow_shot_kit_treasure_hunter;
                private Integer bow_shots_kit_treasure_hunter;
                private Integer bow_hits_kit_treasure_hunter;
                private Integer void_kills_kit_treasure_hunter;
                private Integer enderchests_opened_kit_treasure_hunter;
                private Integer cute_pants_found;
                private Integer cute_pants_found_kit_treasure_hunter;
                private Integer assists_kit_treasure_hunter;
                private Integer mobs_killed_kit_treasure_hunter;
                private Integer fastest_win_solo_kit_treasure_hunter;
                private Integer solo_wins_kit_treasure_hunter;
                private Integer wins_perk_sharpened_sword;
                private Integer wins_perk_arrow_deflection;
                private Integer wins_perk_sugar_rush;
                private Boolean perk_winged_boots_new;
                private Integer perk_winged_boots;
                private Integer perk_headstart_duplicates;
                private Integer perk_honed_bow_duplicates;
                private Integer perk_chicken_bow_duplicates;
                private Integer kills_perk_winged_boots;
                private Integer deaths_perk_winged_boots;
                private Integer losses_perk_winged_boots;
                private Integer perk_uhc_challenge;
                private Boolean perk_uhc_challenge_new;
                private Boolean perk_flower_power_new;
                private Integer perk_flower_power;
                private Integer perk_flower_power_duplicates;
                private Integer perk_enderman_duplicates;
                private Integer perk_bigger_bangs_duplicates;
                private Integer perk_bat_shield;
                private Boolean perk_bat_shield_new;
                private Integer perk_void_warranty_duplicates;
                private Integer losses_perk_void_warranty;
                private Integer deaths_perk_void_warranty;
                private Integer kills_perk_void_warranty;
                private Boolean perk_mushroom_aura_new;
                private Integer perk_mushroom_aura;
                private Integer perk_mushroom_aura_duplicates;
                private Boolean perk_elven_archer_new;
                private Integer perk_elven_archer;
                private Integer perk_elven_archer_duplicates;
                private Integer perk_bat_shield_duplicates;
                private ClericInventoryBean cleric_inventory;
                private Integer losses_perk_void_magnet;
                private Integer games_played_kit_cleric;
                private Integer deaths_perk_chicken_bow;
                private Integer deaths_perk_void_magnet;
                private Integer void_kills_kit_cleric;
                private Integer losses_perk_mushroom_aura;
                private Integer losses_perk_chicken_bow;
                private Integer kills_perk_mushroom_aura;
                private Integer deaths_perk_mushroom_aura;
                private Integer kills_kit_cleric;
                private Integer melee_kills_kit_cleric;
                private Integer most_kills_game_kit_cleric;
                private Integer deaths_kit_cleric;
                private Integer kills_perk_chicken_bow;
                private Integer kills_perk_void_magnet;
                private Integer kit_cleric_minor;
                private Integer mobs_spawned_kit_cleric;
                private Integer enderchests_opened_kit_cleric;
                private Integer bow_shots_kit_cleric;
                private Integer deaths_perk_headstart;
                private Integer kills_perk_headstart;
                private Integer losses_perk_headstart;
                private Integer perk_resistant;
                private Integer longest_bow_shot_kit_cleric;
                private Integer bow_hits_kit_cleric;
                private Integer fastest_win_solo_kit_cleric;
                private Integer mobs_killed_kit_cleric;
                private Integer solo_wins_kit_cleric;
                private Integer wins_perk_void_warranty;
                private Integer assists_kit_cleric;
                private String class_3;
                private BerserkerInventoryBean berserker_inventory;
                private Integer deaths_perk_hearty_start;
                private Integer games_played_kit_berserker;
                private Integer deaths_perk_rampage;
                private Integer kills_kit_berserker;
                private Integer deaths_perk_marksman;
                private Integer void_kills_kit_berserker;
                private Integer kills_perk_hearty_start;
                private Integer losses_perk_rampage;
                private Integer kills_perk_marksman;
                private Integer most_kills_game_kit_berserker;
                private Integer melee_kills_kit_berserker;
                private Integer losses_perk_hearty_start;
                private Integer deaths_kit_berserker;
                private Integer losses_perk_marksman;
                private Integer kills_perk_rampage;
                private Integer perk_nuclear_solution;
                private Boolean perk_nuclear_solution_new;

                
                
                public static class SwordsmanInventoryBean {
                    @SerializedName("LEATHER_LEGGINGS:0")
                    private String _$LEATHER_LEGGINGS070;// FIXME check this code
                    @SerializedName("SKULL_ITEM:3")
                    private String _$SKULL_ITEM335;// FIXME check this code
                    @SerializedName("POTION:9")
                    private String _$POTION920;// FIXME check this code
                    @SerializedName("SKULL_ITEM:2")
                    private String _$SKULL_ITEM232;// FIXME check this code
                    @SerializedName("SKULL_ITEM:1")
                    private String _$SKULL_ITEM199;// FIXME check this code
                    @SerializedName("IRON_SWORD:0")
                    private String _$IRON_SWORD0192;// FIXME check this code
                    @SerializedName("LEATHER_BOOTS:0")
                    private String _$LEATHER_BOOTS0244;// FIXME check this code
                    @SerializedName("COMPASS:0")
                    private String _$COMPASS0272;// FIXME check this code
                    @SerializedName("STONE_SWORD:0")
                    private String _$STONE_SWORD0332;// FIXME check this code
                    @SerializedName("LEATHER_HELMET:0")
                    private String _$LEATHER_HELMET081;// FIXME check this code
                }

                
                
                public static class GuardianInventoryBean {
                    @SerializedName("POTION:5")
                    private String _$POTION5310;// FIXME check this code
                    @SerializedName("IRON_BOOTS:0")
                    private String _$IRON_BOOTS029;// FIXME check this code
                    @SerializedName("CHAINMAIL_CHESTPLATE:0")
                    private String _$CHAINMAIL_CHESTPLATE0254;// FIXME check this code
                    @SerializedName("SKULL_ITEM:3")
                    private String _$SKULL_ITEM384;// FIXME check this code
                    @SerializedName("SKULL_ITEM:2")
                    private String _$SKULL_ITEM2323;// FIXME check this code
                    @SerializedName("SKULL_ITEM:1")
                    private String _$SKULL_ITEM1160;// FIXME check this code
                    @SerializedName("COMPASS:0")
                    private String _$COMPASS0203;// FIXME check this code
                }

                
                
                public static class ArcherInventoryBean {
                    @SerializedName("ARROW:0")
                    private String _$ARROW0303;// FIXME check this code
                    @SerializedName("BOW:0")
                    private String _$BOW0119;// FIXME check this code
                    @SerializedName("CHAINMAIL_CHESTPLATE:0")
                    private String _$CHAINMAIL_CHESTPLATE067;// FIXME check this code
                    @SerializedName("SKULL_ITEM:3")
                    private String _$SKULL_ITEM396;// FIXME check this code
                    @SerializedName("SKULL_ITEM:2")
                    private String _$SKULL_ITEM2154;// FIXME check this code
                    @SerializedName("SKULL_ITEM:1")
                    private String _$SKULL_ITEM1124;// FIXME check this code
                    @SerializedName("COMPASS:0")
                    private String _$COMPASS0195;// FIXME check this code
                }

                
                
                public static class TreasureHunterInventoryBean {
                    @SerializedName("WEB:0")
                    private String _$WEB0155;// FIXME check this code
                    @SerializedName("GOLD_LEGGINGS:0")
                    private String _$GOLD_LEGGINGS0115;// FIXME check this code
                    @SerializedName("GOLD_PICKAXE:0")
                    private String _$GOLD_PICKAXE0307;// FIXME check this code
                    @SerializedName("GOLD_BOOTS:0")
                    private String _$GOLD_BOOTS0217;// FIXME check this code
                    @SerializedName("GOLD_HELMET:0")
                    private String _$GOLD_HELMET0184;// FIXME check this code
                    @SerializedName("SKULL_ITEM:3")
                    private String _$SKULL_ITEM3281;// FIXME check this code
                    @SerializedName("SKULL_ITEM:2")
                    private String _$SKULL_ITEM2290;// FIXME check this code
                    @SerializedName("SKULL_ITEM:1")
                    private String _$SKULL_ITEM1258;// FIXME check this code
                    @SerializedName("COMPASS:0")
                    private String _$COMPASS0295;// FIXME check this code
                }

                
                
                public static class ClericInventoryBean {
                    @SerializedName("LEATHER_CHESTPLATE:0")
                    private String _$LEATHER_CHESTPLATE0120;// FIXME check this code
                    @SerializedName("LEATHER_LEGGINGS:0")
                    private String _$LEATHER_LEGGINGS0211;// FIXME check this code
                    @SerializedName("GOLD_BOOTS:0")
                    private String _$GOLD_BOOTS0259;// FIXME check this code
                    @SerializedName("POTION:5")
                    private String _$POTION5244;// FIXME check this code
                    @SerializedName("GOLD_SWORD:0")
                    private String _$GOLD_SWORD0289;// FIXME check this code
                    @SerializedName("SKULL_ITEM:3")
                    private String _$SKULL_ITEM3110;// FIXME check this code
                    @SerializedName("SKULL_ITEM:2")
                    private String _$SKULL_ITEM2117;// FIXME check this code
                    @SerializedName("SKULL_ITEM:1")
                    private String _$SKULL_ITEM1315;// FIXME check this code
                    @SerializedName("COMPASS:0")
                    private String _$COMPASS0181;// FIXME check this code
                    @SerializedName("GOLDEN_APPLE:0")
                    private String _$GOLDEN_APPLE0101;// FIXME check this code
                    @SerializedName("LEATHER_HELMET:0")
                    private String _$LEATHER_HELMET09;// FIXME check this code
                }

                
                
                public static class BerserkerInventoryBean {
                    @SerializedName("COOKED_BEEF:0")
                    private String _$COOKED_BEEF021;// FIXME check this code
                    @SerializedName("POTION:1")
                    private String _$POTION1257;// FIXME check this code
                    @SerializedName("CHAINMAIL_CHESTPLATE:0")
                    private String _$CHAINMAIL_CHESTPLATE0179;// FIXME check this code
                    @SerializedName("SKULL_ITEM:3")
                    private String _$SKULL_ITEM3156;// FIXME check this code
                    @SerializedName("STONE_AXE:0")
                    private String _$STONE_AXE050;// FIXME check this code
                    @SerializedName("SKULL_ITEM:2")
                    private String _$SKULL_ITEM2261;// FIXME check this code
                    @SerializedName("SKULL_ITEM:1")
                    private String _$SKULL_ITEM146;// FIXME check this code
                    @SerializedName("COMPASS:0")
                    private String _$COMPASS0250;// FIXME check this code
                }
            }

            
            
            public static class LegacyBean {
                private Integer tokens_daily;
                private Long tokens_last_received_stamp;
                private Integer total_tokens;
                private Integer walls_tokens;
                private Integer tokens;
                private Integer next_tokens_seconds;
                private String preferredChannel;
            }

            
            
            public static class BedwarsBean {
                private Integer bedwars_boxes;
                private Boolean first_join_7;
                @SerializedName("Experience")
                private Integer experience;
                private Integer games_played_bedwars_1;
                private Integer winstreak;
                private Integer final_deaths_bedwars;
                private Integer gold_resources_collected_bedwars;
                private Integer void_deaths_bedwars;
                private Integer four_three_void_kills_bedwars;
                private Integer void_kills_bedwars;
                private Integer deaths_bedwars;
                private Integer emerald_resources_collected_bedwars;
                private Integer four_three_iron_resources_collected_bedwars;
                private Integer resources_collected_bedwars;
                private Integer four_three_games_played_bedwars;
                private Integer four_three__items_purchased_bedwars;
                private Integer games_played_bedwars;
                private Integer four_three_emerald_resources_collected_bedwars;
                private Integer four_three_void_deaths_bedwars;
                private Integer four_three_entity_attack_deaths_bedwars;
                private Integer four_three_beds_lost_bedwars;
                private Integer beds_lost_bedwars;
                private Integer kills_bedwars;
                private Integer four_three_gold_resources_collected_bedwars;
                private Integer four_three_deaths_bedwars;
                private Integer four_three_losses_bedwars;
                private Integer void_final_deaths_bedwars;
                private Integer entity_attack_deaths_bedwars;
                private Integer losses_bedwars;
                private Integer items_purchased_bedwars;
                private Integer four_three_void_final_deaths_bedwars;
                private Integer iron_resources_collected_bedwars;
                private Integer four_three_items_purchased_bedwars;
                private Integer four_three_kills_bedwars;
                private Integer four_three_final_deaths_bedwars;
                private Integer _items_purchased_bedwars;
                private Integer four_three_resources_collected_bedwars;
                private Integer eight_two_void_deaths_bedwars;
                private Integer eight_two_beds_broken_bedwars;
                private Integer diamond_resources_collected_bedwars;
                private Integer eight_two_emerald_resources_collected_bedwars;
                private Integer fall_deaths_bedwars;
                private Integer eight_two_fall_deaths_bedwars;
                private Integer eight_two_resources_collected_bedwars;
                private Integer eight_two_diamond_resources_collected_bedwars;
                private Integer eight_two_kills_bedwars;
                private Integer eight_two_entity_attack_kills_bedwars;
                private Integer eight_two_iron_resources_collected_bedwars;
                private Integer eight_two_void_kills_bedwars;
                private Integer eight_two_final_deaths_bedwars;
                private Integer eight_two_void_final_deaths_bedwars;
                private Integer entity_attack_kills_bedwars;
                private Integer eight_two_deaths_bedwars;
                private Integer eight_two__items_purchased_bedwars;
                private Integer eight_two_games_played_bedwars;
                private Integer eight_two_items_purchased_bedwars;
                private Integer eight_two_beds_lost_bedwars;
                private Integer eight_two_entity_attack_deaths_bedwars;
                private Integer eight_two_gold_resources_collected_bedwars;
                private Integer beds_broken_bedwars;
                private Integer eight_two_losses_bedwars;
                private String chest_history;
                private Integer bedwars_box_rares;
                private Integer bedwars_box_commons;
                private List<String> packages;
                private Integer bedwars_box;
                private Integer four_three_entity_attack_kills_bedwars;
                private Integer coins;
                private Integer entity_attack_final_kills_bedwars;
                private Integer four_three_entity_attack_final_kills_bedwars;
                private Integer final_kills_bedwars;
                private Integer four_three_final_kills_bedwars;
                private Integer four_three_wins_bedwars;
                @SerializedName("permanent _items_purchased_bedwars")
                private Integer _$Permanent_items_purchased_bedwars40;// FIXME check this code
                @SerializedName("four_three_permanent _items_purchased_bedwars")
                private Integer _$Four_three_permanent_items_purchased_bedwars100;// FIXME check this code
                private Integer wins_bedwars;
                private Integer four_three_diamond_resources_collected_bedwars;
                private Integer four_three_void_final_kills_bedwars;
                private Integer four_three_beds_broken_bedwars;
                private Integer void_final_kills_bedwars;
                private Integer entity_attack_final_deaths_bedwars;
                private Integer four_three_entity_attack_final_deaths_bedwars;
                private Integer four_four__items_purchased_bedwars;
                @SerializedName("four_four_permanent _items_purchased_bedwars")
                private Integer _$Four_four_permanent_items_purchased_bedwars80;// FIXME check this code
                private Integer four_four_void_kills_bedwars;
                private Integer four_four_kills_bedwars;
                private Integer four_four_deaths_bedwars;
                private Integer four_four_gold_resources_collected_bedwars;
                private Integer four_four_diamond_resources_collected_bedwars;
                private Integer four_four_entity_attack_deaths_bedwars;
                private Integer four_four_iron_resources_collected_bedwars;
                private Integer four_four_games_played_bedwars;
                private Integer four_four_wins_bedwars;
                private Integer four_four_resources_collected_bedwars;
                private Integer four_four_void_deaths_bedwars;
                private Integer four_four_items_purchased_bedwars;
                private Integer four_four_entity_attack_kills_bedwars;
                private Integer four_four_emerald_resources_collected_bedwars;
                private List<String> chest_history_new;
                private String activeKillEffect;
                private String activeProjectileTrail;
                private String activeDeathCry;
                private Boolean understands_resource_bank;
                private Integer castle_beds_lost_bedwars;
                @SerializedName("castle_permanent _items_purchased_bedwars")
                private Integer _$Castle_permanent_items_purchased_bedwars56;// FIXME check this code
                private Integer castle_deaths_bedwars;
                private Integer castle__items_purchased_bedwars;
                private Integer castle_games_played_bedwars;
                private Integer castle_wins_bedwars;
                private Integer castle_entity_attack_kills_bedwars;
                private Integer castle_items_purchased_bedwars;
                private Integer castle_diamond_resources_collected_bedwars;
                private Integer castle_gold_resources_collected_bedwars;
                private Integer castle_resources_collected_bedwars;
                private Integer castle_entity_attack_deaths_bedwars;
                private Integer castle_emerald_resources_collected_bedwars;
                private Integer castle_void_deaths_bedwars;
                private Integer castle_iron_resources_collected_bedwars;
                private Integer castle_kills_bedwars;
                private Integer castle_winstreak;
                private Integer four_three_winstreak;
                private Integer eight_two_winstreak;
                @SerializedName("eight_two_permanent _items_purchased_bedwars")
                private Integer _$Eight_two_permanent_items_purchased_bedwars316;// FIXME check this code
                private Integer eight_two_wins_bedwars;
                private Integer eight_two_entity_attack_final_kills_bedwars;
                private Integer fall_kills_bedwars;
                private Integer eight_two_fall_kills_bedwars;
                private Integer eight_two_final_kills_bedwars;
                private Integer bedwars_christmas_boxes;
                @SerializedName("Bedwars_openedChests")
                private Integer bedwars_openedChests;
                @SerializedName("Bedwars_openedCommons")
                private Integer bedwars_openedCommons;
                @SerializedName("Bedwars_openedRares")
                private Integer bedwars_openedRares;
                private String activeGlyph;
                private Boolean free_event_key_bedwars_christmas_boxes_2019;
                private Integer four_four_winstreak;
                private Integer four_four_beds_lost_bedwars;
                private Integer four_four_final_deaths_bedwars;
                private Integer four_four_losses_bedwars;
                private Integer four_four_void_final_deaths_bedwars;
                private Integer bedwars_easter_boxes;
                private String favourites_2;
                private Integer four_four_entity_attack_final_deaths_bedwars;
                private Integer four_four_final_kills_bedwars;
                private Integer four_four_void_final_kills_bedwars;
                private Integer four_four_beds_broken_bedwars;
                private Integer four_four_entity_attack_final_kills_bedwars;
                private Integer four_three_magic_final_deaths_bedwars;
                private Integer magic_final_deaths_bedwars;
                private Integer four_four_permanent_items_purchased_bedwars;
                private Integer permanent_items_purchased_bedwars;
                private Integer four_four_fall_kills_bedwars;
                private Integer four_three_fall_deaths_bedwars;
                private Integer four_three_fall_kills_bedwars;
                private Integer eight_two_entity_attack_final_deaths_bedwars;
                private Integer eight_two_void_final_kills_bedwars;
                private Integer eight_two_permanent_items_purchased_bedwars;
                private Integer bedwars_halloween_boxes;
                private String selected_challenge_type;
                private Integer two_four_winstreak;
                private Integer two_four__items_purchased_bedwars;
                private Integer two_four_deaths_bedwars;
                private Integer two_four_emerald_resources_collected_bedwars;
                private Integer two_four_entity_attack_final_kills_bedwars;
                private Integer two_four_entity_attack_kills_bedwars;
                private Integer two_four_final_kills_bedwars;
                private Integer two_four_games_played_bedwars;
                private Integer two_four_gold_resources_collected_bedwars;
                private Integer two_four_iron_resources_collected_bedwars;
                private Integer two_four_items_purchased_bedwars;
                private Integer two_four_kills_bedwars;
                private Integer two_four_resources_collected_bedwars;
                private Integer two_four_void_deaths_bedwars;
                private Integer two_four_wins_bedwars;
                private Integer magic_deaths_bedwars;
                private Integer two_four_magic_deaths_bedwars;
                private Integer two_four_diamond_resources_collected_bedwars;
                private Integer two_four_entity_attack_deaths_bedwars;
                private Integer two_four_final_deaths_bedwars;
                private Integer two_four_losses_bedwars;
                private Integer two_four_void_kills_bedwars;
                private Integer two_four_beds_broken_bedwars;
                private Integer two_four_fall_deaths_bedwars;
                private Integer two_four_permanent_items_purchased_bedwars;
                private Integer two_four_void_final_kills_bedwars;
                private Integer two_four_beds_lost_bedwars;
                private Integer two_four_entity_attack_final_deaths_bedwars;
                private Integer two_four_fall_kills_bedwars;
                private Integer magic_kills_bedwars;
                private Integer two_four_magic_kills_bedwars;
                private Integer fall_final_kills_bedwars;
                private Integer two_four_fall_final_kills_bedwars;
                @SerializedName("Bedwars_openedEpics")
                private Integer bedwars_openedEpics;
                private String activeVictoryDance;
                private String activeIslandTopper;
                private PracticeBean practice;
                private Integer magic_final_kills_bedwars;
                private Integer two_four_magic_final_kills_bedwars;
                private Integer entity_explosion_deaths_bedwars;
                private Integer two_four_entity_explosion_deaths_bedwars;
                private Integer fire_tick_deaths_bedwars;
                private Integer two_four_fire_tick_deaths_bedwars;
                private String activeSprays;
                private Integer two_four_void_final_deaths_bedwars;
                private String activeNPCSkin;
                private String activeWoodType;
                private String activeKillMessages;
                @SerializedName("Bedwars_openedLegendaries")
                private Integer bedwars_openedLegendaries;
                private Boolean free_event_key_bedwars_christmas_boxes_2021;
                private Integer four_three_permanent_items_purchased_bedwars;
                private Integer four_three_magic_final_kills_bedwars;
                private Integer eight_two_fall_final_deaths_bedwars;
                private Integer fall_final_deaths_bedwars;
                private Integer four_four_rush_winstreak;
                private Integer four_four_rush__items_purchased_bedwars;
                private Integer four_four_rush_beds_broken_bedwars;
                private Integer four_four_rush_deaths_bedwars;
                private Integer four_four_rush_diamond_resources_collected_bedwars;
                private Integer four_four_rush_emerald_resources_collected_bedwars;
                private Integer four_four_rush_entity_attack_deaths_bedwars;
                private Integer four_four_rush_entity_attack_final_kills_bedwars;
                private Integer four_four_rush_fall_kills_bedwars;
                private Integer four_four_rush_final_kills_bedwars;
                private Integer four_four_rush_games_played_bedwars;
                private Integer four_four_rush_gold_resources_collected_bedwars;
                private Integer four_four_rush_iron_resources_collected_bedwars;
                private Integer four_four_rush_items_purchased_bedwars;
                private Integer four_four_rush_kills_bedwars;
                private Integer four_four_rush_permanent_items_purchased_bedwars;
                private Integer four_four_rush_resources_collected_bedwars;
                private Integer four_four_rush_void_final_kills_bedwars;
                private Integer four_four_rush_wins_bedwars;
                private Integer four_four_rush_beds_lost_bedwars;
                private Integer four_four_rush_entity_attack_final_deaths_bedwars;
                private Integer four_four_rush_entity_attack_kills_bedwars;
                private Integer four_four_rush_final_deaths_bedwars;
                private Integer four_four_rush_losses_bedwars;
                private Integer fire_tick_final_kills_bedwars;
                private Integer two_four_fire_tick_final_kills_bedwars;
                private Integer projectile_deaths_bedwars;
                private Integer two_four_projectile_deaths_bedwars;
                private Integer two_four_magic_final_deaths_bedwars;
                private Integer two_four_fall_final_deaths_bedwars;
                private Integer suffocation_deaths_bedwars;
                private Integer two_four_suffocation_deaths_bedwars;
                private Integer eight_two_magic_final_kills_bedwars;

                
                
                public static class PracticeBean {
                    private String selected;
                    private RecordsBean records;
                    private BridgingBean bridging;
                    private FireballJumpingBean fireball_jumping;

                    
                    
                    public static class RecordsBean {
                        @SerializedName("bridging_distance_30:elevation_NONE:angle_STRAIGHT:")
                        private Integer _$Bridging_distance_30Elevation_NONEAngle_STRAIGHT94;// FIXME check this code
                    }

                    
                    
                    public static class BridgingBean {
                        private Integer blocks_placed;
                        private Integer failed_attempts;
                        private Integer successful_attempts;
                    }

                    
                    
                    public static class FireballJumpingBean {
                        private Integer successful_attempts;
                        private Integer blocks_placed;
                        private Integer failed_attempts;
                    }
                }
            }

            
            
            public static class BuildBattleBean {
                private Integer wins_solo_normal;
                private Integer wins_teams_normal;
                private Integer wins;
                private List<String> buildbattle_loadout;
                private Integer teams_most_points;
                private Integer games_played;
                private Integer score;
                private Integer coins;
                private Integer monthly_coins_a;
                private Integer weekly_coins_a;
                private Integer total_votes;
                private Integer weekly_coins_b;
                private Integer monthly_coins_b;
            }

            
            
            public static class MurderMysteryBean {
                private Integer quickest_showdown_win_time_seconds_MURDER_SHOWDOWN;
                private Integer quickest_showdown_win_time_seconds_mountain;
                private Integer quickest_showdown_win_time_seconds;
                private Integer quickest_showdown_win_time_seconds_mountain_MURDER_SHOWDOWN;
                private Integer games_mountain_MURDER_SHOWDOWN;
                private Integer wins;
                private Integer kills_mountain;
                private Integer wins_mountain;
                private Integer kills_MURDER_SHOWDOWN;
                private Integer wins_mountain_MURDER_SHOWDOWN;
                private Integer deaths_mountain_MURDER_SHOWDOWN;
                private Integer games_mountain;
                private Integer knife_kills_MURDER_SHOWDOWN;
                private Integer knife_kills;
                private Integer deaths_mountain;
                private Integer games_MURDER_SHOWDOWN;
                private Integer wins_MURDER_SHOWDOWN;
                private Integer deaths;
                private Integer coins_pickedup_mountain;
                private Integer coins_pickedup_mountain_MURDER_SHOWDOWN;
                private Integer deaths_MURDER_SHOWDOWN;
                private Integer knife_kills_mountain_MURDER_SHOWDOWN;
                private Integer kills;
                private Integer games;
                private Integer kills_mountain_MURDER_SHOWDOWN;
                private Integer coins_pickedup_MURDER_SHOWDOWN;
                private Integer coins_pickedup;
                private Integer knife_kills_mountain;
                private Integer coins_pickedup_headquarters_MURDER_SHOWDOWN;
                private Integer knife_kills_headquarters_MURDER_SHOWDOWN;
                private Integer kills_headquarters;
                private Integer games_headquarters_MURDER_SHOWDOWN;
                private Integer bow_kills_headquarters_MURDER_SHOWDOWN;
                private Integer kills_headquarters_MURDER_SHOWDOWN;
                private Integer bow_kills_MURDER_SHOWDOWN;
                private Integer wins_headquarters_MURDER_SHOWDOWN;
                private Integer deaths_headquarters_MURDER_SHOWDOWN;
                private Integer deaths_headquarters;
                private Integer knife_kills_headquarters;
                private Integer bow_kills;
                private Integer coins_pickedup_headquarters;
                private Integer wins_headquarters;
                private Integer games_headquarters;
                private Integer bow_kills_headquarters;
                private Integer longest_time_as_survivor_seconds_transport;
                private Integer total_time_survived_seconds_transport_MURDER_INFECTION;
                private Integer total_time_survived_seconds;
                private Integer longest_time_as_survivor_seconds;
                private Integer longest_time_as_survivor_seconds_transport_MURDER_INFECTION;
                private Integer longest_time_as_survivor_seconds_MURDER_INFECTION;
                private Integer total_time_survived_seconds_transport;
                private Integer total_time_survived_seconds_MURDER_INFECTION;
                private Integer games_transport_MURDER_INFECTION;
                private Integer games_transport;
                private Integer games_MURDER_INFECTION;
                private Integer coins;
                private List<String> murdermystery_books;
                private Integer detective_chance;
                private Integer murderer_chance;
                private Integer games_towerfall_MURDER_CLASSIC;
                private Integer bow_kills_towerfall;
                private Integer coins_pickedup_towerfall;
                private Integer kills_towerfall;
                private Integer wins_towerfall_MURDER_CLASSIC;
                private Integer was_hero;
                private Integer bow_kills_MURDER_CLASSIC;
                private Integer was_hero_MURDER_CLASSIC;
                private Integer kills_MURDER_CLASSIC;
                private Integer wins_MURDER_CLASSIC;
                private Integer coins_pickedup_MURDER_CLASSIC;
                private Integer games_towerfall;
                private Integer was_hero_towerfall;
                private Integer kills_towerfall_MURDER_CLASSIC;
                private Integer bow_kills_towerfall_MURDER_CLASSIC;
                private Integer games_MURDER_CLASSIC;
                private Integer wins_towerfall;
                private Integer was_hero_towerfall_MURDER_CLASSIC;
                private Integer coins_pickedup_towerfall_MURDER_CLASSIC;
                private String active_knife_skin;
                private Integer granted_chests;
                private Integer mm_chests;
                @SerializedName("wins_widow's_den_MURDER_CLASSIC")
                private Integer _$Wins_widowS_den_MURDER_CLASSIC286;// FIXME check this code
                @SerializedName("wins_widow's_den")
                private Integer _$Wins_widowS_den14;// FIXME check this code
                @SerializedName("coins_pickedup_widow's_den")
                private Integer _$Coins_pickedup_widowS_den284;// FIXME check this code
                @SerializedName("games_widow's_den_MURDER_CLASSIC")
                private Integer _$Games_widowS_den_MURDER_CLASSIC118;// FIXME check this code
                @SerializedName("coins_pickedup_widow's_den_MURDER_CLASSIC")
                private Integer _$Coins_pickedup_widowS_den_MURDER_CLASSIC263;// FIXME check this code
                @SerializedName("games_widow's_den")
                private Integer _$Games_widowS_den105;// FIXME check this code
                private Integer coins_pickedup_MURDER_DOUBLE_UP;
                private Integer coins_pickedup_san_peratico_v2;
                private Integer coins_pickedup_san_peratico_v2_MURDER_DOUBLE_UP;
                private Integer games_MURDER_DOUBLE_UP;
                private Integer games_san_peratico_v2;
                private Integer games_san_peratico_v2_MURDER_DOUBLE_UP;
                private Integer wins_MURDER_DOUBLE_UP;
                private Integer wins_san_peratico_v2;
                private Integer wins_san_peratico_v2_MURDER_DOUBLE_UP;
                private List<String> packages;
                @SerializedName("MurderMystery_openedChests")
                private Integer murderMystery_openedChests;
                @SerializedName("MurderMystery_openedCommons")
                private Integer murderMystery_openedCommons;
                @SerializedName("MurderMystery_openedRares")
                private Integer murderMystery_openedRares;
                private List<String> chest_history_new;
                private String active_victory_dance;
                private Integer bow_kills_MURDER_DOUBLE_UP;
                @SerializedName("bow_kills_widow's_den")
                private Integer _$Bow_kills_widowS_den126;// FIXME check this code
                @SerializedName("bow_kills_widow's_den_MURDER_DOUBLE_UP")
                private Integer _$Bow_kills_widowS_den_MURDER_DOUBLE_UP124;// FIXME check this code
                @SerializedName("coins_pickedup_widow's_den_MURDER_DOUBLE_UP")
                private Integer _$Coins_pickedup_widowS_den_MURDER_DOUBLE_UP88;// FIXME check this code
                private Integer deaths_MURDER_DOUBLE_UP;
                @SerializedName("deaths_widow's_den")
                private Integer _$Deaths_widowS_den301;// FIXME check this code
                @SerializedName("deaths_widow's_den_MURDER_DOUBLE_UP")
                private Integer _$Deaths_widowS_den_MURDER_DOUBLE_UP258;// FIXME check this code
                @SerializedName("games_widow's_den_MURDER_DOUBLE_UP")
                private Integer _$Games_widowS_den_MURDER_DOUBLE_UP192;// FIXME check this code
                private Integer kills_MURDER_DOUBLE_UP;
                private Integer kills_as_murderer;
                private Integer kills_as_murderer_MURDER_DOUBLE_UP;
                @SerializedName("kills_as_murderer_widow's_den")
                private Integer _$Kills_as_murderer_widowS_den160;// FIXME check this code
                @SerializedName("kills_as_murderer_widow's_den_MURDER_DOUBLE_UP")
                private Integer _$Kills_as_murderer_widowS_den_MURDER_DOUBLE_UP332;// FIXME check this code
                @SerializedName("kills_widow's_den")
                private Integer _$Kills_widowS_den332;// FIXME check this code
                @SerializedName("kills_widow's_den_MURDER_DOUBLE_UP")
                private Integer _$Kills_widowS_den_MURDER_DOUBLE_UP145;// FIXME check this code
                private Integer knife_kills_MURDER_DOUBLE_UP;
                @SerializedName("knife_kills_widow's_den")
                private Integer _$Knife_kills_widowS_den12;// FIXME check this code
                @SerializedName("knife_kills_widow's_den_MURDER_DOUBLE_UP")
                private Integer _$Knife_kills_widowS_den_MURDER_DOUBLE_UP171;// FIXME check this code
                private Integer coins_pickedup_darkfall;
                private Integer coins_pickedup_darkfall_MURDER_DOUBLE_UP;
                private Integer games_darkfall;
                private Integer games_darkfall_MURDER_DOUBLE_UP;
                private Integer wins_darkfall;
                private Integer wins_darkfall_MURDER_DOUBLE_UP;
                private Integer coins_pickedup_snowglobe;
                private Integer coins_pickedup_snowglobe_MURDER_DOUBLE_UP;
                private Integer games_snowglobe;
                private Integer games_snowglobe_MURDER_DOUBLE_UP;
                private Integer wins_snowglobe;
                private Integer wins_snowglobe_MURDER_DOUBLE_UP;
                private Integer coins_pickedup_ancient_tomb;
                private Integer coins_pickedup_ancient_tomb_MURDER_DOUBLE_UP;
                private Integer games_ancient_tomb;
                private Integer games_ancient_tomb_MURDER_DOUBLE_UP;
                private Integer wins_ancient_tomb;
                private Integer wins_ancient_tomb_MURDER_DOUBLE_UP;
                private Integer coins_pickedup_spooky_mansion;
                private Integer coins_pickedup_spooky_mansion_MURDER_DOUBLE_UP;
                private Integer deaths_spooky_mansion;
                private Integer deaths_spooky_mansion_MURDER_DOUBLE_UP;
                private Integer games_spooky_mansion;
                private Integer games_spooky_mansion_MURDER_DOUBLE_UP;
                private Integer wins_spooky_mansion;
                private Integer wins_spooky_mansion_MURDER_DOUBLE_UP;
                private Integer deaths_san_peratico_v2;
                private Integer deaths_san_peratico_v2_MURDER_DOUBLE_UP;
                private Integer coins_pickedup_aquarium;
                private Integer coins_pickedup_aquarium_MURDER_DOUBLE_UP;
                private Integer games_aquarium;
                private Integer games_aquarium_MURDER_DOUBLE_UP;
                private Integer was_hero_MURDER_DOUBLE_UP;
                private Integer was_hero_aquarium;
                private Integer was_hero_aquarium_MURDER_DOUBLE_UP;
                private Integer wins_aquarium;
                private Integer wins_aquarium_MURDER_DOUBLE_UP;
                private Integer deaths_ancient_tomb;
                private Integer deaths_ancient_tomb_MURDER_DOUBLE_UP;
                private Integer deaths_aquarium;
                private Integer deaths_aquarium_MURDER_DOUBLE_UP;
                private Integer kills_aquarium;
                private Integer kills_aquarium_MURDER_DOUBLE_UP;
                private Integer trap_kills;
                private Integer trap_kills_MURDER_DOUBLE_UP;
                private Integer trap_kills_aquarium;
                private Integer trap_kills_aquarium_MURDER_DOUBLE_UP;
                private Integer coins_pickedup_gold_rush;
                private Integer coins_pickedup_gold_rush_MURDER_DOUBLE_UP;
                private Integer games_gold_rush;
                private Integer games_gold_rush_MURDER_DOUBLE_UP;
                private Integer wins_gold_rush;
                private Integer wins_gold_rush_MURDER_DOUBLE_UP;
                private Integer coins_pickedup_library;
                private Integer coins_pickedup_library_MURDER_DOUBLE_UP;
                private Integer games_library;
                private Integer games_library_MURDER_DOUBLE_UP;
                private Integer wins_library;
                private Integer wins_library_MURDER_DOUBLE_UP;
                private Integer deaths_library;
                private Integer deaths_library_MURDER_DOUBLE_UP;
                private Integer kills_as_murderer_library;
                private Integer kills_as_murderer_library_MURDER_DOUBLE_UP;
                private Integer kills_library;
                private Integer kills_library_MURDER_DOUBLE_UP;
                private Integer knife_kills_library;
                private Integer knife_kills_library_MURDER_DOUBLE_UP;
                private Integer alpha_chance;
                private Integer mm_christmas_chests;
                private Boolean free_event_key_mm_christmas_chests_2021;
                @SerializedName("MurderMystery_openedLegendaries")
                private Integer murderMystery_openedLegendaries;
                private Integer coins_pickedup_gold_rush_MURDER_CLASSIC;
                private Integer games_gold_rush_MURDER_CLASSIC;
                private Integer wins_gold_rush_MURDER_CLASSIC;
                private Integer deaths_MURDER_CLASSIC;
                private Integer deaths_towerfall;
                private Integer deaths_towerfall_MURDER_CLASSIC;
                private Integer coins_pickedup_library_MURDER_CLASSIC;
                private Integer deaths_library_MURDER_CLASSIC;
                private Integer games_library_MURDER_CLASSIC;
                private Integer wins_library_MURDER_CLASSIC;
                private Integer coins_pickedup_ancient_tomb_MURDER_CLASSIC;
                private Integer detective_wins;
                private Integer detective_wins_MURDER_CLASSIC;
                private Integer detective_wins_ancient_tomb;
                private Integer detective_wins_ancient_tomb_MURDER_CLASSIC;
                private Integer games_ancient_tomb_MURDER_CLASSIC;
                private Integer quickest_detective_win_time_seconds;
                private Integer quickest_detective_win_time_seconds_MURDER_CLASSIC;
                private Integer quickest_detective_win_time_seconds_ancient_tomb;
                private Integer quickest_detective_win_time_seconds_ancient_tomb_MURDER_CLASSIC;
                private Integer wins_ancient_tomb_MURDER_CLASSIC;
                private Integer coins_pickedup_hypixel_world;
                private Integer coins_pickedup_hypixel_world_MURDER_CLASSIC;
                private Integer games_hypixel_world;
                private Integer games_hypixel_world_MURDER_CLASSIC;
                private Integer wins_hypixel_world;
                private Integer wins_hypixel_world_MURDER_CLASSIC;
                private Integer deaths_ancient_tomb_MURDER_CLASSIC;
                private Integer kills_ancient_tomb;
                private Integer kills_ancient_tomb_MURDER_CLASSIC;
                private Integer kills_as_murderer_MURDER_CLASSIC;
                private Integer kills_as_murderer_ancient_tomb;
                private Integer kills_as_murderer_ancient_tomb_MURDER_CLASSIC;
                private Integer knife_kills_MURDER_CLASSIC;
                private Integer knife_kills_ancient_tomb;
                private Integer knife_kills_ancient_tomb_MURDER_CLASSIC;
                private Integer coins_pickedup_archives;
                private Integer coins_pickedup_archives_MURDER_CLASSIC;
                private Integer deaths_archives;
                private Integer deaths_archives_MURDER_CLASSIC;
                private Integer games_archives;
                private Integer games_archives_MURDER_CLASSIC;
                private Integer deaths_mountain_MURDER_CLASSIC;
                private Integer games_mountain_MURDER_CLASSIC;
                private Integer wins_mountain_MURDER_CLASSIC;
                private String active_animated_hat;
                private Integer coins_pickedup_subway;
                private Integer coins_pickedup_subway_MURDER_CLASSIC;
                private Integer deaths_subway;
                private Integer deaths_subway_MURDER_CLASSIC;
                private Integer games_subway;
                private Integer games_subway_MURDER_CLASSIC;
                private Integer wins_subway;
                private Integer wins_subway_MURDER_CLASSIC;
                private Integer deaths_hypixel_world;
                private Integer deaths_hypixel_world_MURDER_CLASSIC;
                private String active_kill_note;
                private Integer coins_pickedup_snowfall;
                private Integer coins_pickedup_snowfall_MURDER_CLASSIC;
                private Integer games_snowfall;
                private Integer games_snowfall_MURDER_CLASSIC;
                private Integer wins_snowfall;
                private Integer wins_snowfall_MURDER_CLASSIC;
                private Integer coins_pickedup_san_peratico_v2_MURDER_CLASSIC;
                private Integer games_san_peratico_v2_MURDER_CLASSIC;
                private Integer wins_san_peratico_v2_MURDER_CLASSIC;
                private Integer coins_pickedup_skyway_pier;
                private Integer coins_pickedup_skyway_pier_MURDER_CLASSIC;
                private Integer games_skyway_pier;
                private Integer games_skyway_pier_MURDER_CLASSIC;
                private Integer wins_skyway_pier;
                private Integer wins_skyway_pier_MURDER_CLASSIC;
                private Integer coins_pickedup_transport;
                private Integer coins_pickedup_transport_MURDER_CLASSIC;
                private Integer games_transport_MURDER_CLASSIC;
                private Integer wins_transport;
                private Integer wins_transport_MURDER_CLASSIC;
                private Integer coins_pickedup_cruise_ship;
                private Integer coins_pickedup_cruise_ship_MURDER_CLASSIC;
                private Integer deaths_cruise_ship;
                private Integer deaths_cruise_ship_MURDER_CLASSIC;
                private Integer games_cruise_ship;
                private Integer games_cruise_ship_MURDER_CLASSIC;
                private Integer kills_as_murderer_cruise_ship;
                private Integer kills_as_murderer_cruise_ship_MURDER_CLASSIC;
                private Integer kills_cruise_ship;
                private Integer kills_cruise_ship_MURDER_CLASSIC;
                private Integer knife_kills_cruise_ship;
                private Integer knife_kills_cruise_ship_MURDER_CLASSIC;
                private Integer thrown_knife_kills;
                private Integer thrown_knife_kills_MURDER_CLASSIC;
                private Integer thrown_knife_kills_cruise_ship;
                private Integer thrown_knife_kills_cruise_ship_MURDER_CLASSIC;
                private Integer coins_pickedup_aquarium_MURDER_CLASSIC;
                private Integer deaths_aquarium_MURDER_CLASSIC;
                private Integer games_aquarium_MURDER_CLASSIC;
                private Integer wins_aquarium_MURDER_CLASSIC;
                private Integer bow_kills_ancient_tomb;
                private Integer bow_kills_ancient_tomb_MURDER_CLASSIC;
                private Integer was_hero_ancient_tomb;
                private Integer was_hero_ancient_tomb_MURDER_CLASSIC;
                private Integer kills_as_murderer_towerfall;
                private Integer kills_as_murderer_towerfall_MURDER_CLASSIC;
                private Integer knife_kills_towerfall;
                private Integer knife_kills_towerfall_MURDER_CLASSIC;
                private Integer wins_cruise_ship;
                private Integer wins_cruise_ship_MURDER_CLASSIC;
                private Integer coins_pickedup_spooky_mansion_MURDER_CLASSIC;
                private Integer deaths_spooky_mansion_MURDER_CLASSIC;
                private Integer games_spooky_mansion_MURDER_CLASSIC;
                private Integer wins_spooky_mansion_MURDER_CLASSIC;
                private Integer bow_kills_library;
                private Integer bow_kills_library_MURDER_CLASSIC;
                private Integer detective_wins_library;
                private Integer detective_wins_library_MURDER_CLASSIC;
                private Integer kills_library_MURDER_CLASSIC;
                private Integer was_hero_library;
                private Integer was_hero_library_MURDER_CLASSIC;
                private Integer bow_kills_skyway_pier;
                private Integer bow_kills_skyway_pier_MURDER_CLASSIC;
                private Integer detective_wins_skyway_pier;
                private Integer detective_wins_skyway_pier_MURDER_CLASSIC;
                private Integer kills_skyway_pier;
                private Integer kills_skyway_pier_MURDER_CLASSIC;
                private Integer was_hero_skyway_pier;
                private Integer was_hero_skyway_pier_MURDER_CLASSIC;
            }

            
            
            public static class DuelsBean {
                private Integer games_played_duels;
                private String show_lb_option;
                private String chat_enabled;
                private String rematch_option_1;
                private Integer op_duel_health_regenerated;
                private Integer melee_swings;
                private Integer op_duel_damage_dealt;
                private Integer melee_hits;
                private Integer op_duel_rounds_played;
                private Integer health_regenerated;
                private Integer rounds_played;
                private Integer op_duel_melee_swings;
                private Integer damage_dealt;
                private Integer op_duel_melee_hits;
                private String selected_2;
                private String selected_1;
                private Integer uhc_duel_health_regenerated;
                private Integer uhc_duel_bow_shots;
                private Integer uhc_duel_melee_swings;
                private Integer bow_shots;
                private Integer uhc_duel_bow_hits;
                private Integer uhc_duel_rounds_played;
                private Integer bow_hits;
                private Integer uhc_duel_damage_dealt;
                private Integer uhc_duel_melee_hits;
                private Integer deaths;
                private Integer bridge_doubles_deaths;
                private Integer goals;
                private Integer bridge_doubles_goals;
                private Integer bridge_doubles_rounds_played;
                private Integer bridge_doubles_kills;
                private Integer bridge_doubles_losses;
                private Integer losses;
                private List<String> packages;
                private Integer mega_walls_rookie_title_prestige;
                private Integer all_modes_rookie_title_prestige;
                private Integer op_rookie_title_prestige;
                private Integer skywars_rookie_title_prestige;
                private Integer no_debuff_rookie_title_prestige;
                private Integer bridge_rookie_title_prestige;
                private Integer uhc_rookie_title_prestige;
                private Integer tournament_rookie_title_prestige;
                private Integer classic_rookie_title_prestige;
                private Integer bow_rookie_title_prestige;
                private Integer tnt_games_rookie_title_prestige;
                private Integer blitz_rookie_title_prestige;
                private Integer sumo_rookie_title_prestige;
                private Integer combo_rookie_title_prestige;
                private String selected_1_new;
                private String selected_2_new;
                private Integer bow_duel_bow_hits;
                private Integer bow_duel_bow_shots;
                private Integer bow_duel_health_regenerated;
                private Integer bow_duel_damage_dealt;
                private Integer bow_duel_rounds_played;
                private Integer classic_duel_rounds_played;
                private Integer classic_duel_melee_hits;
                private Integer classic_duel_health_regenerated;
                private Integer classic_duel_damage_dealt;
                private Integer classic_duel_bow_shots;
                private Integer classic_duel_melee_swings;
                private String sw_duels_kit_new3;
                private Integer current_skywars_winstreak;
                private Integer current_winstreak;
                private Integer current_winstreak_mode_sw_doubles;
                private Integer sw_doubles_damage_dealt;
                private Integer sw_doubles_deaths;
                private Integer sw_doubles_losses;
                private Integer sw_doubles_melee_hits;
                private Integer sw_doubles_melee_swings;
                private Integer sw_doubles_rounds_played;
                private Integer blocks_placed;
                private Integer coins;
                private Integer sw_doubles_blocks_placed;
                private Integer sw_doubles_health_regenerated;
                private Integer current_bridge_winstreak;
                private Integer current_winstreak_mode_bridge_doubles;
                private Integer bridge_deaths;
                private Integer bridge_doubles_blocks_placed;
                private Integer bridge_doubles_bow_hits;
                private Integer bridge_doubles_bow_shots;
                private Integer bridge_doubles_bridge_deaths;
                private Integer bridge_doubles_bridge_kills;
                private Integer bridge_doubles_damage_dealt;
                private Integer bridge_doubles_health_regenerated;
                private Integer bridge_doubles_melee_hits;
                private Integer bridge_doubles_melee_swings;
                private Integer bridge_kills;
                private String duels_recently_played2;
                private Integer current_op_winstreak;
                private Integer current_winstreak_mode_op_duel;
                private Integer op_duel_deaths;
                private Integer op_duel_losses;
                private Boolean moved_to_redis_2;
                private Integer parkour_rookie_title_prestige;
                private Integer boxing_rookie_title_prestige;
                private Integer classic_duel_deaths;
                private Integer classic_duel_losses;
                private List<String> maps_won_on;
                private Integer classic_duel_kills;
                private Integer classic_duel_wins;
                private Integer kills;
                private Integer wins;
                private Integer classic_duel_bow_hits;
                private Integer sumo_duel_deaths;
                private Integer sumo_duel_losses;
                private Integer sumo_duel_melee_hits;
                private Integer sumo_duel_melee_swings;
                private Integer sumo_duel_rounds_played;
                private Integer duels_chests;
                @SerializedName("Duels_openedChests")
                private Integer duels_openedChests;
                @SerializedName("Duels_openedCommons")
                private Integer duels_openedCommons;
                @SerializedName("Duels_openedRares")
                private Integer duels_openedRares;
                private List<String> duels_chest_history;
                private String active_cosmetictitle;
                private String active_emblem;
                private String active_projectile_trail;
                private Integer champion_kit_wins;
                private Integer kit_wins;
                private Integer sw_doubles_champion_kit_wins;
                private Integer sw_doubles_kills;
                private Integer sw_doubles_kit_wins;
                private Integer sw_doubles_wins;
                private Integer sw_doubles_bow_hits;
                private Integer sw_doubles_bow_shots;
                private Integer op_doubles_damage_dealt;
                private Integer op_doubles_deaths;
                private Integer op_doubles_health_regenerated;
                private Integer op_doubles_losses;
                private Integer op_doubles_melee_hits;
                private Integer op_doubles_melee_swings;
                private Integer op_doubles_rounds_played;
                private Integer combo_duel_damage_dealt;
                private Integer combo_duel_golden_apples_eaten;
                private Integer combo_duel_health_regenerated;
                private Integer combo_duel_melee_hits;
                private Integer combo_duel_melee_swings;
                private Integer combo_duel_rounds_played;
                private Integer golden_apples_eaten;
                private Integer scout_kit_wins;
                private Integer sw_doubles_scout_kit_wins;
                private Integer pyromancer_kit_wins;
                private Integer sw_doubles_pyromancer_kit_wins;
                private Integer op_doubles_kills;
                private Integer op_doubles_wins;
                private String active_killmessages;
                private Integer bridge_doubles_golden_apples_eaten;
                private Integer leaderboardPage_goals;
                private Integer archeologist_kit_wins;
                private Integer sw_doubles_archeologist_kit_wins;
                private Integer uhc_doubles_blocks_placed;
                private Integer uhc_doubles_bow_hits;
                private Integer uhc_doubles_bow_shots;
                private Integer uhc_doubles_damage_dealt;
                private Integer uhc_doubles_golden_apples_eaten;
                private Integer uhc_doubles_health_regenerated;
                private Integer uhc_doubles_kills;
                private Integer uhc_doubles_melee_hits;
                private Integer uhc_doubles_melee_swings;
                private Integer uhc_doubles_rounds_played;
                private Integer uhc_doubles_wins;
                private Integer athlete_kit_wins;
                private Integer sw_doubles_athlete_kit_wins;
                private String arena_mode_op;
                private Integer duel_arena_bow_shots;
                private Integer duel_arena_damage_dealt;
                private Integer duel_arena_health_regenerated;
                private Integer duel_arena_kills;
                private Integer duel_arena_melee_hits;
                private Integer duel_arena_melee_swings;
                private Integer duel_arena_rounds_played;
                private Integer duel_arena_wins;
                private Integer duel_arena_deaths;
                private Integer duel_arena_losses;
                private Integer leaderboardPage_win_streak;
                private Integer uhc_duel_blocks_placed;
                private String active_kill_effect;
                private Integer classic_iron_title_prestige;
                private String active_auras;
                private Integer all_modes_iron_title_prestige;
                private String kit_menu_option;
                @SerializedName("Duels_openedEpics")
                private Integer duels_openedEpics;
                private String active_weaponpacks;
                private String active_victory_dance;
                private Integer sw_duel_kit_wins;
                private Integer sw_duel_melee_swings;
                private Integer sw_duel_rounds_played;
                private Integer sw_duel_scout_kit_wins;
                private Integer sw_duel_wins;
                private Integer sw_duel_blocks_placed;
                private Integer sw_duel_damage_dealt;
                private Integer sw_duel_health_regenerated;
                private Integer sw_duel_kills;
                private Integer sw_duel_melee_hits;
                private Integer sw_duel_deaths;
                private Integer sw_duel_losses;
                private Integer sw_duel_bow_shots;
                private String arena_mode_classic;
                private Integer duel_arena_blocks_placed;
                private Integer duel_arena_bow_hits;
                private Integer classic_gold_title_prestige;
                private String status_field;
                private String blitz_duels_kit;
                private Integer blitz_duel_blocks_placed;
                private Integer blitz_duel_damage_dealt;
                private Integer blitz_duel_health_regenerated;
                private Integer blitz_duel_melee_hits;
                private Integer blitz_duel_melee_swings;
                private Integer blitz_duel_rounds_played;
                private Integer best_winstreak_mode_potion_duel;
                private Integer best_winstreak_mode_blitz_duel;
                private Integer best_winstreak_mode_uhc_doubles;
                private Integer best_winstreak_mode_mw_duel;
                private Integer best_winstreak_mode_bow_duel;
                private Integer best_winstreak_mode_sumo_duel;
                private Integer best_winstreak_mode_sw_duel;
                private Integer best_winstreak_mode_mw_doubles;
                private Integer best_winstreak_mode_op_duel;
                private Integer best_winstreak_mode_bridge_duel;
                private Integer best_winstreak_mode_uhc_four;
                private Integer best_winstreak_mode_uhc_duel;
                private Boolean moved_to_redis_3;
                private Integer best_winstreak_mode_classic_duel;
                private Integer best_winstreak_mode_combo_duel;
                private Integer best_winstreak_mode_bridge_3v3v3v3;
                private Integer best_winstreak_mode_parkour_eight;
                private Integer best_winstreak_mode_bridge_four;
                private Integer best_winstreak_mode_capture_threes;
                private Integer best_uhc_winstreak;
                private Integer best_winstreak_mode_duel_arena;
                private Integer best_skywars_winstreak;
                private Integer best_winstreak_mode_bridge_doubles;
                private Integer best_winstreak_mode_boxing_duel;
                private Integer best_winstreak_mode_bridge_threes;
                private Integer best_winstreak_mode_bowspleef_duel;
                private Integer best_winstreak_mode_uhc_meetup;
                private Integer best_winstreak_mode_op_doubles;
                private Integer best_classic_winstreak;
                private Integer best_winstreak_mode_bridge_2v2v2v2;
                private Integer best_winstreak_mode_sw_doubles;
                private Integer best_op_winstreak;
                private Integer best_arena_winstreak;
                private Integer best_overall_winstreak;
                private Integer best_combo_winstreak;
                private Integer best_parkour_winstreak;
                private Integer best_boxing_winstreak;
                private Integer best_bridge_winstreak;
                private Integer best_sumo_winstreak;
                private Integer best_tnt_games_winstreak;
                private Integer best_no_debuff_winstreak;
                private Integer best_all_modes_winstreak;
                private Integer best_mega_walls_winstreak;
                private Integer best_blitz_winstreak;
                private Integer current_winstreak_mode_classic_duel;
                private Integer best_bow_winstreak;
                private Integer current_classic_winstreak;
                private Integer current_winstreak_mode_op_doubles;
                private Integer current_winstreak_mode_sumo_duel;
                private Integer current_sumo_winstreak;
                private Integer sumo_duel_kills;
                private Integer sumo_duel_wins;
                private Integer current_winstreak_mode_uhc_doubles;
                private Integer current_uhc_winstreak;
                private Integer uhc_doubles_deaths;
                private Integer uhc_doubles_losses;
                private LayoutUhcDuelLayoutBean layout_uhc_duel_layout;
                private Integer all_modes_gold_title_prestige;
                private Integer uhc_duel_golden_apples_eaten;

                
                
                public static class LayoutUhcDuelLayoutBean {
                    @SerializedName("33")
                    private String _$33;
                    @SerializedName("34")
                    private String _$34;
                    @SerializedName("35")
                    private String _$35;
                    @SerializedName("0")
                    private String _$0;
                    @SerializedName("1")
                    private String _$1;
                    @SerializedName("2")
                    private String _$2;
                    @SerializedName("3")
                    private String _$3;
                    @SerializedName("4")
                    private String _$4;
                    @SerializedName("5")
                    private String _$5;
                    @SerializedName("6")
                    private String _$6;
                    @SerializedName("7")
                    private String _$7;
                    @SerializedName("8")
                    private String _$8;
                    @SerializedName("9")
                    private String _$9;
                }
            }

            
            
            public static class SkyBlockBean {
                private ProfilesBean profiles;

                
                
                public static class ProfilesBean {
                    private A3f48db89fee47ccb229f3d8af14d27aBean a3f48db89fee47ccb229f3d8af14d27a;

                    
                    
                    public static class A3f48db89fee47ccb229f3d8af14d27aBean {
                        private String profile_id;
                        private String cute_name;
                    }
                }
            }

            
            
            public static class PitBean {
                private ProfileBean profile;
                private PitStatsPtlBean pit_stats_ptl;

                
                
                public static class ProfileBean {
                    private Boolean moved_achievements_1;
                    private List<?> outgoing_offers;
                    private Boolean moved_achievements_2;
                    private Long last_midfight_disconnect;
                    private ItemsLastBuyBean items_last_buy;
                    private LeaderboardStatsBean leaderboard_stats;
                    private Long last_save;
                    private KingQuestBean king_quest;
                    private InvArmorBean inv_armor;
                    private List<?> login_messages;
                    private List<Integer> hotbar_favorites;
                    private SpireStashInvBean spire_stash_inv;
                    private Integer xp;
                    private InvContentsBean inv_contents;
                    private Boolean zero_point_three_gold_transfer;
                    private DeathRecapsBean death_recaps;
                    private List<?> bounties;
                    private SpireStashArmorBean spire_stash_armor;
                    private Double cash;
                    private Double cash_during_prestige_0;

                    
                    
                    public static class ItemsLastBuyBean {
                    }

                    
                    
                    public static class LeaderboardStatsBean {
                    }

                    
                    
                    public static class KingQuestBean {
                        private Integer kills;
                    }

                    
                    
                    public static class InvArmorBean {
                        private Integer type;
                        private List<Integer> data;
                    }

                    
                    
                    public static class SpireStashInvBean {
                        private Integer type;
                        private List<Integer> data;
                    }

                    
                    
                    public static class InvContentsBean {
                        private Integer type;
                        private List<Integer> data;
                    }

                    
                    
                    public static class DeathRecapsBean {
                        private Integer type;
                        private List<Integer> data;
                    }

                    
                    
                    public static class SpireStashArmorBean {
                        private Integer type;
                        private List<Integer> data;
                    }
                }

                
                
                public static class PitStatsPtlBean {
                    private Integer arrows_fired;
                    private Integer bow_damage_received;
                    private Integer cash_earned;
                    private Integer damage_dealt;
                    private Integer damage_received;
                    private Integer deaths;
                    private Integer gapple_eaten;
                    private Integer joins;
                    private Integer jumped_into_pit;
                    private Integer kills;
                    private Integer launched_by_launchers;
                    private Integer left_clicks;
                    private Integer max_streak;
                    private Integer melee_damage_dealt;
                    private Integer melee_damage_received;
                    private Integer sword_hits;
                    private Integer arrow_hits;
                    private Integer bow_damage_dealt;
                    private Integer playtime_minutes;
                    private Integer assists;
                    private Integer chat_messages;
                    private Integer blocks_placed;
                    private Integer diamond_items_purchased;
                }
            }

            
            
            public static class HousingBean {
                private List<String> packages;
            }
        }

        
        
        public static class AchievementsBean {
            private Integer warlords_paladin_level;
            private Integer warlords_mage_level;
            private Integer warlords_warrior_level;
            private Integer warlords_shaman_level;
            private Integer copsandcrims_bomb_specialist;
            private Integer paintball_wins;
            private Integer paintball_kills;
            private Integer skywars_kills_team;
            private Integer skywars_kills_solo;
            private Integer skywars_wins_solo;
            private Integer skywars_kits_team;
            private Integer skywars_cages;
            private Integer skywars_wins_team;
            private Integer skywars_kits_solo;
            private Integer general_wins;
            private Integer general_coins;
            private Integer paintball_coins;
            private Integer uhc_moving_up;
            private Integer uhc_hunter;
            private Integer uhc_champion;
            private Integer arena_climb_the_ranks;
            private Integer arena_gladiator;
            private Integer arena_bossed;
            private Integer arena_gotta_wear_em_all;
            private Integer quake_wins;
            private Integer quake_kills;
            private Integer walls3_guardian;
            private Integer walls3_coins;
            private Integer truecombat_kit_hoarder_solo;
            private Integer truecombat_kit_hoarder_team;
            private Integer skywars_kills_mega;
            private Integer skywars_kits_mega;
            private Integer skywars_wins_mega;
            private Integer supersmash_hero_slayer;
            private Integer supersmash_smash_winner;
            private Integer supersmash_smash_champion;
            private Integer blitz_kills;
            private Integer blitz_coins;
            private Integer vampirez_coins;
            private Integer vampirez_kill_survivors;
            private Integer copsandcrims_cac_banker;
            private Integer copsandcrims_serial_killer;
            private Integer copsandcrims_hero_terrorist;
            private Integer tntgames_tnt_run_wins;
            private Integer truecombat_team_killer;
            private Integer general_challenger;
            private Integer general_quest_master;
            private Integer speeduhc_hunter;
            private Integer supersmash_handyman;
            private Integer speeduhc_collector;
            private Integer speeduhc_uhc_master;
            private Integer tntgames_wizards_wins;
            private Integer blitz_wins;
            private Integer walls_kills;
            private Integer walls_coins;
            private Integer truecombat_solo_killer;
            private Integer walls_wins;
            private Integer skyclash_cards_unlocked;
            private Integer skyclash_kills;
            private Integer skyclash_wins;
            private Integer skyclash_packs_opened;
            private Integer speeduhc_salty;
            private Integer arcade_team_work;
            private Integer arcade_miniwalls_winner;
            private Integer arcade_arcade_winner;
            private Integer arcade_farmhunt_dominator;
            private Integer arcade_zombie_killer;
            private Integer arcade_football_pro;
            private Integer arcade_arcade_banker;
            private Integer uhc_bounty;
            private Integer tntgames_bow_spleef_wins;
            private Integer tntgames_pvp_run_wins;
            private Integer tntgames_pvp_run_killer;
            private Integer tntgames_tnt_tag_wins;
            private Integer tntgames_tnt_wizards_kills;
            private Integer arcade_bounty_hunter;
            private Integer tntgames_tnt_triathlon;
            private Integer tntgames_tnt_banker;
            private Integer walls3_kills;
            private Integer walls3_wins;
            private Integer vampirez_zombie_killer;
            private Integer quake_coins;
            private Integer tntgames_tnt_wizards_caps;
            private Integer skyclash_treasure_hunter;
            private Integer bedwars_beds;
            private Integer bedwars_wins;
            private Integer truecombat_solo_winner;
            private Integer bedwars_level;
            private Integer bedwars_loot_box;
            private Integer skyclash_mob_beheading;
            private Integer buildbattle_buildbattle_points;
            private Integer christmas2017_santa_says_rounds;
            private Integer murdermystery_wins_as_survivor;
            private Integer arcade_zombies_round_progression;
            private Integer copsandcrims_headshot_kills;
            private Integer buildbattle_build_battle_voter;
            private Integer buildbattle_build_battle_points;
            private Integer buildbattle_build_battle_score;
            private Integer bridge_goals;
            private Integer bedwars_bedwars_killer;
            private Integer bedwars_collectors_edition;
            private Integer duels_goals;
            private Integer tntgames_clinic;
            private Integer christmas2017_no_christmas;
            private Integer christmas2017_advent_2018;
            private Integer gingerbread_banker;
            private Integer paintball_kill_streaks;
            private Integer gingerbread_racer;
            private Integer gingerbread_mystery;
            private Integer skywars_heads;
            private Integer murdermystery_hoarder;
            private Integer skyblock_treasury;
            private Integer skyblock_minion_lover;
            private Integer christmas2017_advent_2019;
            private Integer easter_throw_eggs;
            private Integer blitz_wins_teams;
            private Integer blitz_looter;
            private Integer blitz_fighting_expert;
            private Integer blitz_kit_expert;
            private Integer blitz_kit_experience_collector;
            private Integer arcade_zombies_nice_shot;
            private Integer walls_diamond_miner;
            private Integer pit_gold;
            private Integer pit_kills;
            private Integer skywars_you_re_a_star;
            private Integer summer_shopaholic;
            private Integer speeduhc_promotion;
            private Integer blitz_master_of_kits;
            private Integer blitz_mob_master;
            private Integer tntgames_block_runner;
            private Integer murdermystery_kills_as_murderer;
            private Integer arcade_zombies_high_round;
            private Integer arcade_galaxy_wars_kills;
            private Integer arcade_throw_out_kills;
            private Integer halloween2017_pumpkinator;
            private Integer duels_duels_traveller;
            private Integer duels_duels_win_streak;
            private Integer duels_duels_winner;
            private Integer duels_duels_mastery;
            private Integer murdermystery_countermeasures;
            private Integer arcade_party_super_star;
            private Integer christmas2017_advent_2021;
            private Integer duels_duels_division;
            private Integer christmas2017_present_collector;
            private Integer general_master_lure;
        }

        
        
        public static class QuestsBean {
            private SkywarsSoloWinBean skywars_solo_win;
            private SkywarsSoloKillsBean skywars_solo_kills;
            private SkywarsTeamWinBean skywars_team_win;
            private SkywarsTeamKillsBean skywars_team_kills;
            private SkywarsWeeklyKillsBean skywars_weekly_kills;
            private CrazyWallsDailyPlayBean crazy_walls_daily_play;
            private CrazyWallsDailyKillBean crazy_walls_daily_kill;
            private CrazyWallsDailyWinBean crazy_walls_daily_win;
            private CrazyWallsWeeklyBean crazy_walls_weekly;
            private SupersmashSoloWinBean supersmash_solo_win;
            private SupersmashSoloKillsBean supersmash_solo_kills;
            private SupersmashTeamWinBean supersmash_team_win;
            private SupersmashTeamKillsBean supersmash_team_kills;
            private SupersmashWeeklyKillsBean supersmash_weekly_kills;
            private NormalBrawlerBean normal_brawler;
            private InsaneBrawlerBean insane_brawler;
            private HuntingSeasonBean hunting_season;
            private UhcAddictBean uhc_addict;
            private UhcMadnessBean uhc_madness;
            private WallsDailyPlayBean walls_daily_play;
            private WallsDailyKillBean walls_daily_kill;
            private WallsWeeklyBean walls_weekly;
            private WallsDailyWinBean walls_daily_win;
            private ArcadeGamerBean arcade_gamer;
            private ArcadeWinnerBean arcade_winner;
            private ArcadeSpecialistBean arcade_specialist;
            private SkyclashPlayGamesBean skyclash_play_games;
            private SkyclashKillsBean skyclash_kills;
            private SkyclashPlayPointsBean skyclash_play_points;
            private SkyclashVoidBean skyclash_void;
            private SkyclashWeeklyKillsBean skyclash_weekly_kills;
            private UhcTeamBean uhc_team;
            private UhcSoloBean uhc_solo;
            private UhcDmBean uhc_dm;
            private UhcWeeklyBean uhc_weekly;
            private BedwarsDailyWinBean bedwars_daily_win;
            private BedwarsDailyOneMoreBean bedwars_daily_one_more;
            private BedwarsWeeklyBedElimsBean bedwars_weekly_bed_elims;
            private SkywarsArcadeWinBean skywars_arcade_win;
            private SkywarsWeeklyArcadeWinAllBean skywars_weekly_arcade_win_all;
            private SkywarsMegaDoublesWinsBean skywars_mega_doubles_wins;
            private SkywarsDailyTokensBean skywars_daily_tokens;
            private SkywarsWeeklyFreeLootChestBean skywars_weekly_free_loot_chest;
            private SkywarsWeeklyHardChestBean skywars_weekly_hard_chest;
            private SkywarsCorruptWinBean skywars_corrupt_win;
            private PrototypePitDailyKillsBean prototype_pit_daily_kills;
            private PrototypePitDailyContractBean prototype_pit_daily_contract;
            private PrototypePitWeeklyGoldBean prototype_pit_weekly_gold;
            private BlitzGameOfTheDayBean blitz_game_of_the_day;
            private BlitzWinBean blitz_win;
            private BlitzLootChestDailyBean blitz_loot_chest_daily;
            private BlitzKillsBean blitz_kills;
            private BlitzWeeklyMasterBean blitz_weekly_master;
            private BlitzLootChestWeeklyBean blitz_loot_chest_weekly;
            private DuelsPlayerBean duels_player;
            private DuelsKillerBean duels_killer;
            private DuelsWinnerBean duels_winner;
            private DuelsWeeklyWinsBean duels_weekly_wins;
            private DuelsWeeklyKillsBean duels_weekly_kills;
            private SkywarsHalloweenHarvest2021Bean skywars_halloween_harvest_2021;
            private BedwarsWeeklyDreamWinBean bedwars_weekly_dream_win;
            private BedwarsDailyNightmaresBean bedwars_daily_nightmares;
            private BedwarsWeeklyPumpkinatorBean bedwars_weekly_pumpkinator;
            private TntDailyWinBean tnt_daily_win;
            private TntWeeklyPlayBean tnt_weekly_play;
            private TntBowspleefDailyBean tnt_bowspleef_daily;
            private TntTnttagDailyBean tnt_tnttag_daily;
            private TntTnttagWeeklyBean tnt_tnttag_weekly;
            private TntWizardsDailyBean tnt_wizards_daily;
            private TntBowspleefWeeklyBean tnt_bowspleef_weekly;
            private TntWizardsWeeklyBean tnt_wizards_weekly;
            private TntPvprunWeeklyBean tnt_pvprun_weekly;
            private TntTntrunDailyBean tnt_tntrun_daily;
            private TntTntrunWeeklyBean tnt_tntrun_weekly;
            private TntPvprunDailyBean tnt_pvprun_daily;
            private MmDailyTargetKillBean mm_daily_target_kill;
            private MmDailyWinBean mm_daily_win;
            private MmDailyInfectorBean mm_daily_infector;
            private MmWeeklyWinsBean mm_weekly_wins;
            private MmDailyPowerPlayBean mm_daily_power_play;
            private MmWeeklyMurdererKillsBean mm_weekly_murderer_kills;
            private BuildBattleWinnerBean build_battle_winner;
            private BuildBattlePlayerBean build_battle_player;
            private BuildBattleWeeklyBean build_battle_weekly;
            private BedwarsWeeklyChallengesBean bedwars_weekly_challenges;
            private BedwarsDailyGiftsBean bedwars_daily_gifts;
            private SkywarsSpecialNorthPoleBean skywars_special_north_pole;
            private QuakeDailyPlayBean quake_daily_play;
            private QuakeDailyWinBean quake_daily_win;
            private QuakeDailyKillBean quake_daily_kill;
            private GingerbreadBlingBlingBean gingerbread_bling_bling;
            private VampirezWeeklyKillBean vampirez_weekly_kill;
            private GingerbreadMapsBean gingerbread_maps;
            private VampirezWeeklyWinBean vampirez_weekly_win;
            private QuakeWeeklyPlayBean quake_weekly_play;
            private VampirezDailyWinBean vampirez_daily_win;
            private PaintballExpertBean paintball_expert;
            private GingerbreadMasteryBean gingerbread_mastery;
            private PaintballerBean paintballer;
            private VampirezDailyHumanKillBean vampirez_daily_human_kill;
            private ArenaDailyPlayBean arena_daily_play;
            private GingerbreadRacerBean gingerbread_racer;
            private VampirezWeeklyHumanKillBean vampirez_weekly_human_kill;
            private VampirezDailyKillBean vampirez_daily_kill;
            private PaintballKillerBean paintball_killer;
            private VampirezDailyPlayBean vampirez_daily_play;
            private ArenaDailyWinsBean arena_daily_wins;
            private ArenaWeeklyPlayBean arena_weekly_play;
            private ArenaDailyKillsBean arena_daily_kills;
            private MmSpecialWeeklySantaBean mm_special_weekly_santa;
            private BuildBattleChristmasBean build_battle_christmas;
            private BuildBattleChristmasWeeklyBean build_battle_christmas_weekly;
            private SoloBrawlerBean solo_brawler;
            private TeamBrawlerBean team_brawler;
            private UhcWeeklySpecialCookieBean uhc_weekly_special_cookie;
            private TntWeeklySpecialBean tnt_weekly_special;
            private CvcKillDailyNormalBean cvc_kill_daily_normal;
            private CvcWinDailyNormalBean cvc_win_daily_normal;
            private CvcKillBean cvc_kill;
            private CvcWinDailyDeathmatchBean cvc_win_daily_deathmatch;
            private CvcKillWeeklyBean cvc_kill_weekly;

            
            
            public static class SkywarsSoloWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsSoloKillsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer skywars_solo_kills;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsTeamWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsTeamKillsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer skywars_team_kills;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsWeeklyKillsBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class CrazyWallsDailyPlayBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class CrazyWallsDailyKillBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer crazy_walls_daily_kill;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class CrazyWallsDailyWinBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class CrazyWallsWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer crazy_walls_weekly_kill;
                        private Integer crazy_walls_weekly_play;
                    }
                }
            }

            
            
            public static class SupersmashSoloWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SupersmashSoloKillsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer supersmash_solo_kills;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SupersmashTeamWinBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SupersmashTeamKillsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer supersmash_team_kills;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SupersmashWeeklyKillsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer supersmash_weekly_kills;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class NormalBrawlerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class InsaneBrawlerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class HuntingSeasonBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class UhcAddictBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class UhcMadnessBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer kill;
                    }
                }
            }

            
            
            public static class WallsDailyPlayBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class WallsDailyKillBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer walls_daily_kill;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class WallsWeeklyBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer walls_weekly_kills;
                        private Integer walls_weekly_play;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class WallsDailyWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class ArcadeGamerBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer play;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class ArcadeWinnerBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class ArcadeSpecialistBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer play;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkyclashPlayGamesBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer play;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkyclashKillsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer kill;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkyclashPlayPointsBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkyclashVoidBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer skyclash_enderchests;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkyclashWeeklyKillsBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class UhcTeamBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer uhc_games;
                    }
                }
            }

            
            
            public static class UhcSoloBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class UhcDmBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class UhcWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class BedwarsDailyWinBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class BedwarsDailyOneMoreBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class BedwarsWeeklyBedElimsBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsArcadeWinBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class SkywarsWeeklyArcadeWinAllBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class SkywarsMegaDoublesWinsBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class SkywarsDailyTokensBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsWeeklyFreeLootChestBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsWeeklyHardChestBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private Long started;
                    private ObjectivesBean objectives;

                    
                    
                    public static class ObjectivesBean {
                        private Integer skywars_weekly_hard_loot_chest;
                    }
                }
            }

            
            
            public static class SkywarsCorruptWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class PrototypePitDailyKillsBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer kill;
                    }
                }
            }

            
            
            public static class PrototypePitDailyContractBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class PrototypePitWeeklyGoldBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer prototype_pit_weekly_gold;
                    }
                }
            }

            
            
            public static class BlitzGameOfTheDayBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class BlitzWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class BlitzLootChestDailyBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer lootchestblitz;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class BlitzKillsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer killblitz10;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class BlitzWeeklyMasterBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer killblitz10;
                        private Integer blitz_games_played;
                        private Integer winblitz;
                    }
                }
            }

            
            
            public static class BlitzLootChestWeeklyBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer lootchestblitz;
                        private Integer dealdamageblitz;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class DuelsPlayerBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer play;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class DuelsKillerBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer kill;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class DuelsWinnerBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class DuelsWeeklyWinsBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class DuelsWeeklyKillsBean {
                private List<CompletionsBean> completions;

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsHalloweenHarvest2021Bean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer skywars_halloween_kills;
                    }
                }
            }

            
            
            public static class BedwarsWeeklyDreamWinBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer bedwars_dream_wins;
                    }
                }
            }

            
            
            public static class BedwarsDailyNightmaresBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer bedwars_daily_nightmare_beds;
                    }
                }
            }

            
            
            public static class BedwarsWeeklyPumpkinatorBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer bedwars_special_weekly_pumpkinator;
                    }
                }
            }

            
            
            public static class TntDailyWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class TntWeeklyPlayBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer tnt_weekly_play;
                    }
                }
            }

            
            
            public static class TntBowspleefDailyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class TntTnttagDailyBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer tnt_tnttag_daily;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class TntTnttagWeeklyBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer tnt_tnttag_weekly;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class TntWizardsDailyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class TntBowspleefWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class TntWizardsWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class TntPvprunWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class TntTntrunDailyBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer tnt_tntrun_daily;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class TntTntrunWeeklyBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer tnt_tntrun_weekly;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class TntPvprunDailyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class MmDailyTargetKillBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class MmDailyWinBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class MmDailyInfectorBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class MmWeeklyWinsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer mm_weekly_win;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class MmDailyPowerPlayBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class MmWeeklyMurdererKillsBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer mm_weekly_kills_as_murderer;
                    }
                }
            }

            
            
            public static class BuildBattleWinnerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class BuildBattlePlayerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer play;
                    }
                }
            }

            
            
            public static class BuildBattleWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer play;
                    }
                }
            }

            
            
            public static class BedwarsWeeklyChallengesBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class BedwarsDailyGiftsBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer bedwars_daily_special_christmas_gifts;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class SkywarsSpecialNorthPoleBean {
                private List<CompletionsBean> completions;
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                        private Integer skywars_special_gifts;
                    }
                }

                
                
                public static class CompletionsBean {
                    private Long time;
                }
            }

            
            
            public static class QuakeDailyPlayBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class QuakeDailyWinBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class QuakeDailyKillBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class GingerbreadBlingBlingBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class VampirezWeeklyKillBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class GingerbreadMapsBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class VampirezWeeklyWinBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class QuakeWeeklyPlayBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class VampirezDailyWinBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class PaintballExpertBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class GingerbreadMasteryBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class PaintballerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class VampirezDailyHumanKillBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class ArenaDailyPlayBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class GingerbreadRacerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class VampirezWeeklyHumanKillBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class VampirezDailyKillBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class PaintballKillerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class VampirezDailyPlayBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class ArenaDailyWinsBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class ArenaWeeklyPlayBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class ArenaDailyKillsBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class MmSpecialWeeklySantaBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class BuildBattleChristmasBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class BuildBattleChristmasWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class SoloBrawlerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class TeamBrawlerBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class UhcWeeklySpecialCookieBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class TntWeeklySpecialBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class CvcKillDailyNormalBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class CvcWinDailyNormalBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class CvcKillBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class CvcWinDailyDeathmatchBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }

            
            
            public static class CvcKillWeeklyBean {
                private ActiveBean active;

                
                
                public static class ActiveBean {
                    private ObjectivesBean objectives;
                    private Long started;

                    
                    
                    public static class ObjectivesBean {
                    }
                }
            }
        }

        
        
        public static class EugeneBean {
            private Long dailyTwoKExp;
        }

        
        
        public static class HousingMetaBean {
            private List<String> allowedBlocks;
            private String tutorialStep;
            private List<String> packages;
            private String playlist;
            private List<String> given_cookies_104971;
            private List<String> given_cookies_105140;
            private PlayerSettingsBean playerSettings;
            private List<String> given_cookies_105141;
            private List<String> given_cookies_105144;
            private List<String> given_cookies_105093;
            private List<String> given_cookies_105150;
            private List<String> given_cookies_105152;
            private List<String> given_cookies_105158;

            
            
            public static class PlayerSettingsBean {
                @SerializedName("VISIBILITY")
                private String vISIBILITY;
            }
        }

        
        
        public static class PetConsumablesBean {
            @SerializedName("WATER_BUCKET")
            private Integer wATER_BUCKET;
            @SerializedName("MELON")
            private Integer mELON;
            @SerializedName("WOOD_SWORD")
            private Integer wOOD_SWORD;
            @SerializedName("MUSHROOM_SOUP")
            private Integer mUSHROOM_SOUP;
            @SerializedName("MILK_BUCKET")
            private Integer mILK_BUCKET;
            @SerializedName("GOLD_RECORD")
            private Integer gOLD_RECORD;
            @SerializedName("LAVA_BUCKET")
            private Integer lAVA_BUCKET;
            @SerializedName("BONE")
            private Integer bONE;
            @SerializedName("SLIME_BALL")
            private Integer sLIME_BALL;
            @SerializedName("APPLE")
            private Integer aPPLE;
            @SerializedName("RAW_FISH")
            private Integer rAW_FISH;
            @SerializedName("CARROT_ITEM")
            private Integer cARROT_ITEM;
            @SerializedName("BAKED_POTATO")
            private Integer bAKED_POTATO;
            @SerializedName("BREAD")
            private Integer bREAD;
            @SerializedName("RED_ROSE")
            private Integer rED_ROSE;
            @SerializedName("CAKE")
            private Integer cAKE;
            @SerializedName("STICK")
            private Integer sTICK;
            @SerializedName("PORK")
            private Integer pORK;
            @SerializedName("LEASH")
            private Integer lEASH;
            @SerializedName("FEATHER")
            private Integer fEATHER;
            @SerializedName("COOKED_BEEF")
            private Integer cOOKED_BEEF;
            @SerializedName("MAGMA_CREAM")
            private Integer mAGMA_CREAM;
            @SerializedName("WHEAT")
            private Integer wHEAT;
            @SerializedName("HAY_BLOCK")
            private Integer hAY_BLOCK;
            @SerializedName("PUMPKIN_PIE")
            private Integer pUMPKIN_PIE;
            @SerializedName("COOKIE")
            private Integer cOOKIE;
            @SerializedName("ROTTEN_FLESH")
            private Integer rOTTEN_FLESH;
        }

        
        
        public static class VanityMetaBean {
            private List<String> packages;
        }

        
        
        public static class ParkourCompletionsBean {
            @SerializedName("Skywars")
            private List<SkywarsBean> skywars;
            @SerializedName("CopsnCrims")
            private List<CopsnCrimsBean> copsnCrims;
            @SerializedName("BlitzLobby")
            private List<BlitzLobbyBean> blitzLobby;
            @SerializedName("TheWallsLobby")
            private List<TheWallsLobbyBean> theWallsLobby;
            @SerializedName("QuakeCraft")
            private List<QuakeCraftBean> quakeCraft;
            @SerializedName("TNT")
            private List<TNTBean> tNT;
            @SerializedName("SuperSmash")
            private List<SuperSmashBean> superSmash;
            @SerializedName("SkyClash")
            private List<SkyClashBean> skyClash;

            
            
            public static class SkywarsBean {
                private Long timeStart;
                private Integer timeTook;
            }

            
            
            public static class CopsnCrimsBean {
                private Long timeStart;
                private Integer timeTook;
            }

            
            
            public static class BlitzLobbyBean {
                private Long timeStart;
                private Integer timeTook;
            }

            
            
            public static class TheWallsLobbyBean {
                private Long timeStart;
                private Integer timeTook;
            }

            
            
            public static class QuakeCraftBean {
                private Long timeStart;
                private Integer timeTook;
            }

            
            
            public static class TNTBean {
                private Long timeStart;
                private Integer timeTook;
            }

            
            
            public static class SuperSmashBean {
                private Long timeStart;
                private Integer timeTook;
            }

            
            
            public static class SkyClashBean {
                private Long timeStart;
                private Integer timeTook;
            }
        }

        
        
        public static class PetStatsBean {
            @SerializedName("SHEEP_BLACK_BABY")
            private SHEEPBLACKBABYBean sHEEP_BLACK_BABY;
            @SerializedName("VILLAGER_BLACKSMITH_BABY")
            private VILLAGERBLACKSMITHBABYBean vILLAGER_BLACKSMITH_BABY;
            @SerializedName("PIG")
            private PIGBean pIG;
            @SerializedName("SNOWMAN")
            private SNOWMANBean sNOWMAN;
            @SerializedName("BAT")
            private BATBean bAT;
            @SerializedName("WILD_OCELOT")
            private WILDOCELOTBean wILD_OCELOT;
            @SerializedName("CHICKEN_BABY")
            private CHICKENBABYBean cHICKEN_BABY;
            @SerializedName("ENDERMITE")
            private ENDERMITEBean eNDERMITE;
            @SerializedName("SKELETON")
            private SKELETONBean sKELETON;
            @SerializedName("CREEPER")
            private CREEPERBean cREEPER;
            @SerializedName("MOOSHROOM_BABY")
            private MOOSHROOMBABYBean mOOSHROOM_BABY;
            @SerializedName("BLACK_RABBIT")
            private BLACKRABBITBean bLACK_RABBIT;
            @SerializedName("CREEPER_POWERED")
            private CREEPERPOWEREDBean cREEPER_POWERED;
            @SerializedName("SHEEP_RAINBOW")
            private SHEEPRAINBOWBean sHEEP_RAINBOW;

            
            
            public static class SHEEPBLACKBABYBean {
                private String name;
            }

            
            
            public static class VILLAGERBLACKSMITHBABYBean {
                private String name;
            }

            
            
            public static class PIGBean {
                private String name;
            }

            
            
            public static class SNOWMANBean {
                private String name;
            }

            
            
            public static class BATBean {
                private String name;
            }

            
            
            public static class WILDOCELOTBean {
                private String name;
            }

            
            
            public static class CHICKENBABYBean {
                private String name;
            }

            
            
            public static class ENDERMITEBean {
                private String name;
            }

            
            
            public static class SKELETONBean {
                private String name;
            }

            
            
            public static class CREEPERBean {
                private String name;
            }

            
            
            public static class MOOSHROOMBABYBean {
                private String name;
            }

            
            
            public static class BLACKRABBITBean {
                private String name;
            }

            
            
            public static class CREEPERPOWEREDBean {
                @SerializedName("THIRST")
                private THIRSTBean tHIRST;
                @SerializedName("EXERCISE")
                private EXERCISEBean eXERCISE;
                @SerializedName("HUNGER")
                private HUNGERBean hUNGER;

                
                
                public static class THIRSTBean {
                    private Long timestamp;
                    private Integer value;
                }

                
                
                public static class EXERCISEBean {
                    private Integer value;
                    private Long timestamp;
                }

                
                
                public static class HUNGERBean {
                    private Integer value;
                    private Long timestamp;
                }
            }

            
            
            public static class SHEEPRAINBOWBean {
                @SerializedName("HUNGER")
                private HUNGERBean hUNGER;
                private String name;

                
                
                public static class HUNGERBean {
                    private Long timestamp;
                    private Integer value;
                }
            }
        }

        
        
        public static class VotingBean {
            private Integer total;
            private Integer total_mcsorg;
            private Integer secondary_mcsorg;
            private Long last_mcsorg;
            private Long last_vote;
            private Integer votesToday;
        }

        
        
        public static class GiftingMetaBean {
            private Integer realBundlesReceived;
            private Integer bundlesReceived;
        }

        
        
        public static class AchievementRewardsNewBean {
            private Long for_points_700;
            private Long for_points_900;
            private Long for_points_1200;
            private Long for_points_1400;
            private Long for_points_1600;
            private Long for_points_1000;
            private Long for_points_800;
            private Long for_points_1100;
            private Long for_points_1300;
            private Long for_points_1500;
            private Long for_points_1700;
            private Long for_points_1800;
            private Long for_points_1900;
            private Long for_points_2000;
            private Long for_points_2100;
            private Long for_points_2200;
            private Long for_points_500;
            private Long for_points_600;
            private Long for_points_200;
            private Long for_points_400;
            private Long for_points_300;
            private Long for_points_2300;
            private Long for_points_2400;
            private Long for_points_2500;
            private Long for_points_2600;
            private Long for_points_2700;
            private Long for_points_2800;
            private Long for_points_2900;
            private Long for_points_3000;
            private Long for_points_3100;
            private Long for_points_3200;
            private Long for_points_3300;
            private Long for_points_3400;
            private Long for_points_3500;
        }

        
        
        public static class AchievementSyncBean {
            private Integer quake_tiered;
        }

        
        
        public static class ChallengesBean {
            private AllTimeBean all_time;
            private DayJBean day_j;
            private DayKBean day_k;
            private DayLBean day_l;
            private DayABean day_a;

            
            
            public static class AllTimeBean {
                @SerializedName("SKYWARS__rush_challenge")
                private Integer sKYWARS__rush_challenge;
                @SerializedName("SKYWARS__feeding_the_void_challenge")
                private Integer sKYWARS__feeding_the_void_challenge;
                @SerializedName("MURDER_MYSTERY__hero")
                private Integer mURDER_MYSTERY__hero;
                @SerializedName("ARCADE__zombies_challenge")
                private Integer aRCADE__zombies_challenge;
                @SerializedName("ARCADE__hypixel_says_challenge")
                private Integer aRCADE__hypixel_says_challenge;
                @SerializedName("TNTGAMES__tnt_tag_challenge")
                private Integer tNTGAMES__tnt_tag_challenge;
                @SerializedName("WALLS__powerhouse_challenge")
                private Integer wALLS__powerhouse_challenge;
                @SerializedName("WALLS__looting_challenge")
                private Integer wALLS__looting_challenge;
                @SerializedName("SURVIVAL_GAMES__resistance_challenge")
                private Integer sURVIVAL_GAMES__resistance_challenge;
                @SerializedName("WALLS__first_blood_challenge")
                private Integer wALLS__first_blood_challenge;
                @SerializedName("SKYWARS__enderman_challenge")
                private Integer sKYWARS__enderman_challenge;
                @SerializedName("BUILD_BATTLE__top_3_challenge")
                private Integer bUILD_BATTLE__top_3_challenge;
                @SerializedName("BEDWARS__support")
                private Integer bEDWARS__support;
                @SerializedName("DUELS__teams_challenge")
                private Integer dUELS__teams_challenge;
                @SerializedName("DUELS__feed_the_void_challenge")
                private Integer dUELS__feed_the_void_challenge;
                @SerializedName("MURDER_MYSTERY__murder_spree")
                private Integer mURDER_MYSTERY__murder_spree;
                @SerializedName("ARCADE__party_games_challenge")
                private Integer aRCADE__party_games_challenge;
                @SerializedName("BEDWARS__offensive")
                private Integer bEDWARS__offensive;
                @SerializedName("ARCADE__creeper_attack_challenge")
                private Integer aRCADE__creeper_attack_challenge;
                @SerializedName("MURDER_MYSTERY__sherlock")
                private Integer mURDER_MYSTERY__sherlock;
            }

            
            
            public static class DayJBean {
                @SerializedName("ARCADE__creeper_attack_challenge")
                private Integer aRCADE__creeper_attack_challenge;
            }

            
            
            public static class DayKBean {
                @SerializedName("BEDWARS__support")
                private Integer bEDWARS__support;
                @SerializedName("BEDWARS__offensive")
                private Integer bEDWARS__offensive;
                @SerializedName("ARCADE__hypixel_says_challenge")
                private Integer aRCADE__hypixel_says_challenge;
            }

            
            
            public static class DayLBean {
                @SerializedName("MURDER_MYSTERY__murder_spree")
                private Integer mURDER_MYSTERY__murder_spree;
                @SerializedName("MURDER_MYSTERY__hero")
                private Integer mURDER_MYSTERY__hero;
                @SerializedName("MURDER_MYSTERY__sherlock")
                private Integer mURDER_MYSTERY__sherlock;
            }

            
            
            public static class DayABean {
                @SerializedName("DUELS__feed_the_void_challenge")
                private Integer dUELS__feed_the_void_challenge;
            }
        }

        
        
        public static class MonthlycratesBean {
            @SerializedName("1-2017")
            private _$12017Bean _$12017;
            @SerializedName("1-2019")
            private _$12019Bean _$12019;
            @SerializedName("10-2016")
            private _$102016Bean _$102016;
            @SerializedName("10-2017")
            private _$102017Bean _$102017;
            @SerializedName("11-2016")
            private _$112016Bean _$112016;
            @SerializedName("11-2018")
            private _$112018Bean _$112018;
            @SerializedName("12-2016")
            private _$122016Bean _$122016;
            @SerializedName("12-2018")
            private _$122018Bean _$122018;
            @SerializedName("2-2017")
            private _$22017Bean _$22017;
            @SerializedName("3-2017")
            private _$32017Bean _$32017;
            @SerializedName("4-2017")
            private _$42017Bean _$42017;
            @SerializedName("5-2017")
            private _$52017Bean _$52017;
            @SerializedName("6-2017")
            private _$62017Bean _$62017;
            @SerializedName("6-2018")
            private _$62018Bean _$62018;
            @SerializedName("6-2019")
            private _$62019Bean _$62019;
            @SerializedName("7-2016")
            private _$72016Bean _$72016;
            @SerializedName("7-2017")
            private _$72017Bean _$72017;
            @SerializedName("7-2018")
            private _$72018Bean _$72018;
            @SerializedName("7-2019")
            private _$72019Bean _$72019;
            @SerializedName("8-2016")
            private _$82016Bean _$82016;
            @SerializedName("8-2017")
            private _$82017Bean _$82017;
            @SerializedName("8-2018")
            private _$82018Bean _$82018;
            @SerializedName("8-2019")
            private _$82019Bean _$82019;
            @SerializedName("9-2017")
            private _$92017Bean _$92017;
            @SerializedName("9-2018")
            private _$92018Bean _$92018;
            @SerializedName("11-2019")
            private _$112019Bean _$112019;
            @SerializedName("12-2019")
            private _$122019Bean _$122019;
            @SerializedName("1-2020")
            private _$12020Bean _$12020;
            @SerializedName("2-2020")
            private _$22020Bean _$22020;
            @SerializedName("4-2020")
            private _$42020Bean _$42020;
            @SerializedName("7-2020")
            private _$72020Bean _$72020;
            @SerializedName("2-2021")
            private _$22021Bean _$22021;
            @SerializedName("5-2021")
            private _$52021Bean _$52021;
            @SerializedName("7-2021")
            private _$72021Bean _$72021;
            @SerializedName("8-2021")
            private _$82021Bean _$82021;
            @SerializedName("10-2021")
            private _$102021Bean _$102021;
            @SerializedName("11-2021")
            private _$112021Bean _$112021;
            @SerializedName("12-2021")
            private _$122021Bean _$122021;
            @SerializedName("1-2022")
            private _$12022Bean _$12022;
            @SerializedName("2-2022")
            private _$22022Bean _$22022;
            @SerializedName("3-2022")
            private _$32022Bean _$32022;
            @SerializedName("4-2022")
            private _$42022Bean _$42022;

            
            
            public static class _$12017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$12019Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$102016Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$102017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$112016Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$112018Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$122016Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$122018Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$22017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$32017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$42017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$52017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$62017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$62018Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$62019Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$72016Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$72017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$72018Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$72019Bean {
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$82016Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$82017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$82018Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$82019Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$92017Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$92018Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$112019Bean {
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$122019Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$12020Bean {
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$22020Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$42020Bean {
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$72020Bean {
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
            }

            
            
            public static class _$22021Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$52021Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$72021Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$82021Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$102021Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
            }

            
            
            public static class _$112021Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("MVP_PLUS")
                private Boolean mVP_PLUS;
            }

            
            
            public static class _$122021Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("MVP_PLUS")
                private Boolean mVP_PLUS;
            }

            
            
            public static class _$12022Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("MVP_PLUS")
                private Boolean mVP_PLUS;
            }

            
            
            public static class _$22022Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("MVP_PLUS")
                private Boolean mVP_PLUS;
            }

            
            
            public static class _$32022Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("MVP_PLUS")
                private Boolean mVP_PLUS;
            }

            
            
            public static class _$42022Bean {
                @SerializedName("REGULAR")
                private Boolean rEGULAR;
                @SerializedName("VIP")
                private Boolean vIP;
                @SerializedName("VIP_PLUS")
                private Boolean vIP_PLUS;
                @SerializedName("MVP")
                private Boolean mVP;
                @SerializedName("MVP_PLUS")
                private Boolean mVP_PLUS;
            }
        }

        
        
        public static class AdventRewards2019Bean {
            private Long day1;
            private Long day2;
            private Long day3;
        }

        
        
        public static class AdventRewardsV22018Bean {
            private Long day1;
        }

        
        
        public static class Summer2021CooldownsBean {
            @SerializedName("VIP_PLUS1")
            private Boolean vIP_PLUS1;
            @SerializedName("VIP_PLUS0")
            private Boolean vIP_PLUS0;
            @SerializedName("NORMAL0")
            private Boolean nORMAL0;
            @SerializedName("NORMAL1")
            private Boolean nORMAL1;
            @SerializedName("MVP0")
            private Boolean mVP0;
            @SerializedName("MVP1")
            private Boolean mVP1;
            @SerializedName("VIP0")
            private Boolean vIP0;
            @SerializedName("VIP1")
            private Boolean vIP1;
            @SerializedName("VIP2")
            private Boolean vIP2;
            @SerializedName("NORMAL2")
            private Boolean nORMAL2;
            @SerializedName("VIP_PLUS2")
            private Boolean vIP_PLUS2;
            @SerializedName("MVP2")
            private Boolean mVP2;
            @SerializedName("VIP_PLUS3")
            private Boolean vIP_PLUS3;
            @SerializedName("MVP3")
            private Boolean mVP3;
            @SerializedName("NORMAL3")
            private Boolean nORMAL3;
            @SerializedName("VIP3")
            private Boolean vIP3;
        }

        
        
        public static class Halloween2021CooldownsBean {
            @SerializedName("MVP0")
            private Boolean mVP0;
            @SerializedName("MVP1")
            private Boolean mVP1;
            @SerializedName("MVP2")
            private Boolean mVP2;
            @SerializedName("MVP3")
            private Boolean mVP3;
            @SerializedName("VIP0")
            private Boolean vIP0;
            @SerializedName("VIP3")
            private Boolean vIP3;
            @SerializedName("VIP2")
            private Boolean vIP2;
            @SerializedName("VIP1")
            private Boolean vIP1;
            @SerializedName("VIP_PLUS3")
            private Boolean vIP_PLUS3;
            @SerializedName("VIP_PLUS1")
            private Boolean vIP_PLUS1;
            @SerializedName("VIP_PLUS0")
            private Boolean vIP_PLUS0;
            @SerializedName("NORMAL0")
            private Boolean nORMAL0;
            @SerializedName("NORMAL1")
            private Boolean nORMAL1;
            @SerializedName("NORMAL3")
            private Boolean nORMAL3;
            @SerializedName("VIP_PLUS2")
            private Boolean vIP_PLUS2;
            @SerializedName("NORMAL2")
            private Boolean nORMAL2;
        }

        
        
        public static class AchievementTotemBean {
            private Boolean canCustomize;
            private Integer allowed_max_height;
            private List<String> unlockedParts;
            private SelectedPartsBean selectedParts;
            private List<String> unlockedColors;
            private SelectedColorsBean selectedColors;

            
            
            public static class SelectedPartsBean {
            }

            
            
            public static class SelectedColorsBean {
            }
        }

        
        
        public static class QuestSettingsBean {
            private Boolean autoActivate;
        }

        
        
        public static class SeasonalBean {
            private ChristmasBean christmas;
            private EasterBean easter;

            
            
            public static class ChristmasBean {
                @SerializedName("2021")
                private _$2021Bean _$2021;

                
                
                public static class _$2021Bean {
                    private AdventRewardsBean adventRewards;
                    private PresentsBean presents;

                    
                    
                    public static class AdventRewardsBean {
                        private Long day1;
                        private Long day2;
                        private Long day8;
                        private Long day13;
                        private Long day15;
                        private Long day17;
                        private Long day22;
                        private Long day24;
                        private Long day25;
                    }

                    
                    
                    public static class PresentsBean {
                        @SerializedName("SKYWARS_1")
                        private Boolean sKYWARS_1;
                        @SerializedName("HOUSING_1")
                        private Boolean hOUSING_1;
                        @SerializedName("HOUSING_2")
                        private Boolean hOUSING_2;
                        @SerializedName("BEDWARS_1")
                        private Boolean bEDWARS_1;
                        @SerializedName("MAIN_LOBBY_1")
                        private Boolean mAIN_LOBBY_1;
                        @SerializedName("SKYWARS_5")
                        private Boolean sKYWARS_5;
                        @SerializedName("BEDWARS_3")
                        private Boolean bEDWARS_3;
                        @SerializedName("BEDWARS_4")
                        private Boolean bEDWARS_4;
                        @SerializedName("BEDWARS_5")
                        private Boolean bEDWARS_5;
                    }
                }
            }

            
            
            public static class EasterBean {
                @SerializedName("2022")
                private _$2022Bean _$2022;

                
                
                public static class _$2022Bean {
                    private Integer duelsWinsAchievement;
                }
            }
        }
    }

    public PlayerBean getPlayer() {
        return player;
    }
}
