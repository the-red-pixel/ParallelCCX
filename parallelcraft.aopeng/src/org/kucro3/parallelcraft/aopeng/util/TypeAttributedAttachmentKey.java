package org.kucro3.parallelcraft.aopeng.util;

import javax.annotation.Nonnull;
import java.util.Objects;

public class TypeAttributedAttachmentKey<T> extends AttachmentKey<T> implements TypeAttributed {
    TypeAttributedAttachmentKey(Class<T> type)
    {
        this.type = type;
    }

    public static <T> AttachmentKey<T> create(@Nonnull Class<T> type)
    {
        return new TypeAttributedAttachmentKey<>(Objects.requireNonNull(type));
    }

    public @Nonnull Class<T> getType()
    {
        return type;
    }

    private final Class<T> type;
}
