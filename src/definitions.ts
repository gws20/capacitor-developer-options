export interface DeveloperOptionsPlugin {
  isDeveloperOptionsEnabled(): Promise<{ enabled: boolean }>;
  openDeveloperOptions(): Promise<void>;
}
