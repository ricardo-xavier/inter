package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador315")
public class Somador315 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
