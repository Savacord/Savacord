//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.javacord.api.listener;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.javacord.api.listener.audio.AudioSourceFinishedListener;
import org.javacord.api.listener.channel.server.ServerChannelChangeNameListener;
import org.javacord.api.listener.channel.server.ServerChannelChangeNsfwFlagListener;
import org.javacord.api.listener.channel.server.ServerChannelChangeOverwrittenPermissionsListener;
import org.javacord.api.listener.channel.server.ServerChannelChangePositionListener;
import org.javacord.api.listener.channel.server.ServerChannelCreateListener;
import org.javacord.api.listener.channel.server.ServerChannelDeleteListener;
import org.javacord.api.listener.channel.server.invite.ServerChannelInviteCreateListener;
import org.javacord.api.listener.channel.server.invite.ServerChannelInviteDeleteListener;
import org.javacord.api.listener.channel.server.text.ServerTextChannelChangeDefaultAutoArchiveDurationListener;
import org.javacord.api.listener.channel.server.text.ServerTextChannelChangeSlowmodeListener;
import org.javacord.api.listener.channel.server.text.ServerTextChannelChangeTopicListener;
import org.javacord.api.listener.channel.server.text.WebhooksUpdateListener;
import org.javacord.api.listener.channel.server.thread.ServerThreadChannelCreateListener;
import org.javacord.api.listener.channel.server.thread.ServerThreadChannelDeleteListener;
import org.javacord.api.listener.channel.server.thread.ServerThreadChannelMembersUpdateListener;
import org.javacord.api.listener.channel.server.thread.ServerThreadChannelUpdateListener;
import org.javacord.api.listener.channel.server.thread.ServerThreadListSyncListener;
import org.javacord.api.listener.channel.server.voice.ServerStageVoiceChannelChangeTopicListener;
import org.javacord.api.listener.channel.server.voice.ServerVoiceChannelChangeBitrateListener;
import org.javacord.api.listener.channel.server.voice.ServerVoiceChannelChangeNsfwListener;
import org.javacord.api.listener.channel.server.voice.ServerVoiceChannelChangeUserLimitListener;
import org.javacord.api.listener.channel.server.voice.ServerVoiceChannelMemberJoinListener;
import org.javacord.api.listener.channel.server.voice.ServerVoiceChannelMemberLeaveListener;
import org.javacord.api.listener.channel.user.PrivateChannelCreateListener;
import org.javacord.api.listener.channel.user.PrivateChannelDeleteListener;
import org.javacord.api.listener.connection.LostConnectionListener;
import org.javacord.api.listener.connection.ReconnectListener;
import org.javacord.api.listener.connection.ResumeListener;
import org.javacord.api.listener.interaction.AutocompleteCreateListener;
import org.javacord.api.listener.interaction.ButtonClickListener;
import org.javacord.api.listener.interaction.InteractionCreateListener;
import org.javacord.api.listener.interaction.MessageComponentCreateListener;
import org.javacord.api.listener.interaction.MessageContextMenuCommandListener;
import org.javacord.api.listener.interaction.ModalSubmitListener;
import org.javacord.api.listener.interaction.SelectMenuChooseListener;
import org.javacord.api.listener.interaction.SlashCommandCreateListener;
import org.javacord.api.listener.interaction.UserContextMenuCommandListener;
import org.javacord.api.listener.message.CachedMessagePinListener;
import org.javacord.api.listener.message.CachedMessageUnpinListener;
import org.javacord.api.listener.message.ChannelPinsUpdateListener;
import org.javacord.api.listener.message.MessageCreateListener;
import org.javacord.api.listener.message.MessageDeleteListener;
import org.javacord.api.listener.message.MessageEditListener;
import org.javacord.api.listener.message.MessageReplyListener;
import org.javacord.api.listener.message.reaction.ReactionAddListener;
import org.javacord.api.listener.message.reaction.ReactionRemoveAllListener;
import org.javacord.api.listener.message.reaction.ReactionRemoveListener;
import org.javacord.api.listener.server.ApplicationCommandPermissionsUpdateListener;
import org.javacord.api.listener.server.ServerBecomesAvailableListener;
import org.javacord.api.listener.server.ServerBecomesUnavailableListener;
import org.javacord.api.listener.server.ServerChangeAfkChannelListener;
import org.javacord.api.listener.server.ServerChangeAfkTimeoutListener;
import org.javacord.api.listener.server.ServerChangeBoostCountListener;
import org.javacord.api.listener.server.ServerChangeBoostLevelListener;
import org.javacord.api.listener.server.ServerChangeDefaultMessageNotificationLevelListener;
import org.javacord.api.listener.server.ServerChangeDescriptionListener;
import org.javacord.api.listener.server.ServerChangeDiscoverySplashListener;
import org.javacord.api.listener.server.ServerChangeExplicitContentFilterLevelListener;
import org.javacord.api.listener.server.ServerChangeIconListener;
import org.javacord.api.listener.server.ServerChangeModeratorsOnlyChannelListener;
import org.javacord.api.listener.server.ServerChangeMultiFactorAuthenticationLevelListener;
import org.javacord.api.listener.server.ServerChangeNameListener;
import org.javacord.api.listener.server.ServerChangeNsfwLevelListener;
import org.javacord.api.listener.server.ServerChangeOwnerListener;
import org.javacord.api.listener.server.ServerChangePreferredLocaleListener;
import org.javacord.api.listener.server.ServerChangeRegionListener;
import org.javacord.api.listener.server.ServerChangeRulesChannelListener;
import org.javacord.api.listener.server.ServerChangeServerFeatureListener;
import org.javacord.api.listener.server.ServerChangeSplashListener;
import org.javacord.api.listener.server.ServerChangeSystemChannelListener;
import org.javacord.api.listener.server.ServerChangeVanityUrlCodeListener;
import org.javacord.api.listener.server.ServerChangeVerificationLevelListener;
import org.javacord.api.listener.server.ServerJoinListener;
import org.javacord.api.listener.server.ServerLeaveListener;
import org.javacord.api.listener.server.VoiceServerUpdateListener;
import org.javacord.api.listener.server.VoiceStateUpdateListener;
import org.javacord.api.listener.server.emoji.KnownCustomEmojiChangeNameListener;
import org.javacord.api.listener.server.emoji.KnownCustomEmojiChangeWhitelistedRolesListener;
import org.javacord.api.listener.server.emoji.KnownCustomEmojiCreateListener;
import org.javacord.api.listener.server.emoji.KnownCustomEmojiDeleteListener;
import org.javacord.api.listener.server.member.ServerMemberBanListener;
import org.javacord.api.listener.server.member.ServerMemberJoinListener;
import org.javacord.api.listener.server.member.ServerMemberLeaveListener;
import org.javacord.api.listener.server.member.ServerMemberUnbanListener;
import org.javacord.api.listener.server.member.ServerMembersChunkListener;
import org.javacord.api.listener.server.role.RoleChangeColorListener;
import org.javacord.api.listener.server.role.RoleChangeHoistListener;
import org.javacord.api.listener.server.role.RoleChangeMentionableListener;
import org.javacord.api.listener.server.role.RoleChangeNameListener;
import org.javacord.api.listener.server.role.RoleChangePermissionsListener;
import org.javacord.api.listener.server.role.RoleChangePositionListener;
import org.javacord.api.listener.server.role.RoleCreateListener;
import org.javacord.api.listener.server.role.RoleDeleteListener;
import org.javacord.api.listener.server.role.UserRoleAddListener;
import org.javacord.api.listener.server.role.UserRoleRemoveListener;
import org.javacord.api.listener.server.sticker.StickerChangeDescriptionListener;
import org.javacord.api.listener.server.sticker.StickerChangeNameListener;
import org.javacord.api.listener.server.sticker.StickerChangeTagsListener;
import org.javacord.api.listener.server.sticker.StickerCreateListener;
import org.javacord.api.listener.server.sticker.StickerDeleteListener;
import org.javacord.api.listener.server.thread.ServerPrivateThreadJoinListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeArchiveTimestampListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeArchivedListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeAutoArchiveDurationListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeInvitableListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeLastMessageIdListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeLockedListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeMemberCountListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeMessageCountListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeRateLimitPerUserListener;
import org.javacord.api.listener.server.thread.ServerThreadChannelChangeTotalMessageSentListener;
import org.javacord.api.listener.user.UserChangeActivityListener;
import org.javacord.api.listener.user.UserChangeAvatarListener;
import org.javacord.api.listener.user.UserChangeDeafenedListener;
import org.javacord.api.listener.user.UserChangeDiscriminatorListener;
import org.javacord.api.listener.user.UserChangeMutedListener;
import org.javacord.api.listener.user.UserChangeNameListener;
import org.javacord.api.listener.user.UserChangeNicknameListener;
import org.javacord.api.listener.user.UserChangePendingListener;
import org.javacord.api.listener.user.UserChangeSelfDeafenedListener;
import org.javacord.api.listener.user.UserChangeSelfMutedListener;
import org.javacord.api.listener.user.UserChangeServerAvatarListener;
import org.javacord.api.listener.user.UserChangeStatusListener;
import org.javacord.api.listener.user.UserChangeTimeoutListener;
import org.javacord.api.listener.user.UserStartTypingListener;
import org.javacord.api.util.event.ListenerManager;

public interface GloballyAttachableListenerManager {
    default ListenerManager<InteractionCreateListener> addInteractionCreateListener(InteractionCreateListener listener) {
        return this.addListener(InteractionCreateListener.class, listener);
    }

    default List<InteractionCreateListener> getInteractionCreateListeners() {
        return this.getListeners(InteractionCreateListener.class);
    }

    default ListenerManager<SlashCommandCreateListener> addSlashCommandCreateListener(SlashCommandCreateListener listener) {
        return this.addListener(SlashCommandCreateListener.class, listener);
    }

    default List<SlashCommandCreateListener> getSlashCommandCreateListeners() {
        return this.getListeners(SlashCommandCreateListener.class);
    }

    default ListenerManager<AutocompleteCreateListener> addAutocompleteCreateListener(AutocompleteCreateListener listener) {
        return this.addListener(AutocompleteCreateListener.class, listener);
    }

    default List<AutocompleteCreateListener> getAutocompleteCreateListeners() {
        return this.getListeners(AutocompleteCreateListener.class);
    }

    default ListenerManager<ModalSubmitListener> addModalSubmitListener(ModalSubmitListener listener) {
        return this.addListener(ModalSubmitListener.class, listener);
    }

    default List<ModalSubmitListener> getModalSubmitListeners() {
        return this.getListeners(ModalSubmitListener.class);
    }

    default ListenerManager<MessageContextMenuCommandListener> addMessageContextMenuCommandListener(MessageContextMenuCommandListener listener) {
        return this.addListener(MessageContextMenuCommandListener.class, listener);
    }

    default List<MessageContextMenuCommandListener> getMessageContextMenuCommandListeners() {
        return this.getListeners(MessageContextMenuCommandListener.class);
    }

    default ListenerManager<MessageComponentCreateListener> addMessageComponentCreateListener(MessageComponentCreateListener listener) {
        return this.addListener(MessageComponentCreateListener.class, listener);
    }

    default List<MessageComponentCreateListener> getMessageComponentCreateListeners() {
        return this.getListeners(MessageComponentCreateListener.class);
    }

    default ListenerManager<UserContextMenuCommandListener> addUserContextMenuCommandListener(UserContextMenuCommandListener listener) {
        return this.addListener(UserContextMenuCommandListener.class, listener);
    }

    default List<UserContextMenuCommandListener> getUserContextMenuCommandListeners() {
        return this.getListeners(UserContextMenuCommandListener.class);
    }

    default ListenerManager<SelectMenuChooseListener> addSelectMenuChooseListener(SelectMenuChooseListener listener) {
        return this.addListener(SelectMenuChooseListener.class, listener);
    }

    default List<SelectMenuChooseListener> getSelectMenuChooseListeners() {
        return this.getListeners(SelectMenuChooseListener.class);
    }

    default ListenerManager<ButtonClickListener> addButtonClickListener(ButtonClickListener listener) {
        return this.addListener(ButtonClickListener.class, listener);
    }

    default List<ButtonClickListener> getButtonClickListeners() {
        return this.getListeners(ButtonClickListener.class);
    }

    default ListenerManager<ServerChangeIconListener> addServerChangeIconListener(ServerChangeIconListener listener) {
        return this.addListener(ServerChangeIconListener.class, listener);
    }

    default List<ServerChangeIconListener> getServerChangeIconListeners() {
        return this.getListeners(ServerChangeIconListener.class);
    }

    default ListenerManager<ServerChangeNameListener> addServerChangeNameListener(ServerChangeNameListener listener) {
        return this.addListener(ServerChangeNameListener.class, listener);
    }

    default List<ServerChangeNameListener> getServerChangeNameListeners() {
        return this.getListeners(ServerChangeNameListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeLastMessageIdListener> addServerThreadChannelChangeLastMessageIdListener(ServerThreadChannelChangeLastMessageIdListener listener) {
        return this.addListener(ServerThreadChannelChangeLastMessageIdListener.class, listener);
    }

    default List<ServerThreadChannelChangeLastMessageIdListener> getServerThreadChannelChangeLastMessageIdListeners() {
        return this.getListeners(ServerThreadChannelChangeLastMessageIdListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeArchivedListener> addServerThreadChannelChangeArchivedListener(ServerThreadChannelChangeArchivedListener listener) {
        return this.addListener(ServerThreadChannelChangeArchivedListener.class, listener);
    }

    default List<ServerThreadChannelChangeArchivedListener> getServerThreadChannelChangeArchivedListeners() {
        return this.getListeners(ServerThreadChannelChangeArchivedListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeMemberCountListener> addServerThreadChannelChangeMemberCountListener(ServerThreadChannelChangeMemberCountListener listener) {
        return this.addListener(ServerThreadChannelChangeMemberCountListener.class, listener);
    }

    default List<ServerThreadChannelChangeMemberCountListener> getServerThreadChannelChangeMemberCountListeners() {
        return this.getListeners(ServerThreadChannelChangeMemberCountListener.class);
    }

    default ListenerManager<ServerPrivateThreadJoinListener> addServerPrivateThreadJoinListener(ServerPrivateThreadJoinListener listener) {
        return this.addListener(ServerPrivateThreadJoinListener.class, listener);
    }

    default List<ServerPrivateThreadJoinListener> getServerPrivateThreadJoinListeners() {
        return this.getListeners(ServerPrivateThreadJoinListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeInvitableListener> addServerThreadChannelChangeInvitableListener(ServerThreadChannelChangeInvitableListener listener) {
        return this.addListener(ServerThreadChannelChangeInvitableListener.class, listener);
    }

    default List<ServerThreadChannelChangeInvitableListener> getServerThreadChannelChangeInvitableListeners() {
        return this.getListeners(ServerThreadChannelChangeInvitableListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeAutoArchiveDurationListener> addServerThreadChannelChangeAutoArchiveDurationListener(ServerThreadChannelChangeAutoArchiveDurationListener listener) {
        return this.addListener(ServerThreadChannelChangeAutoArchiveDurationListener.class, listener);
    }

    default List<ServerThreadChannelChangeAutoArchiveDurationListener> getServerThreadChannelChangeAutoArchiveDurationListeners() {
        return this.getListeners(ServerThreadChannelChangeAutoArchiveDurationListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeRateLimitPerUserListener> addServerThreadChannelChangeRateLimitPerUserListener(ServerThreadChannelChangeRateLimitPerUserListener listener) {
        return this.addListener(ServerThreadChannelChangeRateLimitPerUserListener.class, listener);
    }

    default List<ServerThreadChannelChangeRateLimitPerUserListener> getServerThreadChannelChangeRateLimitPerUserListeners() {
        return this.getListeners(ServerThreadChannelChangeRateLimitPerUserListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeLockedListener> addServerThreadChannelChangeLockedListener(ServerThreadChannelChangeLockedListener listener) {
        return this.addListener(ServerThreadChannelChangeLockedListener.class, listener);
    }

    default List<ServerThreadChannelChangeLockedListener> getServerThreadChannelChangeLockedListeners() {
        return this.getListeners(ServerThreadChannelChangeLockedListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeArchiveTimestampListener> addServerThreadChannelChangeArchiveTimestampListener(ServerThreadChannelChangeArchiveTimestampListener listener) {
        return this.addListener(ServerThreadChannelChangeArchiveTimestampListener.class, listener);
    }

    default List<ServerThreadChannelChangeArchiveTimestampListener> getServerThreadChannelChangeArchiveTimestampListeners() {
        return this.getListeners(ServerThreadChannelChangeArchiveTimestampListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeTotalMessageSentListener> addServerThreadChannelChangeTotalMessageSentListener(ServerThreadChannelChangeTotalMessageSentListener listener) {
        return this.addListener(ServerThreadChannelChangeTotalMessageSentListener.class, listener);
    }

    default List<ServerThreadChannelChangeTotalMessageSentListener> getServerThreadChannelChangeTotalMessageSentListeners() {
        return this.getListeners(ServerThreadChannelChangeTotalMessageSentListener.class);
    }

    default ListenerManager<ServerThreadChannelChangeMessageCountListener> addServerThreadChannelChangeMessageCountListener(ServerThreadChannelChangeMessageCountListener listener) {
        return this.addListener(ServerThreadChannelChangeMessageCountListener.class, listener);
    }

    default List<ServerThreadChannelChangeMessageCountListener> getServerThreadChannelChangeMessageCountListeners() {
        return this.getListeners(ServerThreadChannelChangeMessageCountListener.class);
    }

    default ListenerManager<ServerChangeAfkTimeoutListener> addServerChangeAfkTimeoutListener(ServerChangeAfkTimeoutListener listener) {
        return this.addListener(ServerChangeAfkTimeoutListener.class, listener);
    }

    default List<ServerChangeAfkTimeoutListener> getServerChangeAfkTimeoutListeners() {
        return this.getListeners(ServerChangeAfkTimeoutListener.class);
    }

    default ListenerManager<StickerChangeTagsListener> addStickerChangeTagsListener(StickerChangeTagsListener listener) {
        return this.addListener(StickerChangeTagsListener.class, listener);
    }

    default List<StickerChangeTagsListener> getStickerChangeTagsListeners() {
        return this.getListeners(StickerChangeTagsListener.class);
    }

    default ListenerManager<StickerChangeDescriptionListener> addStickerChangeDescriptionListener(StickerChangeDescriptionListener listener) {
        return this.addListener(StickerChangeDescriptionListener.class, listener);
    }

    default List<StickerChangeDescriptionListener> getStickerChangeDescriptionListeners() {
        return this.getListeners(StickerChangeDescriptionListener.class);
    }

    default ListenerManager<StickerCreateListener> addStickerCreateListener(StickerCreateListener listener) {
        return this.addListener(StickerCreateListener.class, listener);
    }

    default List<StickerCreateListener> getStickerCreateListeners() {
        return this.getListeners(StickerCreateListener.class);
    }

    default ListenerManager<StickerChangeNameListener> addStickerChangeNameListener(StickerChangeNameListener listener) {
        return this.addListener(StickerChangeNameListener.class, listener);
    }

    default List<StickerChangeNameListener> getStickerChangeNameListeners() {
        return this.getListeners(StickerChangeNameListener.class);
    }

    default ListenerManager<StickerDeleteListener> addStickerDeleteListener(StickerDeleteListener listener) {
        return this.addListener(StickerDeleteListener.class, listener);
    }

    default List<StickerDeleteListener> getStickerDeleteListeners() {
        return this.getListeners(StickerDeleteListener.class);
    }

    default ListenerManager<ServerChangeSplashListener> addServerChangeSplashListener(ServerChangeSplashListener listener) {
        return this.addListener(ServerChangeSplashListener.class, listener);
    }

    default List<ServerChangeSplashListener> getServerChangeSplashListeners() {
        return this.getListeners(ServerChangeSplashListener.class);
    }

    default ListenerManager<ServerChangeAfkChannelListener> addServerChangeAfkChannelListener(ServerChangeAfkChannelListener listener) {
        return this.addListener(ServerChangeAfkChannelListener.class, listener);
    }

    default List<ServerChangeAfkChannelListener> getServerChangeAfkChannelListeners() {
        return this.getListeners(ServerChangeAfkChannelListener.class);
    }

    default ListenerManager<VoiceStateUpdateListener> addVoiceStateUpdateListener(VoiceStateUpdateListener listener) {
        return this.addListener(VoiceStateUpdateListener.class, listener);
    }

    default List<VoiceStateUpdateListener> getVoiceStateUpdateListeners() {
        return this.getListeners(VoiceStateUpdateListener.class);
    }

    default ListenerManager<ServerChangeVanityUrlCodeListener> addServerChangeVanityUrlCodeListener(ServerChangeVanityUrlCodeListener listener) {
        return this.addListener(ServerChangeVanityUrlCodeListener.class, listener);
    }

    default List<ServerChangeVanityUrlCodeListener> getServerChangeVanityUrlCodeListeners() {
        return this.getListeners(ServerChangeVanityUrlCodeListener.class);
    }

    default ListenerManager<ServerChangeDiscoverySplashListener> addServerChangeDiscoverySplashListener(ServerChangeDiscoverySplashListener listener) {
        return this.addListener(ServerChangeDiscoverySplashListener.class, listener);
    }

    default List<ServerChangeDiscoverySplashListener> getServerChangeDiscoverySplashListeners() {
        return this.getListeners(ServerChangeDiscoverySplashListener.class);
    }

    default ListenerManager<ServerJoinListener> addServerJoinListener(ServerJoinListener listener) {
        return this.addListener(ServerJoinListener.class, listener);
    }

    default List<ServerJoinListener> getServerJoinListeners() {
        return this.getListeners(ServerJoinListener.class);
    }

    default ListenerManager<ApplicationCommandPermissionsUpdateListener> addApplicationCommandPermissionsUpdateListener(ApplicationCommandPermissionsUpdateListener listener) {
        return this.addListener(ApplicationCommandPermissionsUpdateListener.class, listener);
    }

    default List<ApplicationCommandPermissionsUpdateListener> getApplicationCommandPermissionsUpdateListeners() {
        return this.getListeners(ApplicationCommandPermissionsUpdateListener.class);
    }

    default ListenerManager<ServerBecomesUnavailableListener> addServerBecomesUnavailableListener(ServerBecomesUnavailableListener listener) {
        return this.addListener(ServerBecomesUnavailableListener.class, listener);
    }

    default List<ServerBecomesUnavailableListener> getServerBecomesUnavailableListeners() {
        return this.getListeners(ServerBecomesUnavailableListener.class);
    }

    default ListenerManager<VoiceServerUpdateListener> addVoiceServerUpdateListener(VoiceServerUpdateListener listener) {
        return this.addListener(VoiceServerUpdateListener.class, listener);
    }

    default List<VoiceServerUpdateListener> getVoiceServerUpdateListeners() {
        return this.getListeners(VoiceServerUpdateListener.class);
    }

    default ListenerManager<ServerChangeDescriptionListener> addServerChangeDescriptionListener(ServerChangeDescriptionListener listener) {
        return this.addListener(ServerChangeDescriptionListener.class, listener);
    }

    default List<ServerChangeDescriptionListener> getServerChangeDescriptionListeners() {
        return this.getListeners(ServerChangeDescriptionListener.class);
    }

    default ListenerManager<ServerChangeVerificationLevelListener> addServerChangeVerificationLevelListener(ServerChangeVerificationLevelListener listener) {
        return this.addListener(ServerChangeVerificationLevelListener.class, listener);
    }

    default List<ServerChangeVerificationLevelListener> getServerChangeVerificationLevelListeners() {
        return this.getListeners(ServerChangeVerificationLevelListener.class);
    }

    default ListenerManager<ServerLeaveListener> addServerLeaveListener(ServerLeaveListener listener) {
        return this.addListener(ServerLeaveListener.class, listener);
    }

    default List<ServerLeaveListener> getServerLeaveListeners() {
        return this.getListeners(ServerLeaveListener.class);
    }

    default ListenerManager<ServerChangeBoostCountListener> addServerChangeBoostCountListener(ServerChangeBoostCountListener listener) {
        return this.addListener(ServerChangeBoostCountListener.class, listener);
    }

    default List<ServerChangeBoostCountListener> getServerChangeBoostCountListeners() {
        return this.getListeners(ServerChangeBoostCountListener.class);
    }

    default ListenerManager<ServerBecomesAvailableListener> addServerBecomesAvailableListener(ServerBecomesAvailableListener listener) {
        return this.addListener(ServerBecomesAvailableListener.class, listener);
    }

    default List<ServerBecomesAvailableListener> getServerBecomesAvailableListeners() {
        return this.getListeners(ServerBecomesAvailableListener.class);
    }

    default ListenerManager<ServerChangeDefaultMessageNotificationLevelListener> addServerChangeDefaultMessageNotificationLevelListener(ServerChangeDefaultMessageNotificationLevelListener listener) {
        return this.addListener(ServerChangeDefaultMessageNotificationLevelListener.class, listener);
    }

    default List<ServerChangeDefaultMessageNotificationLevelListener> getServerChangeDefaultMessageNotificationLevelListeners() {
        return this.getListeners(ServerChangeDefaultMessageNotificationLevelListener.class);
    }

    default ListenerManager<ServerChangeRegionListener> addServerChangeRegionListener(ServerChangeRegionListener listener) {
        return this.addListener(ServerChangeRegionListener.class, listener);
    }

    default List<ServerChangeRegionListener> getServerChangeRegionListeners() {
        return this.getListeners(ServerChangeRegionListener.class);
    }

    default ListenerManager<ServerMemberJoinListener> addServerMemberJoinListener(ServerMemberJoinListener listener) {
        return this.addListener(ServerMemberJoinListener.class, listener);
    }

    default List<ServerMemberJoinListener> getServerMemberJoinListeners() {
        return this.getListeners(ServerMemberJoinListener.class);
    }

    default ListenerManager<ServerMemberLeaveListener> addServerMemberLeaveListener(ServerMemberLeaveListener listener) {
        return this.addListener(ServerMemberLeaveListener.class, listener);
    }

    default List<ServerMemberLeaveListener> getServerMemberLeaveListeners() {
        return this.getListeners(ServerMemberLeaveListener.class);
    }

    default ListenerManager<ServerMemberBanListener> addServerMemberBanListener(ServerMemberBanListener listener) {
        return this.addListener(ServerMemberBanListener.class, listener);
    }

    default List<ServerMemberBanListener> getServerMemberBanListeners() {
        return this.getListeners(ServerMemberBanListener.class);
    }

    default ListenerManager<ServerMembersChunkListener> addServerMembersChunkListener(ServerMembersChunkListener listener) {
        return this.addListener(ServerMembersChunkListener.class, listener);
    }

    default List<ServerMembersChunkListener> getServerMembersChunkListeners() {
        return this.getListeners(ServerMembersChunkListener.class);
    }

    default ListenerManager<ServerMemberUnbanListener> addServerMemberUnbanListener(ServerMemberUnbanListener listener) {
        return this.addListener(ServerMemberUnbanListener.class, listener);
    }

    default List<ServerMemberUnbanListener> getServerMemberUnbanListeners() {
        return this.getListeners(ServerMemberUnbanListener.class);
    }

    default ListenerManager<KnownCustomEmojiChangeNameListener> addKnownCustomEmojiChangeNameListener(KnownCustomEmojiChangeNameListener listener) {
        return this.addListener(KnownCustomEmojiChangeNameListener.class, listener);
    }

    default List<KnownCustomEmojiChangeNameListener> getKnownCustomEmojiChangeNameListeners() {
        return this.getListeners(KnownCustomEmojiChangeNameListener.class);
    }

    default ListenerManager<KnownCustomEmojiDeleteListener> addKnownCustomEmojiDeleteListener(KnownCustomEmojiDeleteListener listener) {
        return this.addListener(KnownCustomEmojiDeleteListener.class, listener);
    }

    default List<KnownCustomEmojiDeleteListener> getKnownCustomEmojiDeleteListeners() {
        return this.getListeners(KnownCustomEmojiDeleteListener.class);
    }

    default ListenerManager<KnownCustomEmojiChangeWhitelistedRolesListener> addKnownCustomEmojiChangeWhitelistedRolesListener(KnownCustomEmojiChangeWhitelistedRolesListener listener) {
        return this.addListener(KnownCustomEmojiChangeWhitelistedRolesListener.class, listener);
    }

    default List<KnownCustomEmojiChangeWhitelistedRolesListener> getKnownCustomEmojiChangeWhitelistedRolesListeners() {
        return this.getListeners(KnownCustomEmojiChangeWhitelistedRolesListener.class);
    }

    default ListenerManager<KnownCustomEmojiCreateListener> addKnownCustomEmojiCreateListener(KnownCustomEmojiCreateListener listener) {
        return this.addListener(KnownCustomEmojiCreateListener.class, listener);
    }

    default List<KnownCustomEmojiCreateListener> getKnownCustomEmojiCreateListeners() {
        return this.getListeners(KnownCustomEmojiCreateListener.class);
    }

    default ListenerManager<ServerChangeSystemChannelListener> addServerChangeSystemChannelListener(ServerChangeSystemChannelListener listener) {
        return this.addListener(ServerChangeSystemChannelListener.class, listener);
    }

    default List<ServerChangeSystemChannelListener> getServerChangeSystemChannelListeners() {
        return this.getListeners(ServerChangeSystemChannelListener.class);
    }

    default ListenerManager<ServerChangePreferredLocaleListener> addServerChangePreferredLocaleListener(ServerChangePreferredLocaleListener listener) {
        return this.addListener(ServerChangePreferredLocaleListener.class, listener);
    }

    default List<ServerChangePreferredLocaleListener> getServerChangePreferredLocaleListeners() {
        return this.getListeners(ServerChangePreferredLocaleListener.class);
    }

    default ListenerManager<ServerChangeBoostLevelListener> addServerChangeBoostLevelListener(ServerChangeBoostLevelListener listener) {
        return this.addListener(ServerChangeBoostLevelListener.class, listener);
    }

    default List<ServerChangeBoostLevelListener> getServerChangeBoostLevelListeners() {
        return this.getListeners(ServerChangeBoostLevelListener.class);
    }

    default ListenerManager<ServerChangeRulesChannelListener> addServerChangeRulesChannelListener(ServerChangeRulesChannelListener listener) {
        return this.addListener(ServerChangeRulesChannelListener.class, listener);
    }

    default List<ServerChangeRulesChannelListener> getServerChangeRulesChannelListeners() {
        return this.getListeners(ServerChangeRulesChannelListener.class);
    }

    default ListenerManager<ServerChangeServerFeatureListener> addServerChangeServerFeatureListener(ServerChangeServerFeatureListener listener) {
        return this.addListener(ServerChangeServerFeatureListener.class, listener);
    }

    default List<ServerChangeServerFeatureListener> getServerChangeServerFeatureListeners() {
        return this.getListeners(ServerChangeServerFeatureListener.class);
    }

    default ListenerManager<ServerChangeOwnerListener> addServerChangeOwnerListener(ServerChangeOwnerListener listener) {
        return this.addListener(ServerChangeOwnerListener.class, listener);
    }

    default List<ServerChangeOwnerListener> getServerChangeOwnerListeners() {
        return this.getListeners(ServerChangeOwnerListener.class);
    }

    default ListenerManager<ServerChangeMultiFactorAuthenticationLevelListener> addServerChangeMultiFactorAuthenticationLevelListener(ServerChangeMultiFactorAuthenticationLevelListener listener) {
        return this.addListener(ServerChangeMultiFactorAuthenticationLevelListener.class, listener);
    }

    default List<ServerChangeMultiFactorAuthenticationLevelListener> getServerChangeMultiFactorAuthenticationLevelListeners() {
        return this.getListeners(ServerChangeMultiFactorAuthenticationLevelListener.class);
    }

    default ListenerManager<ServerChangeExplicitContentFilterLevelListener> addServerChangeExplicitContentFilterLevelListener(ServerChangeExplicitContentFilterLevelListener listener) {
        return this.addListener(ServerChangeExplicitContentFilterLevelListener.class, listener);
    }

    default List<ServerChangeExplicitContentFilterLevelListener> getServerChangeExplicitContentFilterLevelListeners() {
        return this.getListeners(ServerChangeExplicitContentFilterLevelListener.class);
    }

    default ListenerManager<RoleChangePositionListener> addRoleChangePositionListener(RoleChangePositionListener listener) {
        return this.addListener(RoleChangePositionListener.class, listener);
    }

    default List<RoleChangePositionListener> getRoleChangePositionListeners() {
        return this.getListeners(RoleChangePositionListener.class);
    }

    default ListenerManager<RoleChangeMentionableListener> addRoleChangeMentionableListener(RoleChangeMentionableListener listener) {
        return this.addListener(RoleChangeMentionableListener.class, listener);
    }

    default List<RoleChangeMentionableListener> getRoleChangeMentionableListeners() {
        return this.getListeners(RoleChangeMentionableListener.class);
    }

    default ListenerManager<RoleChangeColorListener> addRoleChangeColorListener(RoleChangeColorListener listener) {
        return this.addListener(RoleChangeColorListener.class, listener);
    }

    default List<RoleChangeColorListener> getRoleChangeColorListeners() {
        return this.getListeners(RoleChangeColorListener.class);
    }

    default ListenerManager<RoleChangeNameListener> addRoleChangeNameListener(RoleChangeNameListener listener) {
        return this.addListener(RoleChangeNameListener.class, listener);
    }

    default List<RoleChangeNameListener> getRoleChangeNameListeners() {
        return this.getListeners(RoleChangeNameListener.class);
    }

    default ListenerManager<RoleChangeHoistListener> addRoleChangeHoistListener(RoleChangeHoistListener listener) {
        return this.addListener(RoleChangeHoistListener.class, listener);
    }

    default List<RoleChangeHoistListener> getRoleChangeHoistListeners() {
        return this.getListeners(RoleChangeHoistListener.class);
    }

    default ListenerManager<RoleCreateListener> addRoleCreateListener(RoleCreateListener listener) {
        return this.addListener(RoleCreateListener.class, listener);
    }

    default List<RoleCreateListener> getRoleCreateListeners() {
        return this.getListeners(RoleCreateListener.class);
    }

    default ListenerManager<RoleChangePermissionsListener> addRoleChangePermissionsListener(RoleChangePermissionsListener listener) {
        return this.addListener(RoleChangePermissionsListener.class, listener);
    }

    default List<RoleChangePermissionsListener> getRoleChangePermissionsListeners() {
        return this.getListeners(RoleChangePermissionsListener.class);
    }

    default ListenerManager<UserRoleRemoveListener> addUserRoleRemoveListener(UserRoleRemoveListener listener) {
        return this.addListener(UserRoleRemoveListener.class, listener);
    }

    default List<UserRoleRemoveListener> getUserRoleRemoveListeners() {
        return this.getListeners(UserRoleRemoveListener.class);
    }

    default ListenerManager<UserRoleAddListener> addUserRoleAddListener(UserRoleAddListener listener) {
        return this.addListener(UserRoleAddListener.class, listener);
    }

    default List<UserRoleAddListener> getUserRoleAddListeners() {
        return this.getListeners(UserRoleAddListener.class);
    }

    default ListenerManager<RoleDeleteListener> addRoleDeleteListener(RoleDeleteListener listener) {
        return this.addListener(RoleDeleteListener.class, listener);
    }

    default List<RoleDeleteListener> getRoleDeleteListeners() {
        return this.getListeners(RoleDeleteListener.class);
    }

    default ListenerManager<ServerChangeModeratorsOnlyChannelListener> addServerChangeModeratorsOnlyChannelListener(ServerChangeModeratorsOnlyChannelListener listener) {
        return this.addListener(ServerChangeModeratorsOnlyChannelListener.class, listener);
    }

    default List<ServerChangeModeratorsOnlyChannelListener> getServerChangeModeratorsOnlyChannelListeners() {
        return this.getListeners(ServerChangeModeratorsOnlyChannelListener.class);
    }

    default ListenerManager<ServerChangeNsfwLevelListener> addServerChangeNsfwLevelListener(ServerChangeNsfwLevelListener listener) {
        return this.addListener(ServerChangeNsfwLevelListener.class, listener);
    }

    default List<ServerChangeNsfwLevelListener> getServerChangeNsfwLevelListeners() {
        return this.getListeners(ServerChangeNsfwLevelListener.class);
    }

    default ListenerManager<ServerChannelChangePositionListener> addServerChannelChangePositionListener(ServerChannelChangePositionListener listener) {
        return this.addListener(ServerChannelChangePositionListener.class, listener);
    }

    default List<ServerChannelChangePositionListener> getServerChannelChangePositionListeners() {
        return this.getListeners(ServerChannelChangePositionListener.class);
    }

    default ListenerManager<ServerThreadListSyncListener> addServerThreadListSyncListener(ServerThreadListSyncListener listener) {
        return this.addListener(ServerThreadListSyncListener.class, listener);
    }

    default List<ServerThreadListSyncListener> getServerThreadListSyncListeners() {
        return this.getListeners(ServerThreadListSyncListener.class);
    }

    default ListenerManager<ServerThreadChannelUpdateListener> addServerThreadChannelUpdateListener(ServerThreadChannelUpdateListener listener) {
        return this.addListener(ServerThreadChannelUpdateListener.class, listener);
    }

    default List<ServerThreadChannelUpdateListener> getServerThreadChannelUpdateListeners() {
        return this.getListeners(ServerThreadChannelUpdateListener.class);
    }

    default ListenerManager<ServerThreadChannelMembersUpdateListener> addServerThreadChannelMembersUpdateListener(ServerThreadChannelMembersUpdateListener listener) {
        return this.addListener(ServerThreadChannelMembersUpdateListener.class, listener);
    }

    default List<ServerThreadChannelMembersUpdateListener> getServerThreadChannelMembersUpdateListeners() {
        return this.getListeners(ServerThreadChannelMembersUpdateListener.class);
    }

    default ListenerManager<ServerThreadChannelCreateListener> addServerThreadChannelCreateListener(ServerThreadChannelCreateListener listener) {
        return this.addListener(ServerThreadChannelCreateListener.class, listener);
    }

    default List<ServerThreadChannelCreateListener> getServerThreadChannelCreateListeners() {
        return this.getListeners(ServerThreadChannelCreateListener.class);
    }

    default ListenerManager<ServerThreadChannelDeleteListener> addServerThreadChannelDeleteListener(ServerThreadChannelDeleteListener listener) {
        return this.addListener(ServerThreadChannelDeleteListener.class, listener);
    }

    default List<ServerThreadChannelDeleteListener> getServerThreadChannelDeleteListeners() {
        return this.getListeners(ServerThreadChannelDeleteListener.class);
    }

    default ListenerManager<WebhooksUpdateListener> addWebhooksUpdateListener(WebhooksUpdateListener listener) {
        return this.addListener(WebhooksUpdateListener.class, listener);
    }

    default List<WebhooksUpdateListener> getWebhooksUpdateListeners() {
        return this.getListeners(WebhooksUpdateListener.class);
    }

    default ListenerManager<ServerTextChannelChangeDefaultAutoArchiveDurationListener> addServerTextChannelChangeDefaultAutoArchiveDurationListener(ServerTextChannelChangeDefaultAutoArchiveDurationListener listener) {
        return this.addListener(ServerTextChannelChangeDefaultAutoArchiveDurationListener.class, listener);
    }

    default List<ServerTextChannelChangeDefaultAutoArchiveDurationListener> getServerTextChannelChangeDefaultAutoArchiveDurationListeners() {
        return this.getListeners(ServerTextChannelChangeDefaultAutoArchiveDurationListener.class);
    }

    default ListenerManager<ServerTextChannelChangeSlowmodeListener> addServerTextChannelChangeSlowmodeListener(ServerTextChannelChangeSlowmodeListener listener) {
        return this.addListener(ServerTextChannelChangeSlowmodeListener.class, listener);
    }

    default List<ServerTextChannelChangeSlowmodeListener> getServerTextChannelChangeSlowmodeListeners() {
        return this.getListeners(ServerTextChannelChangeSlowmodeListener.class);
    }

    default ListenerManager<ServerTextChannelChangeTopicListener> addServerTextChannelChangeTopicListener(ServerTextChannelChangeTopicListener listener) {
        return this.addListener(ServerTextChannelChangeTopicListener.class, listener);
    }

    default List<ServerTextChannelChangeTopicListener> getServerTextChannelChangeTopicListeners() {
        return this.getListeners(ServerTextChannelChangeTopicListener.class);
    }

    default ListenerManager<ServerChannelChangeOverwrittenPermissionsListener> addServerChannelChangeOverwrittenPermissionsListener(ServerChannelChangeOverwrittenPermissionsListener listener) {
        return this.addListener(ServerChannelChangeOverwrittenPermissionsListener.class, listener);
    }

    default List<ServerChannelChangeOverwrittenPermissionsListener> getServerChannelChangeOverwrittenPermissionsListeners() {
        return this.getListeners(ServerChannelChangeOverwrittenPermissionsListener.class);
    }

    default ListenerManager<ServerChannelInviteDeleteListener> addServerChannelInviteDeleteListener(ServerChannelInviteDeleteListener listener) {
        return this.addListener(ServerChannelInviteDeleteListener.class, listener);
    }

    default List<ServerChannelInviteDeleteListener> getServerChannelInviteDeleteListeners() {
        return this.getListeners(ServerChannelInviteDeleteListener.class);
    }

    default ListenerManager<ServerChannelInviteCreateListener> addServerChannelInviteCreateListener(ServerChannelInviteCreateListener listener) {
        return this.addListener(ServerChannelInviteCreateListener.class, listener);
    }

    default List<ServerChannelInviteCreateListener> getServerChannelInviteCreateListeners() {
        return this.getListeners(ServerChannelInviteCreateListener.class);
    }

    default ListenerManager<ServerChannelChangeNsfwFlagListener> addServerChannelChangeNsfwFlagListener(ServerChannelChangeNsfwFlagListener listener) {
        return this.addListener(ServerChannelChangeNsfwFlagListener.class, listener);
    }

    default List<ServerChannelChangeNsfwFlagListener> getServerChannelChangeNsfwFlagListeners() {
        return this.getListeners(ServerChannelChangeNsfwFlagListener.class);
    }

    default ListenerManager<ServerChannelDeleteListener> addServerChannelDeleteListener(ServerChannelDeleteListener listener) {
        return this.addListener(ServerChannelDeleteListener.class, listener);
    }

    default List<ServerChannelDeleteListener> getServerChannelDeleteListeners() {
        return this.getListeners(ServerChannelDeleteListener.class);
    }

    default ListenerManager<ServerChannelCreateListener> addServerChannelCreateListener(ServerChannelCreateListener listener) {
        return this.addListener(ServerChannelCreateListener.class, listener);
    }

    default List<ServerChannelCreateListener> getServerChannelCreateListeners() {
        return this.getListeners(ServerChannelCreateListener.class);
    }

    default ListenerManager<ServerStageVoiceChannelChangeTopicListener> addServerStageVoiceChannelChangeTopicListener(ServerStageVoiceChannelChangeTopicListener listener) {
        return this.addListener(ServerStageVoiceChannelChangeTopicListener.class, listener);
    }

    default List<ServerStageVoiceChannelChangeTopicListener> getServerStageVoiceChannelChangeTopicListeners() {
        return this.getListeners(ServerStageVoiceChannelChangeTopicListener.class);
    }

    default ListenerManager<ServerVoiceChannelChangeBitrateListener> addServerVoiceChannelChangeBitrateListener(ServerVoiceChannelChangeBitrateListener listener) {
        return this.addListener(ServerVoiceChannelChangeBitrateListener.class, listener);
    }

    default List<ServerVoiceChannelChangeBitrateListener> getServerVoiceChannelChangeBitrateListeners() {
        return this.getListeners(ServerVoiceChannelChangeBitrateListener.class);
    }

    default ListenerManager<ServerVoiceChannelChangeUserLimitListener> addServerVoiceChannelChangeUserLimitListener(ServerVoiceChannelChangeUserLimitListener listener) {
        return this.addListener(ServerVoiceChannelChangeUserLimitListener.class, listener);
    }

    default List<ServerVoiceChannelChangeUserLimitListener> getServerVoiceChannelChangeUserLimitListeners() {
        return this.getListeners(ServerVoiceChannelChangeUserLimitListener.class);
    }

    default ListenerManager<ServerVoiceChannelMemberLeaveListener> addServerVoiceChannelMemberLeaveListener(ServerVoiceChannelMemberLeaveListener listener) {
        return this.addListener(ServerVoiceChannelMemberLeaveListener.class, listener);
    }

    default List<ServerVoiceChannelMemberLeaveListener> getServerVoiceChannelMemberLeaveListeners() {
        return this.getListeners(ServerVoiceChannelMemberLeaveListener.class);
    }

    default ListenerManager<ServerVoiceChannelChangeNsfwListener> addServerVoiceChannelChangeNsfwListener(ServerVoiceChannelChangeNsfwListener listener) {
        return this.addListener(ServerVoiceChannelChangeNsfwListener.class, listener);
    }

    default List<ServerVoiceChannelChangeNsfwListener> getServerVoiceChannelChangeNsfwListeners() {
        return this.getListeners(ServerVoiceChannelChangeNsfwListener.class);
    }

    default ListenerManager<ServerVoiceChannelMemberJoinListener> addServerVoiceChannelMemberJoinListener(ServerVoiceChannelMemberJoinListener listener) {
        return this.addListener(ServerVoiceChannelMemberJoinListener.class, listener);
    }

    default List<ServerVoiceChannelMemberJoinListener> getServerVoiceChannelMemberJoinListeners() {
        return this.getListeners(ServerVoiceChannelMemberJoinListener.class);
    }

    default ListenerManager<ServerChannelChangeNameListener> addServerChannelChangeNameListener(ServerChannelChangeNameListener listener) {
        return this.addListener(ServerChannelChangeNameListener.class, listener);
    }

    default List<ServerChannelChangeNameListener> getServerChannelChangeNameListeners() {
        return this.getListeners(ServerChannelChangeNameListener.class);
    }

    default ListenerManager<PrivateChannelDeleteListener> addPrivateChannelDeleteListener(PrivateChannelDeleteListener listener) {
        return this.addListener(PrivateChannelDeleteListener.class, listener);
    }

    default List<PrivateChannelDeleteListener> getPrivateChannelDeleteListeners() {
        return this.getListeners(PrivateChannelDeleteListener.class);
    }

    default ListenerManager<PrivateChannelCreateListener> addPrivateChannelCreateListener(PrivateChannelCreateListener listener) {
        return this.addListener(PrivateChannelCreateListener.class, listener);
    }

    default List<PrivateChannelCreateListener> getPrivateChannelCreateListeners() {
        return this.getListeners(PrivateChannelCreateListener.class);
    }

    default ListenerManager<AudioSourceFinishedListener> addAudioSourceFinishedListener(AudioSourceFinishedListener listener) {
        return this.addListener(AudioSourceFinishedListener.class, listener);
    }

    default List<AudioSourceFinishedListener> getAudioSourceFinishedListeners() {
        return this.getListeners(AudioSourceFinishedListener.class);
    }

    default ListenerManager<UserChangeDeafenedListener> addUserChangeDeafenedListener(UserChangeDeafenedListener listener) {
        return this.addListener(UserChangeDeafenedListener.class, listener);
    }

    default List<UserChangeDeafenedListener> getUserChangeDeafenedListeners() {
        return this.getListeners(UserChangeDeafenedListener.class);
    }

    default ListenerManager<UserChangeNicknameListener> addUserChangeNicknameListener(UserChangeNicknameListener listener) {
        return this.addListener(UserChangeNicknameListener.class, listener);
    }

    default List<UserChangeNicknameListener> getUserChangeNicknameListeners() {
        return this.getListeners(UserChangeNicknameListener.class);
    }

    default ListenerManager<UserChangePendingListener> addUserChangePendingListener(UserChangePendingListener listener) {
        return this.addListener(UserChangePendingListener.class, listener);
    }

    default List<UserChangePendingListener> getUserChangePendingListeners() {
        return this.getListeners(UserChangePendingListener.class);
    }

    default ListenerManager<UserStartTypingListener> addUserStartTypingListener(UserStartTypingListener listener) {
        return this.addListener(UserStartTypingListener.class, listener);
    }

    default List<UserStartTypingListener> getUserStartTypingListeners() {
        return this.getListeners(UserStartTypingListener.class);
    }

    default ListenerManager<UserChangeDiscriminatorListener> addUserChangeDiscriminatorListener(UserChangeDiscriminatorListener listener) {
        return this.addListener(UserChangeDiscriminatorListener.class, listener);
    }

    default List<UserChangeDiscriminatorListener> getUserChangeDiscriminatorListeners() {
        return this.getListeners(UserChangeDiscriminatorListener.class);
    }

    default ListenerManager<UserChangeStatusListener> addUserChangeStatusListener(UserChangeStatusListener listener) {
        return this.addListener(UserChangeStatusListener.class, listener);
    }

    default List<UserChangeStatusListener> getUserChangeStatusListeners() {
        return this.getListeners(UserChangeStatusListener.class);
    }

    default ListenerManager<UserChangeServerAvatarListener> addUserChangeServerAvatarListener(UserChangeServerAvatarListener listener) {
        return this.addListener(UserChangeServerAvatarListener.class, listener);
    }

    default List<UserChangeServerAvatarListener> getUserChangeServerAvatarListeners() {
        return this.getListeners(UserChangeServerAvatarListener.class);
    }

    default ListenerManager<UserChangeSelfMutedListener> addUserChangeSelfMutedListener(UserChangeSelfMutedListener listener) {
        return this.addListener(UserChangeSelfMutedListener.class, listener);
    }

    default List<UserChangeSelfMutedListener> getUserChangeSelfMutedListeners() {
        return this.getListeners(UserChangeSelfMutedListener.class);
    }

    default ListenerManager<UserChangeNameListener> addUserChangeNameListener(UserChangeNameListener listener) {
        return this.addListener(UserChangeNameListener.class, listener);
    }

    default List<UserChangeNameListener> getUserChangeNameListeners() {
        return this.getListeners(UserChangeNameListener.class);
    }

    default ListenerManager<UserChangeTimeoutListener> addUserChangeTimeoutListener(UserChangeTimeoutListener listener) {
        return this.addListener(UserChangeTimeoutListener.class, listener);
    }

    default List<UserChangeTimeoutListener> getUserChangeTimeoutListeners() {
        return this.getListeners(UserChangeTimeoutListener.class);
    }

    default ListenerManager<UserChangeAvatarListener> addUserChangeAvatarListener(UserChangeAvatarListener listener) {
        return this.addListener(UserChangeAvatarListener.class, listener);
    }

    default List<UserChangeAvatarListener> getUserChangeAvatarListeners() {
        return this.getListeners(UserChangeAvatarListener.class);
    }

    default ListenerManager<UserChangeSelfDeafenedListener> addUserChangeSelfDeafenedListener(UserChangeSelfDeafenedListener listener) {
        return this.addListener(UserChangeSelfDeafenedListener.class, listener);
    }

    default List<UserChangeSelfDeafenedListener> getUserChangeSelfDeafenedListeners() {
        return this.getListeners(UserChangeSelfDeafenedListener.class);
    }

    default ListenerManager<UserChangeMutedListener> addUserChangeMutedListener(UserChangeMutedListener listener) {
        return this.addListener(UserChangeMutedListener.class, listener);
    }

    default List<UserChangeMutedListener> getUserChangeMutedListeners() {
        return this.getListeners(UserChangeMutedListener.class);
    }

    default ListenerManager<UserChangeActivityListener> addUserChangeActivityListener(UserChangeActivityListener listener) {
        return this.addListener(UserChangeActivityListener.class, listener);
    }

    default List<UserChangeActivityListener> getUserChangeActivityListeners() {
        return this.getListeners(UserChangeActivityListener.class);
    }

    default ListenerManager<MessageEditListener> addMessageEditListener(MessageEditListener listener) {
        return this.addListener(MessageEditListener.class, listener);
    }

    default List<MessageEditListener> getMessageEditListeners() {
        return this.getListeners(MessageEditListener.class);
    }

    default ListenerManager<ChannelPinsUpdateListener> addChannelPinsUpdateListener(ChannelPinsUpdateListener listener) {
        return this.addListener(ChannelPinsUpdateListener.class, listener);
    }

    default List<ChannelPinsUpdateListener> getChannelPinsUpdateListeners() {
        return this.getListeners(ChannelPinsUpdateListener.class);
    }

    default ListenerManager<ReactionRemoveListener> addReactionRemoveListener(ReactionRemoveListener listener) {
        return this.addListener(ReactionRemoveListener.class, listener);
    }

    default List<ReactionRemoveListener> getReactionRemoveListeners() {
        return this.getListeners(ReactionRemoveListener.class);
    }

    default ListenerManager<ReactionAddListener> addReactionAddListener(ReactionAddListener listener) {
        return this.addListener(ReactionAddListener.class, listener);
    }

    default List<ReactionAddListener> getReactionAddListeners() {
        return this.getListeners(ReactionAddListener.class);
    }

    default ListenerManager<ReactionRemoveAllListener> addReactionRemoveAllListener(ReactionRemoveAllListener listener) {
        return this.addListener(ReactionRemoveAllListener.class, listener);
    }

    default List<ReactionRemoveAllListener> getReactionRemoveAllListeners() {
        return this.getListeners(ReactionRemoveAllListener.class);
    }

    default ListenerManager<MessageCreateListener> addMessageCreateListener(MessageCreateListener listener) {
        return this.addListener(MessageCreateListener.class, listener);
    }

    default List<MessageCreateListener> getMessageCreateListeners() {
        return this.getListeners(MessageCreateListener.class);
    }

    default ListenerManager<CachedMessageUnpinListener> addCachedMessageUnpinListener(CachedMessageUnpinListener listener) {
        return this.addListener(CachedMessageUnpinListener.class, listener);
    }

    default List<CachedMessageUnpinListener> getCachedMessageUnpinListeners() {
        return this.getListeners(CachedMessageUnpinListener.class);
    }

    default ListenerManager<CachedMessagePinListener> addCachedMessagePinListener(CachedMessagePinListener listener) {
        return this.addListener(CachedMessagePinListener.class, listener);
    }

    default List<CachedMessagePinListener> getCachedMessagePinListeners() {
        return this.getListeners(CachedMessagePinListener.class);
    }

    default ListenerManager<MessageReplyListener> addMessageReplyListener(MessageReplyListener listener) {
        return this.addListener(MessageReplyListener.class, listener);
    }

    default List<MessageReplyListener> getMessageReplyListeners() {
        return this.getListeners(MessageReplyListener.class);
    }

    default ListenerManager<MessageDeleteListener> addMessageDeleteListener(MessageDeleteListener listener) {
        return this.addListener(MessageDeleteListener.class, listener);
    }

    default List<MessageDeleteListener> getMessageDeleteListeners() {
        return this.getListeners(MessageDeleteListener.class);
    }

    default ListenerManager<ResumeListener> addResumeListener(ResumeListener listener) {
        return this.addListener(ResumeListener.class, listener);
    }

    default List<ResumeListener> getResumeListeners() {
        return this.getListeners(ResumeListener.class);
    }

    default ListenerManager<LostConnectionListener> addLostConnectionListener(LostConnectionListener listener) {
        return this.addListener(LostConnectionListener.class, listener);
    }

    default List<LostConnectionListener> getLostConnectionListeners() {
        return this.getListeners(LostConnectionListener.class);
    }

    default ListenerManager<ReconnectListener> addReconnectListener(ReconnectListener listener) {
        return this.addListener(ReconnectListener.class, listener);
    }

    default List<ReconnectListener> getReconnectListeners() {
        return this.getListeners(ReconnectListener.class);
    }

    <T extends GloballyAttachableListener> ListenerManager<T> addListener(Class<T> var1, T var2);

    Collection<ListenerManager<? extends GloballyAttachableListener>> addListener(GloballyAttachableListener var1);

    void removeListener(GloballyAttachableListener var1);

    <T extends GloballyAttachableListener> void removeListener(Class<T> var1, T var2);

    <T extends GloballyAttachableListener> Map<T, List<Class<T>>> getListeners();

    <T extends GloballyAttachableListener> List<T> getListeners(Class<T> var1);
}
