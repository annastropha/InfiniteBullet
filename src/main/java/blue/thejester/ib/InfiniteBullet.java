package blue.thejester.ib;

import blusunrize.immersiveengineering.api.tool.BulletHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public class InfiniteBullet extends BulletHandler.DamagingBullet {

    private String name;

    public InfiniteBullet(String name, Function<Entity[], DamageSource> damageSourceGetter, float damage, ResourceLocation... textures) {
        super(damageSourceGetter, damage, BulletHandler.getBulletStack(name), textures);
        this.name = name;
    }

    public InfiniteBullet(String name, Function<Entity[], DamageSource> damageSourceGetter, float damage, boolean resetHurt, boolean setFire, ResourceLocation... textures) {
        super(damageSourceGetter, damage, resetHurt, setFire, BulletHandler.getBulletStack(name), textures);
        this.name = name;
    }
}
