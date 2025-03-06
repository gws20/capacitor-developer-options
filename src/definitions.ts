export interface DeveloperOptionsPlugin {
  isDeveloperOptionsEnabled(): Promise<{ enabled: boolean }>;
}
