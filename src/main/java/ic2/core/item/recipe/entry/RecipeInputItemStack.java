package ic2.core.item.recipe.entry;

import ic2.api.recipe.IRecipeInput;
import net.minecraft.item.ItemStack;

import java.util.List;

// dummy class so the api compiles
public class RecipeInputItemStack implements IRecipeInput {
    public RecipeInputItemStack(ItemStack stack){

    }

    @Override
    public boolean matches(ItemStack subject) {
        return false;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public List<ItemStack> getInputs() {
        return null;
    }
}
