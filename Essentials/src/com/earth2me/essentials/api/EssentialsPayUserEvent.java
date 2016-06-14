package com.earth2me.essentials.api;

import java.math.BigDecimal;

import com.earth2me.essentials.Trade;
import com.earth2me.essentials.signs.EssentialsSign.ISign.SignType;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class EssentialsPayUserEvent extends Event implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	private Trade trade;
	private BigDecimal money = null;
	private ItemStack itemStack = null;
	private Integer exp = null;
	private boolean cancelled;
	
	public EssentialsPayUserEvent(Trade trade) {
		this.trade = trade;
		this.money = trade.getMoney();
		this.itemStack = trade.getItemStack();
		this.exp = trade.getExperience();
	}
	
	public ItemStack getItemStack() {
		return this.itemStack;
	}
	
	public void setItemStack(ItemStack itemStack) {
		this.itemStack = itemStack;
	}
	
	public BigDecimal getMoney() {
		return this.money;
	}
	
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
	public Integer getExperience() {
		return this.exp;
	}
	
	public void setExperience(Integer exp) {
		this.exp = exp;
	}
	
	public Trade getTrade() {
		return this.trade;
	}
	
	public SignType getSignType() {
		return this.trade.getSign().getType();
	}
	
	public boolean isCancelled() {
		return this.cancelled;
	}
	
	public void setCancelled(boolean cancel) {
		this.cancelled = cancel;
	}
	
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
}
