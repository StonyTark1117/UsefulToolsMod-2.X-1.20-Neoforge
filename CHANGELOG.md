# Changelog

## 2.2.2-1.20.2-neoforge

Parity sync with the 2.2.2 releases of the other variants. All fixes mirror the Fabric/NeoForge 1.21.1 versions, adapted to the 1.20.2-NeoForge codebase.

### Fixed
- **Spectral / Spectral-Infused armor mix-and-match** — wearing a mix of native Spectral armor and ectoplasm-infused pieces now correctly hides the player from Ghosts. Previously the check was either-or (4 native or 4 infused), so any mixed loadout failed both branches and Ghosts could still see the player. (`EctoplasmArmorHelper.isGhostInvisible`)
- **Spectral-Infused armor tooltip** — infused armor incorrectly showed "Can damage Ghosts". Armor doesn't damage Ghosts; tools/weapons do. Infused armor now reads "Full Set: Hides you from Ghosts" in DARK_GREEN; the damage line stays on tools and weapons. (new lang key `tooltip.usefultoolsmod.ecto_armor_invisibility`)
- **Full-set tooltip clarity** — both Spectral armor lines (`ecto_armor_invisibility`, `ecto_ghost_avoid`) now lead with "Full Set:" and use DARK_GREEN, matching the styling of other set-bonus tooltips (`cake_full_set`, `pprism_full_set`, `ecto_wall_phase`). The 4-piece requirement is now visible at a glance.
- **Ghost spawn egg ignores config rate** — using a Ghost Spawn Egg (or `/summon`, breeding, dispenser) only succeeded at the configured natural-spawn rate (~15% by default) because `MobSpawnEvent.FinalizeSpawn` was applying the rate gate to every spawn type. The rate now only applies to natural-style spawns (NATURAL/CHUNK_GENERATION/SPAWNER/STRUCTURE/PATROL); spawn eggs and commands always succeed. The kill-switch (`ghostEnabled = false`) still cancels on finalize regardless of spawn type. (`ModEvents.onFinalizeSpawn`)

## 2.2.1-1.20.2-neoforge

Initial NeoForge 1.20.2 release, ported from the Forge 1.20.1 / Fabric 1.20.1 / Forge 1.21.1 sources. Feature parity with the other 2.2.1 variants.

### Compatibility

- Minecraft 1.20.2
- NeoForge 20.2.x

### Optional integrations

- REI 12.x — Spectral Infuser recipe category (JEI does not ship a NeoForge 1.20.2 build)
- Jade 12.4.0+ — Ghost ectoplasm armor info, Spectral Infuser progress (WTHIT is not officially compatible with NeoForge 1.20.2)
- Cloth Config 12.0.111+ — In-game config screen
