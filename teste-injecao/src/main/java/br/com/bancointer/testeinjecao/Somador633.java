package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador633")
public class Somador633 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
