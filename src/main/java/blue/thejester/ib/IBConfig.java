package blue.thejester.ib;

import net.minecraftforge.common.config.Config;

@Config(modid=IB.MODID)
public class IBConfig {

    public static Casull casull = new Casull();
    public static ArmorPiercing armorPiercing = new ArmorPiercing();
    public static Buckshot buckshot = new Buckshot();

    public static class Casull {
        @Config.Comment({"The amount of base damage a Tier 2 Casull Cartridge inflicts"})
        public double bulletDamage_Casull_2 = 12f;

        @Config.Comment({"The amount of base damage a Tier 3 Casull Cartridge inflicts"})
        public float bulletDamage_Casull_3 = 14f;

        @Config.Comment({"The amount of base damage a Tier 4 Casull Cartridge inflicts"})
        public float bulletDamage_Casull_4 = 16f;

        @Config.Comment({"The amount of base damage a Tier 5 Casull Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Casull_5 = 18f;

        @Config.Comment({"The amount of base damage a Tier 6 Casull Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Casull_6 = 20f;

        @Config.Comment({"The amount of base damage a Tier 7 Casull Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Casull_7 = 22f;

        @Config.Comment({"The amount of base damage a Tier 8 Casull Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Casull_8 = 24f;

        @Config.Comment({"The amount of base damage an Infinite Casull Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Casull_i = 20f;
    }

    public static class ArmorPiercing {
        @Config.Comment({"The amount of base damage a Tier 2 Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_2 = 12f;

        @Config.Comment({"The amount of base damage a Tier 3 Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_3 = 14f;

        @Config.Comment({"The amount of base damage a Tier 4 Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_4 = 16f;

        @Config.Comment({"The amount of base damage a Tier 5 Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_5 = 18f;

        @Config.Comment({"The amount of base damage a Tier 6 Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_6 = 20f;

        @Config.Comment({"The amount of base damage a Tier 7 Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_7 = 22f;

        @Config.Comment({"The amount of base damage a Tier 8 Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_8 = 24f;

        @Config.Comment({"The amount of base damage an Infinite Armor Piercing Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_ArmorPiercing_i = 20f;
    }

    public static class Buckshot {
        @Config.Comment({"The amount of base damage a Tier 2 Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_2 = 2.5f;

        @Config.Comment({"The amount of base damage a Tier 3 Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_3 = 3f;

        @Config.Comment({"The amount of base damage a Tier 4 Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_4 = 3.5f;

        @Config.Comment({"The amount of base damage a Tier 5 Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_5 = 4f;

        @Config.Comment({"The amount of base damage a Tier 6 Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_6 = 4.5f;

        @Config.Comment({"The amount of base damage a Tier 7 Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_7 = 5f;

        @Config.Comment({"The amount of base damage a Tier 8 Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_8 = 5.5f;

        @Config.Comment({"The amount of base damage an Infinite Buckshot Cartridge inflicts"})
        @Config.RangeDouble(min = 0)
        public float bulletDamage_Buckshot_i = 4.5f;
    }
}
