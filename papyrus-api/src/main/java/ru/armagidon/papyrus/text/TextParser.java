package ru.armagidon.papyrus.text;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import ru.armagidon.papyrus.placeholder.PlaceholderContainer;
import ru.armagidon.papyrus.placeholder.PlaceholderContext;

import java.util.concurrent.CompletableFuture;

public interface TextParser
{
    @NotNull CompletableFuture<@NotNull Component> parse(@NotNull PlaceholderContext context, @NotNull Component input, @NotNull PlaceholderContainer container);

}
