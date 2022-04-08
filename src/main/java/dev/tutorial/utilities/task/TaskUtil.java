package dev.tutorial.utilities.task;

import dev.tutorial.Tutorial;
import lombok.experimental.UtilityClass;
import org.bukkit.scheduler.BukkitRunnable;

@UtilityClass
public class TaskUtil {

    public void run(Runnable runnable) {
        Tutorial.get().getServer().getScheduler().runTask(Tutorial.get(), runnable);
    }

    public void runTimer(Runnable runnable, long delay, long timer) {
        Tutorial.get().getServer().getScheduler().runTaskTimer(Tutorial.get(), runnable, delay, timer);
    }

    public void runTimer(BukkitRunnable runnable, long delay, long timer) {
        runnable.runTaskTimer(Tutorial.get(), delay, timer);
    }

    public void runTimerAsync(Runnable runnable, long delay, long timer) {
        Tutorial.get().getServer().getScheduler().runTaskTimerAsynchronously(Tutorial.get(), runnable, delay, timer);
    }

    public void runTimerAsync(BukkitRunnable runnable, long delay, long timer) {
        runnable.runTaskTimerAsynchronously(Tutorial.get(), delay, timer);
    }

    public void runLater(Runnable runnable, long delay) {
        Tutorial.get().getServer().getScheduler().runTaskLater(Tutorial.get(), runnable, delay);
    }

    public void runLaterAsync(Runnable runnable, long delay) {
        try {
            Tutorial.get().getServer().getScheduler().runTaskLaterAsynchronously(Tutorial.get(), runnable, delay);
        } catch (IllegalStateException e) {
            Tutorial.get().getServer().getScheduler().runTaskLater(Tutorial.get(), runnable, delay);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void runTaskTimerAsynchronously(Runnable runnable, int delay) {
        try {
            Tutorial.get().getServer().getScheduler().runTaskTimerAsynchronously(Tutorial.get(), runnable, 20L * delay, 20L * delay);
        } catch (IllegalStateException e) {
            Tutorial.get().getServer().getScheduler().runTaskTimer(Tutorial.get(), runnable, 20L * delay, 20L * delay);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void runAsync(Runnable runnable) {
        try {
            Tutorial.get().getServer().getScheduler().runTaskAsynchronously(Tutorial.get(), runnable);
        } catch (IllegalStateException e) {
            Tutorial.get().getServer().getScheduler().runTask(Tutorial.get(), runnable);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}