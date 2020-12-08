package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador219")
public class Somador219 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
