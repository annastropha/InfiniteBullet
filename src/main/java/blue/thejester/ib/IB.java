package blue.thejester.ib;

import blusunrize.immersiveengineering.api.tool.BulletHandler;
import blusunrize.immersiveengineering.common.entities.EntityRevolvershot;
import blusunrize.immersiveengineering.common.util.IEDamageSources;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = IB.MODID, name = IB.NAME, version = IB.VERSION, dependencies = IB.DEPENDS)
public class IB
{
    public static final String MODID = "ib";
    public static final String NAME = "Infinite bullet";
    public static final String VERSION = "1.0";
    public static final String DEPENDS = "required-after:immersiveengineering;";

    public static Logger logger;

    @GameRegistry.ObjectHolder(value = "immersiveengineering:bullet")
    public static final Item IE_ITEM_BULLET = Items.APPLE;

    // The instance of your mod that Forge uses.  Optional.
    @Mod.Instance(IB.MODID)
    public static IB instance;
    public static ItemStack infiniteBullet;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        makeCasull((float) IBConfig.casull.bulletDamage_Casull_2, "tiered_casull_2");
        makeCasull(IBConfig.casull.bulletDamage_Casull_3, "tiered_casull_3");
        makeCasull(IBConfig.casull.bulletDamage_Casull_4, "tiered_casull_4");
        makeCasull(IBConfig.casull.bulletDamage_Casull_5, "tiered_casull_5");
        makeCasull(IBConfig.casull.bulletDamage_Casull_6, "tiered_casull_6");
        makeCasull(IBConfig.casull.bulletDamage_Casull_7, "tiered_casull_7");
        makeCasull(IBConfig.casull.bulletDamage_Casull_8, "tiered_casull_8");
        makeInfiniteCasull(IBConfig.casull.bulletDamage_Casull_i, "infinite_casull");
        makeAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_2, "tiered_ap_2");
        makeAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_3, "tiered_ap_3");
        makeAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_4, "tiered_ap_4");
        makeAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_5, "tiered_ap_5");
        makeAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_6, "tiered_ap_6");
        makeAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_7, "tiered_ap_7");
        makeAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_8, "tiered_ap_8");
        makeInfiniteAP(IBConfig.armorPiercing.bulletDamage_ArmorPiercing_i, "infinite_ap");
        makeBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_2, "tiered_buckshot_2");
        makeBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_3, "tiered_buckshot_3");
        makeBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_4, "tiered_buckshot_4");
        makeBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_5, "tiered_buckshot_5");
        makeBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_6, "tiered_buckshot_6");
        makeBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_7, "tiered_buckshot_7");
        makeBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_8, "tiered_buckshot_8");
        makeInfiniteBuckshot(IBConfig.buckshot.bulletDamage_Buckshot_i, "infinite_buckshot");

    }

    private void makeInfiniteCasull(float damage, String name) {
        BulletHandler.registerBullet(name, new InfiniteBullet(name, (entities) -> {
            return IEDamageSources.causeCasullDamage((EntityRevolvershot) entities[0], entities[1]);
        }, damage, new ResourceLocation(IB.MODID,  "items/" + name)));
    }

    private void makeInfiniteAP(float damage, String name) {
        BulletHandler.registerBullet(name, new InfiniteBullet(name, (entities) -> {
            return IEDamageSources.causePiercingDamage((EntityRevolvershot) entities[0], entities[1]);
        }, damage, new ResourceLocation(IB.MODID,  "items/" + name)));
    }

    private void makeInfiniteBuckshot(float damage, String name) {
        BulletHandler.registerBullet(name, new InfiniteBullet(name, (entities) -> {
            return IEDamageSources.causeBuckshotDamage((EntityRevolvershot)entities[0], entities[1]);
        }, damage, true, false, new ResourceLocation(IB.MODID,"items/"+name)) {
            public int getProjectileCount(EntityPlayer shooter) {
                return 10;
            }
        });
    }

    private void makeCasull(float damage, String name) {
        BulletHandler.registerBullet(name, new BulletHandler.DamagingBullet((entities) -> {
            return IEDamageSources.causeCasullDamage((EntityRevolvershot) entities[0], entities[1]);
        }, damage, BulletHandler.emptyCasing, new ResourceLocation(IB.MODID,  "items/" + name)));
    }

    private void makeAP(float damage, String name) {
        BulletHandler.registerBullet(name, new BulletHandler.DamagingBullet((entities) -> {
            return IEDamageSources.causePiercingDamage((EntityRevolvershot) entities[0], entities[1]);
        }, damage, BulletHandler.emptyCasing, new ResourceLocation(IB.MODID,  "items/" + name)));
    }

    private void makeBuckshot(float damage, String name) {
        BulletHandler.registerBullet(name, new BulletHandler.DamagingBullet((entities) -> {
            return IEDamageSources.causeBuckshotDamage((EntityRevolvershot)entities[0], entities[1]);
        }, damage, true, false, BulletHandler.emptyShell, new ResourceLocation(IB.MODID,"items/"+name)) {
            public int getProjectileCount(EntityPlayer shooter) {
                return 10;
            }
        });
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
